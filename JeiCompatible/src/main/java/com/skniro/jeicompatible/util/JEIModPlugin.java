package com.skniro.jeicompatible.util;

import com.skniro.growableores.block.GrowableICOresBlocks;
import com.skniro.jeicompatible.JeiCompatible;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.runtime.IJeiRuntime;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

@JeiPlugin
public class JEIModPlugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(JeiCompatible.MOD_ID, "jei_plugin");
    }

    @Override
    public void onRuntimeAvailable(@NotNull final IJeiRuntime jeiRuntime) {

        List<ItemStack> itemsToBeHidden = new ArrayList<ItemStack>();
        jeiRuntime.getIngredientManager().getAllIngredients(VanillaTypes.ITEM_STACK).forEach(item -> {
            if(item.getItem().toString().contains("growableores"))
                itemsToBeHidden.add(item);
        });
        if (!itemsToBeHidden.isEmpty()) {
            jeiRuntime.getIngredientManager().removeIngredientsAtRuntime(VanillaTypes.ITEM_STACK, itemsToBeHidden);
        }
    }
}
