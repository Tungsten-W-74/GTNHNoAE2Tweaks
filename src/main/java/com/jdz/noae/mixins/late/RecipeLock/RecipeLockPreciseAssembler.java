package com.jdz.noae.mixins.late.RecipeLock;

import org.spongepowered.asm.mixin.Mixin;

import goodgenerator.blocks.tileEntity.MTEPreciseAssembler;

@Mixin(MTEPreciseAssembler.class)
public class RecipeLockPreciseAssembler {

    public boolean supportsSingleRecipeLocking() {
        return true;
    }
}
