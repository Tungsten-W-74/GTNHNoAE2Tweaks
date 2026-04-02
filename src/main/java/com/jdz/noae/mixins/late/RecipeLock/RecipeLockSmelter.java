package com.jdz.noae.mixins.late.RecipeLock;

import org.spongepowered.asm.mixin.Mixin;

import gregtech.common.tileentities.machines.multi.MTEMultiFurnace;

@Mixin(MTEMultiFurnace.class)
public class RecipeLockSmelter {

    public boolean supportsSingleRecipeLocking() {
        return true;
    }
}
