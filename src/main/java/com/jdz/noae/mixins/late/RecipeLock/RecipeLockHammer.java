package com.jdz.noae.mixins.late.RecipeLock;

import org.spongepowered.asm.mixin.Mixin;

import gtPlusPlus.xmod.gregtech.common.tileentities.machines.multi.processing.MTEIndustrialForgeHammer;

@Mixin(MTEIndustrialForgeHammer.class)
public class RecipeLockHammer {

    public boolean supportsSingleRecipeLocking() {
        return true;
    }
}
