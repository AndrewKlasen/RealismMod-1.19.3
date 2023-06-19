package com.thunderworldinteractive.realismmod.block;

import com.thunderworldinteractive.realismmod.RealismMod;
import com.thunderworldinteractive.realismmod.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, RealismMod.MOD_ID);
// Gem Blocks
    public static final RegistryObject<Block> BLACK_OPAL_BLOCK = registerBlock("black_opal_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(2f,3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(2f,3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(2f,3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TITANIUM_BLOCK = registerBlock("titanium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(2f,3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PLUTONIUM_BLOCK = registerBlock("plutonium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(2f,3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> STEEL_BLOCK = registerBlock("steel_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(2f,3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> VANADIUM_BLOCK = registerBlock("vanadium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(2f,3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NICKEL_BLOCK = registerBlock("nickel_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(2f,3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> AMETHYST_BLOCK = registerBlock("amethyst_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(2f,3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PERIDOT_BLOCK = registerBlock("peridot_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(2f,3f).requiresCorrectToolForDrops()));
    
    //Gem Ores
    public static final RegistryObject<Block> ORE_BLACK_OPAL = registerBlock("ore_black_opal",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3f,3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ORE_RUBY = registerBlock("ore_ruby",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3f,3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ORE_SAPPHIRE = registerBlock("ore_sapphire",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3f,3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ORE_TITANIUM = registerBlock("ore_titanium",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3f,3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ORE_PLUTONIUM = registerBlock("ore_plutonium",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3f,3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ORE_VANADIUM = registerBlock("ore_vanadium",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3f,3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ORE_NICKEL = registerBlock("ore_nickel",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3f,3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ORE_AMETHYST = registerBlock("ore_amethyst",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3f,3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ORE_PERIDOT = registerBlock("ore_peridot",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3f,3f).requiresCorrectToolForDrops()));
    

    //Diamond Block
    public static final RegistryObject<Block> BLOCK_RED_DIAMOND = registerBlock("block_red_diamond",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(2f,3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLOCK_BLUE_DIAMOND = registerBlock("block_blue_diamond",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(2f,3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLOCK_GREEN_DIAMOND = registerBlock("block_green_diamond",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(2f,3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLOCK_ORANGE_DIAMOND = registerBlock("block_orange_diamond",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(2f,3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLOCK_YELLOW_DIAMOND = registerBlock("block_yellow_diamond",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(2f,3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLOCK_PURPLE_DIAMOND = registerBlock("block_purple_diamond",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(2f,3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLOCK_PINK_DIAMOND = registerBlock("block_pink_diamond",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(2f,3f).requiresCorrectToolForDrops()));

    //Diamond Ores
    public static final RegistryObject<Block> ORE_RED_DIAMOND = registerBlock("ore_red_diamond",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3f,3f).requiresCorrectToolForDrops(), UniformInt.of(2,6)));
    public static final RegistryObject<Block> ORE_BLUE_DIAMOND = registerBlock("ore_blue_diamond",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3f,3f).requiresCorrectToolForDrops(), UniformInt.of(2,6)));
    public static final RegistryObject<Block> ORE_GREEN_DIAMOND = registerBlock("ore_green_diamond",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3f,3f).requiresCorrectToolForDrops(), UniformInt.of(2,6)));
    public static final RegistryObject<Block> ORE_ORANGE_DIAMOND = registerBlock("ore_orange_diamond",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3f,3f).requiresCorrectToolForDrops(), UniformInt.of(2,6)));
    public static final RegistryObject<Block> ORE_YELLOW_DIAMOND = registerBlock("ore_yellow_diamond",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3f,3f).requiresCorrectToolForDrops(), UniformInt.of(2,6)));
    public static final RegistryObject<Block> ORE_PURPLE_DIAMOND = registerBlock("ore_purple_diamond",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3f,3f).requiresCorrectToolForDrops(), UniformInt.of(2,6)));
    public static final RegistryObject<Block> ORE_PINK_DIAMOND = registerBlock("ore_pink_diamond",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3f,3f).requiresCorrectToolForDrops(), UniformInt.of(2,6)));
    //DeepSlate Diamond Ores
    public static final RegistryObject<Block> DEEPSLATE_ORE_RED_DIAMOND = registerBlock("deepslate_ore_red_diamond",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3f,3f).requiresCorrectToolForDrops(), UniformInt.of(2,6)));
    public static final RegistryObject<Block> DEEPSLATE_ORE_BLUE_DIAMOND = registerBlock("deepslate_ore_blue_diamond",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3f,3f).requiresCorrectToolForDrops(), UniformInt.of(2,6)));
    public static final RegistryObject<Block> DEEPSLATE_ORE_GREEN_DIAMOND = registerBlock("deepslate_ore_green_diamond",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3f,3f).requiresCorrectToolForDrops(), UniformInt.of(2,6)));
    public static final RegistryObject<Block> DEEPSLATE_ORE_ORANGE_DIAMOND = registerBlock("deepslate_ore_orange_diamond",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3f,3f).requiresCorrectToolForDrops(), UniformInt.of(2,6)));
    public static final RegistryObject<Block> DEEPSLATE_ORE_YELLOW_DIAMOND = registerBlock("deepslate_ore_yellow_diamond",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3f,3f).requiresCorrectToolForDrops(), UniformInt.of(2,6)));
    public static final RegistryObject<Block> DEEPSLATE_ORE_PURPLE_DIAMOND = registerBlock("deepslate_ore_purple_diamond",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3f,3f).requiresCorrectToolForDrops(), UniformInt.of(2,6)));
    public static final RegistryObject<Block> DEEPSLATE_ORE_PINK_DIAMOND = registerBlock("deepslate_ore_pink_diamond",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3f,3f).requiresCorrectToolForDrops(), UniformInt.of(2,6)));
    
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends  Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
    return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
            new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
