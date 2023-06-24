package com.thunderworldinteractive.realismmod.item;

import com.thunderworldinteractive.realismmod.RealismMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RealismMod.MOD_ID);

    //Other Gems
    public static final RegistryObject<Item> BLACK_OPAL = ITEMS.register("black_opal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VANADIUM = ITEMS.register("vanadium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLUTONIUM_INGOT = ITEMS.register("plutonium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PERIDOT = ITEMS.register("peridot",
            () -> new Item(new Item.Properties()));

    //Raw Gems

    public static final RegistryObject<Item> RAW_BLACK_OPAL = ITEMS.register("raw_black_opal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_RUBY = ITEMS.register("raw_ruby",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_VANADIUM = ITEMS.register("raw_vanadium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_PLUTONIUM = ITEMS.register("raw_plutonium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_PERIDOT = ITEMS.register("raw_peridot",
            () -> new Item(new Item.Properties()));
    
    //Diamonds
    public static final RegistryObject<Item> DIAMOND_RED = ITEMS.register("diamond_red",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_BLUE = ITEMS.register("diamond_blue",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_ORANGE = ITEMS.register("diamond_orange",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_GREEN = ITEMS.register("diamond_green",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_YELLOW = ITEMS.register("diamond_yellow",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_PURPLE = ITEMS.register("diamond_purple",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_PINK = ITEMS.register("diamond_pink",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
