package com.jdz.noae.mixins.late.RecipeLock;

import org.spongepowered.asm.mixin.Mixin;

import gregtech.common.tileentities.machines.multi.MTESolarFactory;

@Mixin(MTESolarFactory.class)
public class RecipeLockSolarFactory {

    public boolean supportsSingleRecipeLocking() {
        return true;
    }
}
