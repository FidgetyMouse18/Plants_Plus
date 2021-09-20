package com.fidgety.plantsplus.item;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class gold_potato extends Item {
    public static final Food gold_potato = (new Food.Builder())
            .hunger(1)
            .saturation(0.6f)
            .effect(() -> new EffectInstance(Effects.SLOWNESS,300,1),1)
            .effect(() -> new EffectInstance(Effects.ABSORPTION,300,2),1)
            .setAlwaysEdible()
            .build();

    public gold_potato() {
        super(new Properties()
            .food(gold_potato)
            .group(ItemGroup.FOOD)
        );
    }
}