package com.jdz.noae.mixins.late.RecipeLock;

import org.spongepowered.asm.mixin.Mixin;

import gtPlusPlus.xmod.gregtech.common.tileentities.machines.multi.processing.MTEIndustrialCuttingMachine;

@Mixin(MTEIndustrialCuttingMachine.class)
public class RecipeLockCutter {

    public boolean supportsSingleRecipeLocking() {
        return true;
    }
}
