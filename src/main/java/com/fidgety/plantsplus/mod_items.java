package com.fidgety.plantsplus;

import com.fidgety.plantsplus.item.banana;
import com.fidgety.plantsplus.item.enchanted_potato;
import com.fidgety.plantsplus.item.enchanted_baked_potato;
import com.fidgety.plantsplus.item.stone_potato;
import com.fidgety.plantsplus.item.iron_potato;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class mod_items {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, plants_plus.MODID);
    public static final RegistryObject<Item> BANANA = ITEMS.register("banana", banana::new);
    public static final RegistryObject<Item> ENCHANTED_POTATO = ITEMS.register("enchanted_potato", enchanted_potato::new);
    public static final RegistryObject<Item> ENCHANTED_BAKED_POTATO = ITEMS.register("enchanted_baked_potato", enchanted_baked_potato::new);
    public static final RegistryObject<Item> STONE_POTATO = ITEMS.register("stone_potato", stone_potato::new);
    public static final RegistryObject<Item> IRON_POTATO = ITEMS.register("iron_potato", iron_potato::new);
}