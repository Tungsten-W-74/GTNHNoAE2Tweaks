package com.jdz.noae;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class Config {

    public static boolean DisableAE = false;
    public static boolean MoreInputSeparation = true;
    public static boolean MoreRecipeLocking = true;
    public static boolean AALLIB = true;
    public static boolean NoAEEOH = true;
    public static boolean NoAEGorge = true;
    public static boolean InfiniteOutputHatch = true;

    public static void load(File file) {
        Configuration configuration = new Configuration(file);

        DisableAE = configuration.getBoolean(
            "DisableAE",
            Configuration.CATEGORY_GENERAL,
            DisableAE,
            "Disable AE networks from doing anything");
        MoreInputSeparation = configuration.getBoolean(
            "MoreInputSeparation",
            Configuration.CATEGORY_GENERAL,
            MoreInputSeparation,
            "Enables the input separation button for more multis. When applied to existing saves it will be on by default.");
        MoreRecipeLocking = configuration.getBoolean(
            "MoreInputSeparation",
            Configuration.CATEGORY_GENERAL,
            MoreRecipeLocking,
            "Enables the input separation button for more multis. When applied to existing saves it will be on by default.");
        AALLIB = configuration.getBoolean(
            "AALLIB",
            Configuration.CATEGORY_GENERAL,
            AALLIB,
            "Makes Advanced Assembly Lines accept and work with Linked Input Busses");
        NoAEEOH = configuration.getBoolean(
            "NoAEEOH",
            Configuration.CATEGORY_GENERAL,
            NoAEEOH,
            "Makes the EOH accept any number of regular output hatches");
        NoAEGorge = configuration.getBoolean(
            "NoAEGorge",
            Configuration.CATEGORY_GENERAL,
            NoAEGorge,
            "Makes the main Gorge structure form with a regular output bus");
        InfiniteOutputHatch = configuration.getBoolean(
            "InfiniteOutputHatch",
            Configuration.CATEGORY_GENERAL,
            InfiniteOutputHatch,
            "Adds a UXV-gated output hatch with infinite capacity.");

        configuration.save();
    }
}
