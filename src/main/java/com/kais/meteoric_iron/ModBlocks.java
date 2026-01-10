package com.kais.meteoric_iron;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {

    // 方块注册表
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(meteoriciron.MODID);

    // 注册一个普通矿石方块
    public static final DeferredBlock<Block> METEORIC_IRON_ORE =
            BLOCKS.registerSimpleBlock("meteoric_iron_ore",
                    BlockBehaviour.Properties
                            .of()
                            .mapColor(MapColor.STONE)
                            .strength(3.0F, 3.0F) // 硬度 & 抗爆
                            .sound(SoundType.STONE)
            );

    // 让主 mod 调用
    public static void register(IEventBus modEventBus) {
        BLOCKS.register(modEventBus);
    }
}