package com.fidgety.plantsplus.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class condensed_experience extends Item {
    public condensed_experience()
    {
        super(new Properties()
                .isImmuneToFire()
                .group(ItemGroup.MATERIALS)
        );
    }
    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }
}
