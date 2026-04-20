package com.jdz.noae.mixins.late;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

import gregtech.common.tileentities.machines.multi.MTENanoForge;

@Mixin(MTENanoForge.class)
public class NanoForgeBusLimit {

    @Shadow(remap = false)
    private int casingAmount;

    private void onCasingAdded() {
        casingAmount++;
        if (casingAmount >= 2760) casingAmount = 2784;
    }
}
