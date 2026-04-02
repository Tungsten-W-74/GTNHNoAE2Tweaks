package com.jdz.noae.mixins.late.RecipeLock;

import org.spongepowered.asm.mixin.Mixin;

import gtPlusPlus.xmod.gregtech.common.tileentities.machines.multi.processing.MTEIndustrialWireMill;

@Mixin(MTEIndustrialWireMill.class)
public class RecipeLockWiremill {

    public boolean supportsSingleRecipeLocking() {
        return true;
    }
}
