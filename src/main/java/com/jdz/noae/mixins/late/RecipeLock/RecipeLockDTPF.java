package com.jdz.noae.mixins.late.RecipeLock;

import gregtech.common.tileentities.machines.multi.MTEPlasmaForge;
import gtPlusPlus.xmod.gregtech.common.tileentities.machines.multi.processing.MTEIndustrialAlloySmelter;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(MTEPlasmaForge.class)
public class RecipeLockDTPF {

    public boolean supportsSingleRecipeLocking() {
        return true;
    }
}
