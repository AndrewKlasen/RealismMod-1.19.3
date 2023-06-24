package com.thunderworldinteractive.realismmod.datagen;

import com.thunderworldinteractive.realismmod.block.ModBlocks;
import com.thunderworldinteractive.realismmod.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }
    @Override
    protected void generate() {
        //Diamond Blocks
        dropSelf(ModBlocks.BLOCK_RED_DIAMOND.get());
        dropSelf(ModBlocks.BLOCK_BLUE_DIAMOND.get());
        dropSelf(ModBlocks.BLOCK_GREEN_DIAMOND.get());
        dropSelf(ModBlocks.BLOCK_YELLOW_DIAMOND.get());
        dropSelf(ModBlocks.BLOCK_ORANGE_DIAMOND.get());
        dropSelf(ModBlocks.BLOCK_PINK_DIAMOND.get());
        dropSelf(ModBlocks.BLOCK_PURPLE_DIAMOND.get());
        //Diamond Ores
        dropSelf(ModBlocks.DEEPSLATE_ORE_RED_DIAMOND.get());
        dropSelf(ModBlocks.DEEPSLATE_ORE_BLUE_DIAMOND.get());
        dropSelf(ModBlocks.DEEPSLATE_ORE_GREEN_DIAMOND.get());
        dropSelf(ModBlocks.DEEPSLATE_ORE_YELLOW_DIAMOND.get());
        dropSelf(ModBlocks.DEEPSLATE_ORE_ORANGE_DIAMOND.get());
        dropSelf(ModBlocks.DEEPSLATE_ORE_PINK_DIAMOND.get());
        dropSelf(ModBlocks.DEEPSLATE_ORE_PURPLE_DIAMOND.get());

        dropSelf(ModBlocks.ORE_RED_DIAMOND.get());
        dropSelf(ModBlocks.ORE_BLUE_DIAMOND.get());
        dropSelf(ModBlocks.ORE_GREEN_DIAMOND.get());
        dropSelf(ModBlocks.ORE_YELLOW_DIAMOND.get());
        dropSelf(ModBlocks.ORE_ORANGE_DIAMOND.get());
        dropSelf(ModBlocks.ORE_PINK_DIAMOND.get());
        dropSelf(ModBlocks.ORE_PURPLE_DIAMOND.get());
        //GEM Mores
        add(ModBlocks.ORE_BLACK_OPAL.get(),
                (block) -> createOreDrop(ModBlocks.ORE_BLACK_OPAL.get(), ModItems.RAW_BLACK_OPAL.get()));
        add(ModBlocks.ORE_RUBY.get(),
                (block) -> createOreDrop(ModBlocks.ORE_RUBY.get(), ModItems.RAW_RUBY.get()));
        add(ModBlocks.ORE_SAPPHIRE.get(),
                (block) -> createOreDrop(ModBlocks.ORE_SAPPHIRE.get(), ModItems.RAW_SAPPHIRE.get()));
        add(ModBlocks.ORE_PERIDOT.get(),
                (block) -> createOreDrop(ModBlocks.ORE_PERIDOT.get(), ModItems.RAW_PERIDOT.get()));
        add(ModBlocks.ORE_PLUTONIUM.get(),
                (block) -> createOreDrop(ModBlocks.ORE_PLUTONIUM.get(), ModItems.RAW_PLUTONIUM.get()));
        add(ModBlocks.ORE_NICKEL.get(),
                (block) -> createOreDrop(ModBlocks.ORE_NICKEL.get(), ModItems.NICKEL_INGOT.get()));
        add(ModBlocks.ORE_TITANIUM.get(),
                (block) -> createOreDrop(ModBlocks.ORE_TITANIUM.get(), ModItems.TITANIUM_INGOT.get()));
        add(ModBlocks.ORE_VANADIUM.get(),
                (block) -> createOreDrop(ModBlocks.ORE_VANADIUM.get(), ModItems.RAW_VANADIUM.get()));
        //Gem Blocks
        dropSelf(ModBlocks.RUBY_BLOCK.get());
        dropSelf(ModBlocks.SAPPHIRE_BLOCK.get());
        dropSelf(ModBlocks.NICKEL_BLOCK.get());
        dropSelf(ModBlocks.VANADIUM_BLOCK.get());
        dropSelf(ModBlocks.PLUTONIUM_BLOCK.get());
        dropSelf(ModBlocks.TITANIUM_BLOCK.get());
        dropSelf(ModBlocks.PERIDOT_BLOCK.get());
        dropSelf(ModBlocks.BLACK_OPAL_BLOCK.get());
        dropSelf(ModBlocks.STEEL_BLOCK.get());

        //Logs
        this.dropSelf(ModBlocks.WILLOW_LOG.get());
        this.dropSelf(ModBlocks.WILLOW_WOOD.get());
        this.dropSelf(ModBlocks.WILLOW_PLANKS.get());
        this.dropSelf(ModBlocks.STRIPPED_WILLOW_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_WILLOW_LOG.get());
        this.dropSelf(ModBlocks.WILLOW_SAPLING.get());

        this.add(ModBlocks.WILLOW_LEAVES.get(), (block) ->
                createLeavesDrops(block, ModBlocks.WILLOW_LEAVES.get(), NORMAL_LEAVES_SAPLING_CHANCES));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}