package com.jdz.noae.mixins.late.RecipeLock;

import org.spongepowered.asm.mixin.Mixin;

import gtPlusPlus.xmod.gregtech.common.tileentities.machines.multi.processing.MTEIndustrialMixer;

@Mixin(MTEIndustrialMixer.class)
public class RecipeLockMixer {

    public boolean supportsSingleRecipeLocking() {
        return true;
    }
}
