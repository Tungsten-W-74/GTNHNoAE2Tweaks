package com.jdz.noae.mixins.late.RecipeLock;

import org.spongepowered.asm.mixin.Mixin;

import gtPlusPlus.xmod.gregtech.common.tileentities.machines.multi.processing.MTEIndustrialExtruder;

@Mixin(MTEIndustrialExtruder.class)
public class RecipeLockExtruder {

    public boolean supportsSingleRecipeLocking() {
        return true;
    }
}
