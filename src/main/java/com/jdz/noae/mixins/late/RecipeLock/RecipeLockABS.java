package com.jdz.noae.mixins.late.RecipeLock;

import org.spongepowered.asm.mixin.Mixin;

import gtPlusPlus.xmod.gregtech.common.tileentities.machines.multi.production.MTEAlloyBlastSmelter;

@Mixin(MTEAlloyBlastSmelter.class)
public class RecipeLockABS {

    public boolean supportsSingleRecipeLocking() {
        return true;
    }
}
