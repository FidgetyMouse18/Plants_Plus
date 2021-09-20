package com.fidgety.plantsplus;

import com.fidgety.plantsplus.block.*;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;

public class mod_blocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, plants_plus.MODID);
    public static final RegistryObject<Block> CONDENSED_EXPERIENCE_BLOCK = BLOCKS.register("condensed_experience_block", condensed_experience_block::new);
}