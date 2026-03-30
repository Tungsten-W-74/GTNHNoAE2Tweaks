package com.jdz.noae.common.loaders;

import static gregtech.api.recipe.RecipeMaps.assemblerRecipes;
import static gregtech.api.util.GTRecipeBuilder.INGOTS;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;

import com.glodblock.github.loader.ItemAndBlockHolder;

import gregtech.api.enums.*;
import gregtech.api.util.GTUtility;

public class RecipeLoader {

    public static void run() {
        GTValues.RA.stdBuilder()
            .itemInputs(
                ItemList.Hatch_Output_UXV.get(1L),
                ItemAndBlockHolder.SINGULARITY_CELL.stack(1),
                GTUtility.getIntegratedCircuit(17))
            .fluidInputs(MaterialsUEVplus.Universium.getMolten(4 * INGOTS))
            .itemOutputs(ItemRegistry.Hatch_Output_Ultimate)
            .duration(1600 * SECONDS)
            .eut(TierEU.RECIPE_UXV)
            .addTo(assemblerRecipes);
    }
}
