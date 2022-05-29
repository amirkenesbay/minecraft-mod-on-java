package com.lil_fox.tutorialmod.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.fmllegacy.RegistryObject;

public class CreativeTabInit {
    private static CreativeModeTab createTab(String label, RegistryObject iconItem){
        return new CreativeModeTab(label){
            @Override
            public ItemStack makeIcon(){
                return new ItemStack((ItemLike) iconItem.get());
            }
        };
    }

    public static final CreativeModeTab TUTORIAL_ITEMS_TAB = createTab("tutorial_items_tab", ItemInit.CITRINE_ITEM);
}
