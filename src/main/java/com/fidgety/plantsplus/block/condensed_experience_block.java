package com.fidgety.plantsplus.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public class condensed_experience_block extends Block {

    public static final Material condensed_experience_block = new Material.Builder(MaterialColor.DIAMOND)
            .build();

    public condensed_experience_block() {
        super(AbstractBlock.Properties.create(condensed_experience_block)
                .hardnessAndResistance(5)
                .harvestLevel(3)
                .setRequiresTool()
                .harvestTool(ToolType.PICKAXE)
                .sound(SoundType.METAL)
        );
    }
}