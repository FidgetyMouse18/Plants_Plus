package com.fidgety.plantsplus.item;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class enchanted_baked_potato extends Item {
    public static final Food enchanted_baked_potato = (new Food.Builder())
            .hunger(5)
            .saturation(6)
            .effect(() -> new EffectInstance(Effects.REGENERATION,300,2),1)
            .setAlwaysEdible()
            .build();

    public enchanted_baked_potato() {
        super(new Properties()
            .food(enchanted_baked_potato)
            .group(ItemGroup.FOOD)
        );
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }
}
