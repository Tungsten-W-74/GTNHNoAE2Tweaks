package com.jdz.noae.common.loaders;

import net.minecraft.item.ItemStack;

import com.jdz.noae.common.tileentities.MTEHatchOutputUltimate;

public class ItemRegistry {

    public static ItemStack Hatch_Output_Ultimate;

    public static void run() {
        ItemRegistry.Hatch_Output_Ultimate = new MTEHatchOutputUltimate().getStackForm(1L);
    }
}
