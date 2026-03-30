package com.jdz.noae;

import com.jdz.noae.common.loaders.ItemRegistry;
import com.jdz.noae.common.loaders.RecipeLoader;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {
        Config.synchronizeConfiguration(event.getSuggestedConfigurationFile());
        ItemRegistry.run();
        RecipeLoader.run();
    }
}
