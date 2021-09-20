package com.fidgety.plantsplus.item;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class netherite_potato extends Item {
    public static final Food netherite_potato = (new Food.Builder())
            .hunger(1)
            .saturation(0.6f)
            .effect(() -> new EffectInstance(Effects.ABSORPTION,300,3),1)
            .effect(() -> new EffectInstance(Effects.REGENERATION,300,3),1)
            .effect(() -> new EffectInstance(Effects.RESISTANCE,300,3),1)
            .setAlwaysEdible()
            .build();

    public netherite_potato() {
        super(new Properties()
            .food(netherite_potato)
            .group(ItemGroup.FOOD)
        );
    }
}