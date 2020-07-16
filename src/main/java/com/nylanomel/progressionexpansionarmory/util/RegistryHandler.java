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
        // SHIELDS
        public static final RegistryObject<Item> COPPER_SHIELD = ITEMS.register("copper_shield", ItemBase::new);
        public static final RegistryObject<Item> SILVER_SHIELD = ITEMS.register("silver_shield", ItemBase::new);
        public static final RegistryObject<Item> STEEL_SHIELD = ITEMS.register("steel_shield", ItemBase::new);
        public static final RegistryObject<Item> COBALT_SHIELD = ITEMS.register("cobalt_shield", ItemBase::new);
        public static final RegistryObject<Item> MYTHRIL_SHIELD = ITEMS.register("mythril_shield", ItemBase::new);
        public static final RegistryObject<Item> TRUE_SILVER_SHIELD = ITEMS.register("true_silver_shield", ItemBase::new);
        public static final RegistryObject<Item> DRACONIC_STEEL_SHIELD = ITEMS.register("draconic_steel_shield", ItemBase::new);
        public static final RegistryObject<Item> ENDRIL_SHIELD = ITEMS.register("endril_shield", ItemBase::new);
        public static final RegistryObject<Item> CHARGED_END_STONE_SHIELD = ITEMS.register("charged_end_stone_shield", ItemBase::new);
        public static final RegistryObject<Item> PURE_PURPUR_SHIELD = ITEMS.register("pure_purpur_shield", ItemBase::new);
        public static final RegistryObject<Item> ADAMANTITE_SHIELD = ITEMS.register("adamantite_shield", ItemBase::new);
        // CLEAVER
        public static final RegistryObject<Item> COPPER_CLEAVER = ITEMS.register("copper_cleaver", ItemBase::new);
        public static final RegistryObject<Item> SILVER_CLEAVER = ITEMS.register("silver_cleaver", ItemBase::new);
        public static final RegistryObject<Item> STEEL_CLEAVER = ITEMS.register("steel_cleaver", ItemBase::new);
        public static final RegistryObject<Item> COBALT_CLEAVER = ITEMS.register("cobalt_cleaver", ItemBase::new);
        public static final RegistryObject<Item> MYTHRIL_CLEAVER = ITEMS.register("mythril_cleaver", ItemBase::new);
        public static final RegistryObject<Item> TRUE_SILVER_CLEAVER = ITEMS.register("true_silver_cleaver", ItemBase::new);
        public static final RegistryObject<Item> DRACONIC_STEEL_CLEAVER = ITEMS.register("draconic_steel_cleaver", ItemBase::new);
        public static final RegistryObject<Item> ENDRIL_CLEAVER = ITEMS.register("endril_cleaver", ItemBase::new);
        public static final RegistryObject<Item> CHARGED_END_STONE_CLEAVER = ITEMS.register("charged_end_stone_cleaver", ItemBase::new);
        public static final RegistryObject<Item> PURE_PURPUR_CLEAVER = ITEMS.register("pure_purpur_cleaver", ItemBase::new);
        public static final RegistryObject<Item> ADAMANTITE_CLEAVER = ITEMS.register("adamantite_cleaver", ItemBase::new);
        // LONGSWORD
        public static final RegistryObject<Item> COPPER_LONGSWORD = ITEMS.register("copper_longsword", ItemBase::new);
        public static final RegistryObject<Item> SILVER_LONGSWORD = ITEMS.register("silver_longsword", ItemBase::new);
        public static final RegistryObject<Item> STEEL_LONGSWORD = ITEMS.register("steel_longsword", ItemBase::new);
        public static final RegistryObject<Item> COBALT_LONGSWORD = ITEMS.register("cobalt_longsword", ItemBase::new);
        public static final RegistryObject<Item> MYTHRIL_LONGSWORD = ITEMS.register("mythril_longsword", ItemBase::new);
        public static final RegistryObject<Item> TRUE_SILVER_LONGSWORD = ITEMS.register("true_silver_longsword", ItemBase::new);
        public static final RegistryObject<Item> DRACONIC_STEEL_LONGSWORD = ITEMS.register("draconic_steel_longsword", ItemBase::new);
        public static final RegistryObject<Item> ENDRIL_LONGSWORD = ITEMS.register("endril_longsword", ItemBase::new);
        public static final RegistryObject<Item> CHARGED_END_STONE_LONGSWORD = ITEMS.register("charged_end_stone_longsword", ItemBase::new);
        public static final RegistryObject<Item> PURE_PURPUR_LONGSWORD = ITEMS.register("pure_purpur_longsword", ItemBase::new);
        public static final RegistryObject<Item> ADAMANTITE_LONGSWORD = ITEMS.register("adamantite_longsword", ItemBase::new);
        // RAPIER
        public static final RegistryObject<Item> COPPER_RAPIER = ITEMS.register("copper_rapier", ItemBase::new);
        public static final RegistryObject<Item> SILVER_RAPIER = ITEMS.register("silver_rapier", ItemBase::new);
        public static final RegistryObject<Item> STEEL_RAPIER = ITEMS.register("steel_rapier", ItemBase::new);
        public static final RegistryObject<Item> COBALT_RAPIER = ITEMS.register("cobalt_rapier", ItemBase::new);
        public static final RegistryObject<Item> MYTHRIL_RAPIER = ITEMS.register("mythril_rapier", ItemBase::new);
        public static final RegistryObject<Item> TRUE_SILVER_RAPIER = ITEMS.register("true_silver_rapier", ItemBase::new);
        public static final RegistryObject<Item> DRACONIC_STEEL_RAPIER = ITEMS.register("draconic_steel_rapier", ItemBase::new);
        public static final RegistryObject<Item> ENDRIL_RAPIER = ITEMS.register("endril_rapier", ItemBase::new);
        public static final RegistryObject<Item> CHARGED_END_STONE_RAPIER = ITEMS.register("charged_end_stone_rapier", ItemBase::new);
        public static final RegistryObject<Item> PURE_PURPUR_RAPIER = ITEMS.register("pure_purpur_rapier", ItemBase::new);
        public static final RegistryObject<Item> ADAMANTITE_RAPIER = ITEMS.register("adamantite_rapier", ItemBase::new);
        // HAMMER
        public static final RegistryObject<Item> COPPER_HAMMER = ITEMS.register("copper_hammer", ItemBase::new);
        public static final RegistryObject<Item> SILVER_HAMMER = ITEMS.register("silver_hammer", ItemBase::new);
        public static final RegistryObject<Item> STEEL_HAMMER = ITEMS.register("steel_hammer", ItemBase::new);
        public static final RegistryObject<Item> COBALT_HAMMER = ITEMS.register("cobalt_hammer", ItemBase::new);
        public static final RegistryObject<Item> MYTHRIL_HAMMER = ITEMS.register("mythril_hammer", ItemBase::new);
        public static final RegistryObject<Item> TRUE_SILVER_HAMMER = ITEMS.register("true_silver_hammer", ItemBase::new);
        public static final RegistryObject<Item> DRACONIC_STEEL_HAMMER = ITEMS.register("draconic_steel_hammer", ItemBase::new);
        public static final RegistryObject<Item> ENDRIL_HAMMER = ITEMS.register("endril_hammer", ItemBase::new);
        public static final RegistryObject<Item> CHARGED_END_STONE_HAMMER = ITEMS.register("charged_end_stone_hammer", ItemBase::new);
        public static final RegistryObject<Item> PURE_PURPUR_HAMMER = ITEMS.register("pure_purpur_hammer", ItemBase::new);
        public static final RegistryObject<Item> ADAMANTITE_HAMMER = ITEMS.register("adamantite_hammer", ItemBase::new);
        // ROD
        public static final RegistryObject<Item> COPPER_ROD = ITEMS.register("copper_rod", ItemBase::new);
        public static final RegistryObject<Item> SILVER_ROD = ITEMS.register("silver_rod", ItemBase::new);
        public static final RegistryObject<Item> STEEL_ROD = ITEMS.register("steel_rod", ItemBase::new);
        public static final RegistryObject<Item> COBALT_ROD = ITEMS.register("cobalt_rod", ItemBase::new);
        public static final RegistryObject<Item> MYTHRIL_ROD = ITEMS.register("mythril_rod", ItemBase::new);
        public static final RegistryObject<Item> TRUE_SILVER_ROD = ITEMS.register("true_silver_rod", ItemBase::new);
        public static final RegistryObject<Item> DRACONIC_STEEL_ROD = ITEMS.register("draconic_steel_rod", ItemBase::new);
        public static final RegistryObject<Item> ENDRIL_ROD = ITEMS.register("endril_rod", ItemBase::new);
        public static final RegistryObject<Item> CHARGED_END_STONE_ROD = ITEMS.register("charged_end_rod", ItemBase::new);
        public static final RegistryObject<Item> PURE_PURPUR_ROD = ITEMS.register("pure_purpur_rod", ItemBase::new);
        public static final RegistryObject<Item> ADAMANTITE_ROD = ITEMS.register("adamantite_rod", ItemBase::new);


    // BLOCKS

}
