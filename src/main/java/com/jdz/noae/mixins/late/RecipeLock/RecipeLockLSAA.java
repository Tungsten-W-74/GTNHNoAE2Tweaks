package com.jdz.noae.mixins.late.RecipeLock;

import org.spongepowered.asm.mixin.Mixin;

import gtPlusPlus.xmod.gregtech.common.tileentities.machines.multi.production.MTEAutoCrafter;

@Mixin(MTEAutoCrafter.class)
public class RecipeLockLSAA {

    public boolean supportsSingleRecipeLocking() {
        return true;
    }
}
