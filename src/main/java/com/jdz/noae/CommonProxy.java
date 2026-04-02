package com.jdz.noae;

import com.jdz.noae.common.tileentities.MTEHatchOutputUltimate;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {
        Config.load(event.getSuggestedConfigurationFile());

        if (Config.InfiniteOutputHatch) {
            MTEHatchOutputUltimate.register();
        }
    }
}
