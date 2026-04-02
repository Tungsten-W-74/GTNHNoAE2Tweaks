package com.jdz.noae;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(
    modid = GTNHNoAETweaks.MODID,
    version = Tags.VERSION,
    name = "GTNHNoAETweaks",
    acceptedMinecraftVersions = "[1.7.10]",
    acceptableRemoteVersions = "*",
    dependencies = """
        required-after:gregtech;\
        required-after:ae2fc;""")
public class GTNHNoAETweaks {

    public static final String MODID = "gtnhnoaetweaks";

    @SidedProxy(clientSide = "com.jdz.noae.CommonProxy", serverSide = "com.jdz.noae.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }
}
