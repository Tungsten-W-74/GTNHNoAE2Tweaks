package com.jdz.noae.mixins.late;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import appeng.me.cache.EnergyGridCache;

@Mixin(EnergyGridCache.class)
public class DisableAE {

    @Overwrite(remap = false)
    public void onUpdateTick() {}
}
