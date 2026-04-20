package com.jdz.noae.mixins.late.RecipeLock;

import org.spongepowered.asm.mixin.Mixin;

import bartworks.common.tileentities.multis.mega.MTEMegaBlastFurnace;

@Mixin(MTEMegaBlastFurnace.class)
public class RecipeLockMEBF {

    public boolean supportsSingleRecipeLocking() {
        return true;
    }
}
