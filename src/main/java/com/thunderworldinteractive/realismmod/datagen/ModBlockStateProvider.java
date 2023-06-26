package com.thunderworldinteractive.realismmod.datagen;

import com.thunderworldinteractive.realismmod.RealismMod;
import com.thunderworldinteractive.realismmod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, RealismMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        //LOGS
        logBlock(((RotatedPillarBlock) ModBlocks.WILLOW_LOG.get()));

        axisBlock((RotatedPillarBlock) ModBlocks.WILLOW_WOOD.get(), blockTexture(ModBlocks.WILLOW_LOG.get()), blockTexture(ModBlocks.WILLOW_LOG.get()));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_WILLOW_LOG.get(), new ResourceLocation(RealismMod.MOD_ID, "block/stripped_willow_log"),
                new ResourceLocation(RealismMod.MOD_ID, "block/stripped_willow_log_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_WILLOW_WOOD.get(), new ResourceLocation(RealismMod.MOD_ID, "block/stripped_willow_log"),
                new ResourceLocation(RealismMod.MOD_ID, "block/stripped_willow_log"));

        blockWithItem(ModBlocks.WILLOW_PLANKS);
        blockWithItem(ModBlocks.WILLOW_LEAVES);
        saplingBlock(ModBlocks.WILLOW_SAPLING);

        simpleBlockItem(ModBlocks.WILLOW_LOG.get(), models().withExistingParent("realismmod:willow_log", "minecraft:block/cube_column"));
        simpleBlockItem(ModBlocks.WILLOW_WOOD.get(), models().withExistingParent("realismmod:willow_wood", "minecraft:block/cube_column"));
        simpleBlockItem(ModBlocks.STRIPPED_WILLOW_LOG.get(), models().withExistingParent("realismmod:stripped_willow_log", "minecraft:block/cube_column"));
        simpleBlockItem(ModBlocks.STRIPPED_WILLOW_WOOD.get(), models().withExistingParent("realismmod:stripped_willow_wood", "minecraft:block/cube_column"));




        //Gem Block
        blockWithItem(ModBlocks.BLACK_OPAL_BLOCK);
        blockWithItem(ModBlocks.SAPPHIRE_BLOCK);
        blockWithItem(ModBlocks.TITANIUM_BLOCK);
        blockWithItem(ModBlocks.PLUTONIUM_BLOCK);
        blockWithItem(ModBlocks.STEEL_BLOCK);
        blockWithItem(ModBlocks.VANADIUM_BLOCK);
        blockWithItem(ModBlocks.NICKEL_BLOCK);
        blockWithItem(ModBlocks.PERIDOT_BLOCK);
        blockWithItem(ModBlocks.RUBY_BLOCK);
        
        //Gem Ores
        blockWithItem(ModBlocks.ORE_BLACK_OPAL);
        blockWithItem(ModBlocks.ORE_RUBY);
        blockWithItem(ModBlocks.ORE_SAPPHIRE);
        blockWithItem(ModBlocks.ORE_TITANIUM);
        blockWithItem(ModBlocks.ORE_PLUTONIUM);
        blockWithItem(ModBlocks.ORE_VANADIUM);
        blockWithItem(ModBlocks.ORE_NICKEL);
        blockWithItem(ModBlocks.ORE_PERIDOT);

        blockWithItem(ModBlocks.ORE_ZINC);
        blockWithItem(ModBlocks.ORE_ALUMINUM);
        blockWithItem(ModBlocks.ORE_SILVER);
        blockWithItem(ModBlocks.ORE_CHROMIUM);
        blockWithItem(ModBlocks.ORE_TIN);
        blockWithItem(ModBlocks.ORE_COBALT);
        blockWithItem(ModBlocks.ORE_JADE);

        //Diamond Blocks
        blockWithItem(ModBlocks.BLOCK_RED_DIAMOND);
        blockWithItem(ModBlocks.BLOCK_BLUE_DIAMOND);
        blockWithItem(ModBlocks.BLOCK_GREEN_DIAMOND);
        blockWithItem(ModBlocks.BLOCK_ORANGE_DIAMOND);
        blockWithItem(ModBlocks.BLOCK_YELLOW_DIAMOND);
        blockWithItem(ModBlocks.BLOCK_PINK_DIAMOND);
        blockWithItem(ModBlocks.BLOCK_PURPLE_DIAMOND);
        
        //Diamond Ores
        blockWithItem(ModBlocks.ORE_RED_DIAMOND);
        blockWithItem(ModBlocks.ORE_BLUE_DIAMOND);
        blockWithItem(ModBlocks.ORE_GREEN_DIAMOND);
        blockWithItem(ModBlocks.ORE_ORANGE_DIAMOND);
        blockWithItem(ModBlocks.ORE_YELLOW_DIAMOND);
        blockWithItem(ModBlocks.ORE_PINK_DIAMOND);
        blockWithItem(ModBlocks.ORE_PURPLE_DIAMOND);

        blockWithItem(ModBlocks.DEEPSLATE_ORE_RED_DIAMOND);
        blockWithItem(ModBlocks.DEEPSLATE_ORE_BLUE_DIAMOND);
        blockWithItem(ModBlocks.DEEPSLATE_ORE_GREEN_DIAMOND);
        blockWithItem(ModBlocks.DEEPSLATE_ORE_ORANGE_DIAMOND);
        blockWithItem(ModBlocks.DEEPSLATE_ORE_YELLOW_DIAMOND);
        blockWithItem(ModBlocks.DEEPSLATE_ORE_PINK_DIAMOND);
        blockWithItem(ModBlocks.DEEPSLATE_ORE_PURPLE_DIAMOND);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject){
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }
}
