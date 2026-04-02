package com.jdz.noae.mixins.late.RecipeLock;

import org.spongepowered.asm.mixin.Mixin;

import gtPlusPlus.xmod.gregtech.common.tileentities.machines.multi.processing.MTEIndustrialAlloySmelter;

@Mixin(MTEIndustrialAlloySmelter.class)
public class RecipeLockZyngen {

    public boolean supportsSingleRecipeLocking() {
        return true;
    }
}
