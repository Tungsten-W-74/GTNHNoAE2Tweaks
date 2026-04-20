package com.jdz.noae.mixins;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.annotation.Nonnull;

import com.gtnewhorizon.gtnhmixins.ILateMixinLoader;
import com.gtnewhorizon.gtnhmixins.LateMixin;
import com.jdz.noae.Config;

@LateMixin
public class LateMixinsLoader implements ILateMixinLoader {

    @Override
    public String getMixinConfig() {
        return "mixins.gtnhnoaetweaks.late.json";
    }

    @Nonnull
    @Override
    public List<String> getMixins(Set<String> loadedMods) {
        List<String> mixins = new ArrayList<>();

        if (Config.DisableAE) mixins.add("DisableAE");

        if (Config.AALLIB) mixins.add("LinkedInputBusAALCompat");

        if (Config.NoAEEOH) mixins.add("NoAEEOH");
        if (Config.NoAEGorge) mixins.add("NoAEGorge");

        if (Config.MoreInputSeparation) {
            mixins.add("InputSeparation.InputSeparationIndustrialPress");
            mixins.add("InputSeparation.InputSeparationPreciseAssembler");
            mixins.add("InputSeparation.InputSeparationZyngen");
            mixins.add("InputSeparation.InputSeparationBHC");
        }

        if (Config.MoreRecipeLocking) {
            mixins.add("RecipeLock.RecipeLockMaterialPress");
            mixins.add("RecipeLock.RecipeLockPreciseAssembler");
            mixins.add("RecipeLock.RecipeLockWiremill");
            mixins.add("RecipeLock.RecipeLockLSAA");
            mixins.add("RecipeLock.RecipeLockArcFurnace");
            mixins.add("RecipeLock.RecipeLockABS");
            mixins.add("RecipeLock.RecipeLockMABS");
            mixins.add("RecipeLock.RecipeLockMixer");
            mixins.add("RecipeLock.RecipeLockExtruder");
            mixins.add("RecipeLock.RecipeLockCutter");
            mixins.add("RecipeLock.RecipeLockMacerator");
            mixins.add("RecipeLock.RecipeLockWasher");
            mixins.add("RecipeLock.RecipeLockHammer");
            mixins.add("RecipeLock.RecipeLockImplosion");
            mixins.add("RecipeLock.RecipeLockImplosionAdv");
            mixins.add("RecipeLock.RecipeLockImplosionElectric");
            mixins.add("RecipeLock.RecipeLockZyngen");
            mixins.add("RecipeLock.RecipeLockSmelter");
            mixins.add("RecipeLock.RecipeLockCentrifuge");
            mixins.add("RecipeLock.RecipeLockDEFusionCrafter");
            mixins.add("RecipeLock.RecipeLockElectrolyzer");
            mixins.add("RecipeLock.RecipeLockMEBF");
            mixins.add("RecipeLock.RecipeLockMegaVac");
            mixins.add("RecipeLock.RecipeLockOreFactory");
            mixins.add("RecipeLock.RecipeLockSolarFactory");
            mixins.add("RecipeLock.RecipeLockVolcanus");
        }

        return mixins;
    }
}
