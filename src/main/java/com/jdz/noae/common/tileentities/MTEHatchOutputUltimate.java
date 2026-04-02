package com.jdz.noae.common.tileentities;

import static gregtech.api.recipe.RecipeMaps.assemblerRecipes;
import static gregtech.api.util.GTRecipeBuilder.INGOTS;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;

import java.util.Arrays;

import javax.annotation.Nonnull;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fluids.FluidStack;

import gregtech.api.enums.GTValues;
import gregtech.api.enums.ItemList;
import gregtech.api.enums.MaterialsUEVplus;
import gregtech.api.enums.TierEU;
import gregtech.api.interfaces.ITexture;
import gregtech.api.interfaces.tileentity.IGregTechTileEntity;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.implementations.MTEHatchOutput;
import gregtech.api.util.GTUtility;

public class MTEHatchOutputUltimate extends MTEHatchOutput {

    private long mBuffer = 0;
    private FluidStack mBufferFluid = null;

    public static final int ENTITY_ID = 32340;

    public static void register() {
        ItemStack instance = new MTEHatchOutputUltimate().getStackForm(1L);

        GTValues.RA.stdBuilder()
            .itemInputs(
                ItemList.Hatch_Output_UXV.get(1L),
                // ItemAndBlockHolder.SINGULARITY_CELL.stack(1),
                GTUtility.getIntegratedCircuit(17))
            .fluidInputs(MaterialsUEVplus.Universium.getMolten(4 * INGOTS))
            .itemOutputs(instance)
            .duration(1600 * SECONDS)
            .eut(TierEU.RECIPE_UXV)
            .addTo(assemblerRecipes);
    }

    public MTEHatchOutputUltimate() {
        super(ENTITY_ID, "Ultimate Output Hatch", "Ultimate Output Hatch", 13);
        this.mDescriptionArray[1] = "Capacity: " + EnumChatFormatting.BOLD
            + EnumChatFormatting.UNDERLINE
            + "Infinite"
            + EnumChatFormatting.RESET
            + EnumChatFormatting.GRAY
            + ". Only displays / exports "
            + GTUtility.formatNumbers(getCapacity())
            + "L at once.";
        this.mDescriptionArray[2] = "Must lock output to a specific fluid to function";
        this.mDescriptionArray[3] = "Voids all stored fluids on breaking or changing locked fluid";
    }

    public MTEHatchOutputUltimate(String aName, int aTier, String[] aDescription, ITexture[][][] aTextures) {
        super(aName, aTier, aDescription, aTextures);
    }

    @Override
    public MetaTileEntity newMetaEntity(IGregTechTileEntity aTileEntity) {
        return new MTEHatchOutputUltimate(mName, mTier, mDescriptionArray, mTextures);
    }

    @Override
    public int getCapacity() {
        return Integer.MAX_VALUE;
    }

    @Override
    public void onScrewdriverRightClick(ForgeDirection side, EntityPlayer aPlayer, float aX, float aY, float aZ,
        ItemStack aTool) {}

    @Override
    public void setLockedFluidName(String lockedFluidName) {
        super.setLockedFluidName(lockedFluidName);
        mBuffer = 0;
        mBufferFluid = null;
    }

    @Override
    public boolean canStoreFluid(@Nonnull FluidStack fluidStack) {
        if (!isFluidLocked() || lockedFluidName == null) return false;
        return fluidStack.getFluid()
            .getName()
            .equals(lockedFluidName);
    }

    public boolean fillBuffer(FluidStack aFluid, long amount) {
        if (!canStoreFluid(aFluid)) return false;

        if (mBufferFluid == null || !mBufferFluid.getFluid()
            .equals(aFluid.getFluid())) {
            mBufferFluid = new FluidStack(aFluid.getFluid(), Integer.MAX_VALUE);
        }

        mBuffer += amount;
        return true;
    }

    @Override
    public int fill(FluidStack aFluid, boolean doFill) {
        if (!canStoreFluid(aFluid)) return 0;

        if (mBufferFluid == null) {
            mBufferFluid = new FluidStack(aFluid.getFluid(), Integer.MAX_VALUE);
        }

        if (!doFill) return aFluid.amount;

        int overflow = aFluid.amount - super.fill(aFluid, true);
        mBuffer += overflow;

        return aFluid.amount;
    }

    @Override
    public void onPreTick(IGregTechTileEntity aBaseMetaTileEntity, long aTick) {
        if (mBufferFluid != null && mBuffer > 0) {
            FluidStack ghostStack = mBuffer >= Integer.MAX_VALUE ? mBufferFluid.copy()
                : new FluidStack(mBufferFluid, (int) mBuffer);

            int fill = super.fill(ghostStack, true);
            mBuffer -= fill;
        }

        super.onPreTick(aBaseMetaTileEntity, aTick);
    }

    @Override
    public void loadNBTData(NBTTagCompound aNBT) {
        super.loadNBTData(aNBT);
        mBuffer = aNBT.getLong("mBuffer");
    }

    @Override
    public void saveNBTData(NBTTagCompound aNBT) {
        super.saveNBTData(aNBT);
        aNBT.setLong("mBuffer", mBuffer);
    }

    @Override
    public String[] getInfoData() {
        String[] oldInfo = super.getInfoData();
        String[] info = Arrays.copyOf(oldInfo, oldInfo.length + 1);
        info[oldInfo.length] = EnumChatFormatting.GOLD + "Buffer: "
            + EnumChatFormatting.GREEN
            + GTUtility.formatNumbers(mBuffer)
            + "L";
        return info;
    }
}
