package com.jdz.noae.mixins.late.RecipeLock;

import org.spongepowered.asm.mixin.Mixin;

import gtPlusPlus.xmod.gregtech.common.tileentities.machines.multi.processing.MTEIndustrialWashPlant;

@Mixin(MTEIndustrialWashPlant.class)
public class RecipeLockWasher {

    public boolean supportsSingleRecipeLocking() {
        return true;
    }
}
