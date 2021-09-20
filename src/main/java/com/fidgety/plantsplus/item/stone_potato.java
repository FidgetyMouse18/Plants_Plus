package com.fidgety.plantsplus.item;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class stone_potato extends Item {
    public static final Food stone_potato = (new Food.Builder())
            .hunger(1)
            .saturation(0.6f)
            .effect(() -> new EffectInstance(Effects.SLOWNESS,300,2),1)
            .setAlwaysEdible()
            .build();

    public stone_potato() {
        super(new Properties()
            .food(stone_potato)
            .group(ItemGroup.FOOD)
        );
    }
}