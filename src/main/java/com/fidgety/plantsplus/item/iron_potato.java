package com.fidgety.plantsplus.item;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class iron_potato extends Item {
    public static final Food iron_potato = (new Food.Builder())
            .hunger(1)
            .saturation(0.6f)
            .effect(() -> new EffectInstance(Effects.SLOWNESS,300,2),1)
            .effect(() -> new EffectInstance(Effects.ABSORPTION,300,1),1)
            .setAlwaysEdible()
            .build();

    public iron_potato() {
        super(new Properties()
            .food(iron_potato)
            .group(ItemGroup.FOOD)
        );
    }
}