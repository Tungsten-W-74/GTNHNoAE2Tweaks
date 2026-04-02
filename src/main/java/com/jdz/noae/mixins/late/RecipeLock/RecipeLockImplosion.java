package com.jdz.noae.mixins.late.RecipeLock;

import org.spongepowered.asm.mixin.Mixin;

import gregtech.common.tileentities.machines.multi.MTEImplosionCompressor;

@Mixin(MTEImplosionCompressor.class)
public class RecipeLockImplosion {

    public boolean supportsSingleRecipeLocking() {
        return true;
    }
}
