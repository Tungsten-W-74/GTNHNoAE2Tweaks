package com.jdz.noae.mixins.late.RecipeLock;

import org.spongepowered.asm.mixin.Mixin;

import kubatech.tileentity.gregtech.multiblock.MTEDEFusionCrafter;

@Mixin(MTEDEFusionCrafter.class)
public class RecipeLockDEFusionCrafter {

    public boolean supportsSingleRecipeLocking() {
        return true;
    }
}
