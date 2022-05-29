package com.lil_fox.tutorialmod.init;

import com.lil_fox.tutorialmod.TutorialMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    // Items
    public static RegistryObject<Item> CITRINE_ITEM = ITEMS.register("citrine_item", () -> new Item(new Item.Properties().tab(CreativeTabInit.TUTORIAL_ITEMS_TAB)));

    //BlockItems
    public static final RegistryObject<Item> CITRINE_BLOCK = ITEMS.register("citrine_block", () -> new BlockItem(BlockInit.CITRINE_BLOCK.get(), new Item.Properties().tab(CreativeTabInit.TUTORIAL_ITEMS_TAB)));
}
