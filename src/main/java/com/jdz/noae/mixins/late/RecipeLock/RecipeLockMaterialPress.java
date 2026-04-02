package com.jdz.noae.mixins.late.RecipeLock;

import org.spongepowered.asm.mixin.Mixin;

import gtPlusPlus.xmod.gregtech.common.tileentities.machines.multi.processing.MTEIndustrialPlatePress;

@Mixin(MTEIndustrialPlatePress.class)
public class RecipeLockMaterialPress {

    public boolean supportsSingleRecipeLocking() {
        return true;
    }
}
