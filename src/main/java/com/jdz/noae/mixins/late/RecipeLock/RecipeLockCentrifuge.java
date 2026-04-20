package com.jdz.noae.mixins.late.RecipeLock;

import org.spongepowered.asm.mixin.Mixin;

import gtPlusPlus.xmod.gregtech.common.tileentities.machines.multi.processing.MTEIndustrialCentrifuge;

@Mixin(MTEIndustrialCentrifuge.class)
public class RecipeLockCentrifuge {

    public boolean supportsSingleRecipeLocking() {
        return true;
    }
}
