package com.jdz.noae.mixins.late.RecipeLock;

import org.spongepowered.asm.mixin.Mixin;

import bartworks.common.tileentities.multis.mega.MTEMegaVacuumFreezer;

@Mixin(MTEMegaVacuumFreezer.class)
public class RecipeLockMegaVac {

    public boolean supportsSingleRecipeLocking() {
        return true;
    }
}
