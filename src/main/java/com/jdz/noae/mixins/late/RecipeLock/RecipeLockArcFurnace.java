package com.jdz.noae.mixins.late.RecipeLock;

import org.spongepowered.asm.mixin.Mixin;

import gtPlusPlus.xmod.gregtech.common.tileentities.machines.multi.processing.MTEIndustrialArcFurnace;

@Mixin(MTEIndustrialArcFurnace.class)
public class RecipeLockArcFurnace {

    public boolean supportsSingleRecipeLocking() {
        return true;
    }
}
