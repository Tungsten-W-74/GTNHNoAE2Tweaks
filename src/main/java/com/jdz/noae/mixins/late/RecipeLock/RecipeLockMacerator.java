package com.jdz.noae.mixins.late.RecipeLock;

import org.spongepowered.asm.mixin.Mixin;

import gtPlusPlus.xmod.gregtech.common.tileentities.machines.multi.processing.MTEIndustrialMacerator;

@Mixin(MTEIndustrialMacerator.class)
public class RecipeLockMacerator {

    public boolean supportsSingleRecipeLocking() {
        return true;
    }
}
