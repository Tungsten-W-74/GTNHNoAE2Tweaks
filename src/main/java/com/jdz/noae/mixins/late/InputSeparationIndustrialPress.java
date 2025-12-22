package com.jdz.noae.mixins.late;

/**
 * press
 * https://github.com/GTNewHorizons/GT5-Unofficial/blob/98d10bc4ab73ba6b0aa82760e73d687ed64de986/src/main/java/gtPlusPlus/xmod/gregtech/common/tileentities/machines/multi/processing/MTEIndustrialPlatePress.java#L53
 *
 * Prass
 *
 *
 * Mixer
 * https://github.com/GTNewHorizons/GT5-Unofficial/blob/98d10bc4ab73ba6b0aa82760e73d687ed64de986/src/main/java/gtPlusPlus/xmod/gregtech/common/tileentities/machines/multi/processing/MTEIndustrialMixer.java#L42
 *
 * EOH
 *
 *
 * Gorge
 *
 */

import net.minecraft.nbt.NBTTagCompound;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import gregtech.api.metatileentity.implementations.MTEMultiBlockBase;
import gtPlusPlus.xmod.gregtech.common.tileentities.machines.multi.processing.MTEIndustrialPlatePress;

@Mixin(MTEIndustrialPlatePress.class)
abstract class InputSeparationIndustrialPress extends MTEMultiBlockBase {

    public InputSeparationIndustrialPress(int aID, String aName, String aNameRegional) {
        super(aID, aName, aNameRegional);
    }

    public boolean supportsInputSeparation() {
        return true;
    }

    @Overwrite(remap = false)
    public boolean isInputSeparationEnabled() {
        return super.isInputSeparationEnabled();
    }

    @Overwrite(remap = false)
    public void loadNBTData(NBTTagCompound aNBT) {
        super.loadNBTData(aNBT);

        if (aNBT.hasKey("mFormingMode")) {
            machineMode = aNBT.getBoolean("mFormingMode") ? 1 : 0;
        }

        if (aNBT.hasKey(INPUT_SEPARATION_NBT_KEY)) {
            inputSeparation = aNBT.getBoolean(INPUT_SEPARATION_NBT_KEY);
        } else {
            inputSeparation = true;
        }
    }
}
