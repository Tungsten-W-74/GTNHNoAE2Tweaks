package com.jdz.noae.mixins.late.RecipeLock;

import org.spongepowered.asm.mixin.Mixin;

import gtPlusPlus.xmod.gregtech.common.tileentities.machines.multi.production.mega.MTEMegaAlloyBlastSmelter;

@Mixin(MTEMegaAlloyBlastSmelter.class)
public class RecipeLockMABS {

    public boolean supportsSingleRecipeLocking() {
        return true;
    }
}
