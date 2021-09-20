package com.fidgety.plantsplus;

import com.fidgety.plantsplus.item.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class mod_items {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, plants_plus.MODID);
    //Items
    public static final RegistryObject<Item> BANANA = ITEMS.register("banana", banana::new);
    public static final RegistryObject<Item> ENCHANTED_POTATO = ITEMS.register("enchanted_potato", enchanted_potato::new);
    public static final RegistryObject<Item> ENCHANTED_BAKED_POTATO = ITEMS.register("enchanted_baked_potato", enchanted_baked_potato::new);
    public static final RegistryObject<Item> STONE_POTATO = ITEMS.register("stone_potato", stone_potato::new);
    public static final RegistryObject<Item> IRON_POTATO = ITEMS.register("iron_potato", iron_potato::new);
    public static final RegistryObject<Item> GOLD_POTATO = ITEMS.register("gold_potato", gold_potato::new);
    public static final RegistryObject<Item> DIAMOND_POTATO = ITEMS.register("diamond_potato", diamond_potato::new);
    public static final RegistryObject<Item> NETHERITE_POTATO = ITEMS.register("netherite_potato", netherite_potato::new);
    public static final RegistryObject<Item> EMERALD_POTATO = ITEMS.register("emerald_potato", emerald_potato::new);
    public static final RegistryObject<Item> CONDENSED_EXPERIENCE = ITEMS.register("condensed_experience", condensed_experience::new);

    //BlockItems
    public static final RegistryObject<BlockItem> CONDENSED_EXPERIENCE_BLOCK = ITEMS.register("condensed_experience_block", () -> new BlockItem(mod_blocks.CONDENSED_EXPERIENCE_BLOCK.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
}