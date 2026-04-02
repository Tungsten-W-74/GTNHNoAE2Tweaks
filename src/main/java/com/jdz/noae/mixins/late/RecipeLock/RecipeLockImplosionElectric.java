package com.jdz.noae.mixins.late.RecipeLock;

import org.spongepowered.asm.mixin.Mixin;

import bartworks.common.tileentities.multis.MTEElectricImplosionCompressor;

@Mixin(MTEElectricImplosionCompressor.class)
public class RecipeLockImplosionElectric {

    public boolean supportsSingleRecipeLocking() {
        return true;
    }
}
