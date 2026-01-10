package com.kais.meteoric_iron;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    //物品类注册
    public static final DeferredRegister.Items ITEMS=
            DeferredRegister.createItems(meteoriciron.MODID);
    //真正的物品注册
    public static final DeferredItem<Item> METEORIC_IRON_INGOT = ITEMS.register("meteoric_iron_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> METEORIC_IRON_ORE_ITEM = ITEMS.register("meteoric_iron_ore", () -> new BlockItem(ModBlocks.METEORIC_IRON_ORE.get(), new Item.Properties()));

    //register方法，主mod里面调用
    public static void  register(IEventBus modEventBus){
        ITEMS.register(modEventBus);
    }
}
