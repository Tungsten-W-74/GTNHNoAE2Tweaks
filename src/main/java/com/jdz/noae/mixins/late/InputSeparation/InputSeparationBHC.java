package com.jdz.noae.mixins.late.InputSeparation;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import gregtech.api.metatileentity.implementations.MTEMultiBlockBase;
import gregtech.common.tileentities.machines.multi.compressor.MTEBlackHoleCompressor;

@Mixin(MTEBlackHoleCompressor.class)
abstract class InputSeparationBHC extends MTEMultiBlockBase {

    public InputSeparationBHC(int aID, String aName, String aNameRegional) {
        super(aID, aName, aNameRegional);
    }

    public boolean supportsInputSeparation() {
        return true;
    }

    @Overwrite(remap = false)
    public boolean isInputSeparationEnabled() {
        return super.isInputSeparationEnabled();
    }
}
