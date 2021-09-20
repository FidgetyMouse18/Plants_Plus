package com.fidgety.plantsplus.item;

import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.item.ItemGroup;

public class banana extends Item {
    public static final Food banana = (new Food.Builder())
        .hunger(3)
        .saturation(1)
        .fastToEat()
        .build();
    public banana()
    {
        super(new Item.Properties()
            .food(banana)
            .group(ItemGroup.FOOD)
        );
    }
}
