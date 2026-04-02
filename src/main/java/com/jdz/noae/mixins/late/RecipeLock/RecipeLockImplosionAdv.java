package com.jdz.noae.mixins.late.RecipeLock;

import org.spongepowered.asm.mixin.Mixin;

import gtPlusPlus.xmod.gregtech.common.tileentities.machines.multi.processing.advanced.MTEAdvImplosionCompressor;

@Mixin(MTEAdvImplosionCompressor.class)
public class RecipeLockImplosionAdv {

    public boolean supportsSingleRecipeLocking() {
        return true;
    }
}
