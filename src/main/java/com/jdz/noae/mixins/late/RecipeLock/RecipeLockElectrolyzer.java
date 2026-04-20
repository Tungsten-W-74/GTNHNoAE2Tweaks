package com.jdz.noae.mixins.late.RecipeLock;

import org.spongepowered.asm.mixin.Mixin;

import gtPlusPlus.xmod.gregtech.common.tileentities.machines.multi.processing.MTEndustrialElectrolyzer;

@Mixin(MTEndustrialElectrolyzer.class)
public class RecipeLockElectrolyzer {

    public boolean supportsSingleRecipeLocking() {
        return true;
    }
}
