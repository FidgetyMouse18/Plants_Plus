package com.fidgety.plantsplus.item;

import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class enchanted_potato extends Item {
    public static final Food enchanted_potato = (new Food.Builder())
            .hunger(1)
            .saturation(0.6f)
            .effect(() -> new EffectInstance(Effects.REGENERATION,600,2),1)
            .setAlwaysEdible()
            .build();

    public enchanted_potato() {
        super(new Item.Properties()
            .food(enchanted_potato)
            .group(ItemGroup.FOOD)
        );
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }
}
