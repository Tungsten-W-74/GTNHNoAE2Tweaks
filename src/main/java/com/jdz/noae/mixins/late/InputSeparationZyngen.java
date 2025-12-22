package com.jdz.noae.mixins.late;

import net.minecraft.nbt.NBTTagCompound;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import gregtech.api.metatileentity.implementations.MTEMultiBlockBase;
import gtPlusPlus.xmod.gregtech.common.tileentities.machines.multi.processing.MTEIndustrialAlloySmelter;

@Mixin(MTEIndustrialAlloySmelter.class)
abstract class InputSeparationZyngen extends MTEMultiBlockBase {

    public InputSeparationZyngen(int aID, String aName, String aNameRegional) {
        super(aID, aName, aNameRegional);
    }

    public boolean supportsInputSeparation() {
        return true;
    }

    @Overwrite(remap = false)
    public boolean isInputSeparationEnabled() {
        return super.isInputSeparationEnabled();
    }

    @Override
    public void loadNBTData(NBTTagCompound aNBT) {
        super.loadNBTData(aNBT);

        if (aNBT.hasKey(INPUT_SEPARATION_NBT_KEY)) {
            inputSeparation = aNBT.getBoolean(INPUT_SEPARATION_NBT_KEY);
        } else {
            inputSeparation = true;
        }
    }
}
