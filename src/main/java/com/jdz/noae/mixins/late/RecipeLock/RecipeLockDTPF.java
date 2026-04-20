package com.jdz.noae.mixins.late.RecipeLock;

import org.spongepowered.asm.mixin.Mixin;

import gregtech.common.tileentities.machines.multi.MTEPlasmaForge;

@Mixin(MTEPlasmaForge.class)
public class RecipeLockDTPF {

    public boolean supportsSingleRecipeLocking() {
        return true;
    }
}
