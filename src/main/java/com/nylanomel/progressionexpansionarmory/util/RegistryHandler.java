package com.nylanomel.progressionexpansionarmory.util;

import com.nylanomel.progressionexpansionarmory.ProgressionExpansionArmory;
import com.nylanomel.progressionexpansionarmory.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ProgressionExpansionArmory.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ProgressionExpansionArmory.MOD_ID);

    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // ITEMS
        public static final RegistryObject<Item> PLACEHOLDER_ITEM = ITEMS.register("placeholder_item", ItemBase::new);

    // BLOCKS

}
