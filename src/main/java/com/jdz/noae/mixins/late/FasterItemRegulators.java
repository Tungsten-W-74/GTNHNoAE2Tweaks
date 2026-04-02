package com.jdz.noae.mixins.late;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

import com.jdz.noae.Config;

import gregtech.api.interfaces.tileentity.IGregTechTileEntity;
import gregtech.api.metatileentity.implementations.MTEBuffer;

@Mixin(MTEBuffer.class)
public class FasterItemRegulators {

    @Shadow(remap = false)
    int mSuccess;

    @Shadow(remap = false)
    protected void handleRedstoneOutput(IGregTechTileEntity aBaseMetaTileEntity) {}

    @Shadow(remap = false)
    protected void moveItems(IGregTechTileEntity aBaseMetaTileEntity, long aTimer) {}

    public void onPostTick(IGregTechTileEntity aBaseMetaTileEntity, long aTimer) {
        if (aBaseMetaTileEntity.isAllowedToWork() && aBaseMetaTileEntity.isServerSide()
            && (aBaseMetaTileEntity.hasWorkJustBeenEnabled() || aBaseMetaTileEntity.hasInventoryBeenModified()
                || aTimer % Config.ItemRegulatorInterval == 0
                || mSuccess > 0)) {
            mSuccess--;

            moveItems(aBaseMetaTileEntity, aTimer);
            handleRedstoneOutput(aBaseMetaTileEntity);
        }
    }
}
