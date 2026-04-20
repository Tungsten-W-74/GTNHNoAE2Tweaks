package com.jdz.noae.mixins.late.RecipeLock;

import org.spongepowered.asm.mixin.Mixin;

import gregtech.common.tileentities.machines.multi.MTEIntegratedOreFactory;

@Mixin(MTEIntegratedOreFactory.class)
public class RecipeLockOreFactory {

    public boolean supportsSingleRecipeLocking() {
        return true;
    }
}
