package com.thunderworldinteractive.realismmod.datagen;

import com.thunderworldinteractive.realismmod.RealismMod;
import com.thunderworldinteractive.realismmod.block.ModBlocks;
import com.thunderworldinteractive.realismmod.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import javax.annotation.Nullable;
import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        
        //Diamond Ores to Diamonds
        oreSmelting(consumer, List.of(ModBlocks.ORE_RED_DIAMOND.get()), RecipeCategory.MISC,
                ModItems.DIAMOND_RED.get(), 1.0f, 200, "red_diamond");
        oreSmelting(consumer, List.of(ModBlocks.ORE_BLUE_DIAMOND.get()), RecipeCategory.MISC,
                ModItems.DIAMOND_BLUE.get(), 1.0f, 200, "blue_diamond");
        oreSmelting(consumer, List.of(ModBlocks.ORE_GREEN_DIAMOND.get()), RecipeCategory.MISC,
                ModItems.DIAMOND_GREEN.get(), 1.0f, 200, "green_diamond");
        oreSmelting(consumer, List.of(ModBlocks.ORE_ORANGE_DIAMOND.get()), RecipeCategory.MISC,
                ModItems.DIAMOND_ORANGE.get(), 1.0f, 200, "orange_diamond");
        oreSmelting(consumer, List.of(ModBlocks.ORE_YELLOW_DIAMOND.get()), RecipeCategory.MISC,
                ModItems.DIAMOND_YELLOW.get(), 1.0f, 200, "yellow_diamond");
        oreSmelting(consumer, List.of(ModBlocks.ORE_PINK_DIAMOND.get()), RecipeCategory.MISC,
                ModItems.DIAMOND_PINK.get(), 1.0f, 200, "pink_diamond");
        oreSmelting(consumer, List.of(ModBlocks.ORE_PURPLE_DIAMOND.get()), RecipeCategory.MISC,
                ModItems.DIAMOND_PURPLE.get(), 1.0f, 200, "purple_diamond");

        oreBlasting(consumer, List.of(ModBlocks.ORE_RED_DIAMOND.get()), RecipeCategory.MISC,
                ModItems.DIAMOND_RED.get(), 1.0f, 100, "red_diamond_blast");
        oreBlasting(consumer, List.of(ModBlocks.ORE_BLUE_DIAMOND.get()), RecipeCategory.MISC,
                ModItems.DIAMOND_BLUE.get(), 1.0f, 100, "blue_diamond_blast");
        oreBlasting(consumer, List.of(ModBlocks.ORE_GREEN_DIAMOND.get()), RecipeCategory.MISC,
                ModItems.DIAMOND_GREEN.get(), 1.0f, 100, "green_diamond_blast");
        oreBlasting(consumer, List.of(ModBlocks.ORE_ORANGE_DIAMOND.get()), RecipeCategory.MISC,
                ModItems.DIAMOND_ORANGE.get(), 1.0f, 100, "orange_diamond_blast");
        oreBlasting(consumer, List.of(ModBlocks.ORE_YELLOW_DIAMOND.get()), RecipeCategory.MISC,
                ModItems.DIAMOND_YELLOW.get(), 1.0f, 100, "yellow_diamond_blast");
        oreBlasting(consumer, List.of(ModBlocks.ORE_PINK_DIAMOND.get()), RecipeCategory.MISC,
                ModItems.DIAMOND_PINK.get(), 1.0f, 100, "pink_diamond_blast");
        oreBlasting(consumer, List.of(ModBlocks.ORE_PURPLE_DIAMOND.get()), RecipeCategory.MISC,
                ModItems.DIAMOND_PURPLE.get(), 1.0f, 100, "purple_diamond_blast");

        oreSmelting(consumer, List.of(ModBlocks.DEEPSLATE_ORE_RED_DIAMOND.get()), RecipeCategory.MISC,
                ModItems.DIAMOND_RED.get(), 1.0f, 200, "deepslate_red_diamond");
        oreSmelting(consumer, List.of(ModBlocks.DEEPSLATE_ORE_BLUE_DIAMOND.get()), RecipeCategory.MISC,
                ModItems.DIAMOND_BLUE.get(), 1.0f, 200, "deepslate_blue_diamond");
        oreSmelting(consumer, List.of(ModBlocks.DEEPSLATE_ORE_GREEN_DIAMOND.get()), RecipeCategory.MISC,
                ModItems.DIAMOND_GREEN.get(), 1.0f, 200, "deepslate_green_diamond");
        oreSmelting(consumer, List.of(ModBlocks.DEEPSLATE_ORE_ORANGE_DIAMOND.get()), RecipeCategory.MISC,
                ModItems.DIAMOND_ORANGE.get(), 1.0f, 200, "deepslate_orange_diamond");
        oreSmelting(consumer, List.of(ModBlocks.DEEPSLATE_ORE_YELLOW_DIAMOND.get()), RecipeCategory.MISC,
                ModItems.DIAMOND_YELLOW.get(), 1.0f, 200, "deepslate_yellow_diamond");
        oreSmelting(consumer, List.of(ModBlocks.DEEPSLATE_ORE_PINK_DIAMOND.get()), RecipeCategory.MISC,
                ModItems.DIAMOND_PINK.get(), 1.0f, 200, "deepslate_pink_diamond");
        oreSmelting(consumer, List.of(ModBlocks.DEEPSLATE_ORE_PURPLE_DIAMOND.get()), RecipeCategory.MISC,
                ModItems.DIAMOND_PURPLE.get(), 1.0f, 200, "deepslate_purple_diamond");

        oreBlasting(consumer, List.of(ModBlocks.DEEPSLATE_ORE_RED_DIAMOND.get()), RecipeCategory.MISC,
                ModItems.DIAMOND_RED.get(), 1.0f, 100, "deepslate_red_diamond_blast");
        oreBlasting(consumer, List.of(ModBlocks.DEEPSLATE_ORE_BLUE_DIAMOND.get()), RecipeCategory.MISC,
                ModItems.DIAMOND_BLUE.get(), 1.0f, 100, "deepslate_blue_diamond_blast");
        oreBlasting(consumer, List.of(ModBlocks.DEEPSLATE_ORE_GREEN_DIAMOND.get()), RecipeCategory.MISC,
                ModItems.DIAMOND_GREEN.get(), 1.0f, 100, "deepslate_green_diamond_blast");
        oreBlasting(consumer, List.of(ModBlocks.DEEPSLATE_ORE_ORANGE_DIAMOND.get()), RecipeCategory.MISC,
                ModItems.DIAMOND_ORANGE.get(), 1.0f, 100, "deepslate_orange_diamond_blast");
        oreBlasting(consumer, List.of(ModBlocks.DEEPSLATE_ORE_YELLOW_DIAMOND.get()), RecipeCategory.MISC,
                ModItems.DIAMOND_YELLOW.get(), 1.0f, 100, "deepslate_yellow_diamond_blast");
        oreBlasting(consumer, List.of(ModBlocks.DEEPSLATE_ORE_PINK_DIAMOND.get()), RecipeCategory.MISC,
                ModItems.DIAMOND_PINK.get(), 1.0f, 100, "deepslate_pink_diamond_blast");
        oreBlasting(consumer, List.of(ModBlocks.DEEPSLATE_ORE_PURPLE_DIAMOND.get()), RecipeCategory.MISC,
                ModItems.DIAMOND_PURPLE.get(), 1.0f, 100, "deepslate_purple_diamond_blast");
        //Raw Gems to Gems
        oreSmelting(consumer, List.of(ModItems.RAW_RUBY.get()), RecipeCategory.MISC,
                ModItems.RUBY.get(), 0.7f,200, "ruby");
        oreSmelting(consumer, List.of(ModItems.RAW_VANADIUM.get()), RecipeCategory.MISC,
                ModItems.VANADIUM.get(), 0.7f,200, "vanadium");
        oreSmelting(consumer, List.of(ModItems.RAW_SAPPHIRE.get()), RecipeCategory.MISC,
                ModItems.SAPPHIRE.get(), 0.7f,200, "sapphire");
        oreSmelting(consumer, List.of(ModItems.RAW_PERIDOT.get()), RecipeCategory.MISC,
                ModItems.PERIDOT.get(), 0.7f,200, "peridot");
        oreSmelting(consumer, List.of(ModItems.RAW_PLUTONIUM.get()), RecipeCategory.MISC,
                ModItems.PLUTONIUM_INGOT.get(), 0.7f,200, "plutonium");
        oreSmelting(consumer, List.of(ModItems.RAW_BLACK_OPAL.get()), RecipeCategory.MISC,
                ModItems.BLACK_OPAL.get(), 0.7f,200, "black_opal");

        //Diamond Blocks
        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.DIAMOND_RED.get(), RecipeCategory.MISC,
                ModBlocks.BLOCK_RED_DIAMOND.get());
        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.DIAMOND_BLUE.get(), RecipeCategory.MISC,
                ModBlocks.BLOCK_BLUE_DIAMOND.get());
        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.DIAMOND_GREEN.get(), RecipeCategory.MISC,
                ModBlocks.BLOCK_GREEN_DIAMOND.get());
        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.DIAMOND_ORANGE.get(), RecipeCategory.MISC,
                ModBlocks.BLOCK_ORANGE_DIAMOND.get());
        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.DIAMOND_YELLOW.get(), RecipeCategory.MISC,
                ModBlocks.BLOCK_YELLOW_DIAMOND.get());
        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.DIAMOND_PINK.get(), RecipeCategory.MISC,
                ModBlocks.BLOCK_PINK_DIAMOND.get());
        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.DIAMOND_PURPLE.get(), RecipeCategory.MISC,
                ModBlocks.BLOCK_PURPLE_DIAMOND.get());


        //Gem Blocks
        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.BLACK_OPAL.get(), RecipeCategory.MISC,
                ModBlocks.BLACK_OPAL_BLOCK.get());
        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.RUBY.get(), RecipeCategory.MISC,
                ModBlocks.RUBY_BLOCK.get());
        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.SAPPHIRE.get(), RecipeCategory.MISC,
                ModBlocks.SAPPHIRE_BLOCK.get());
        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.PERIDOT.get(), RecipeCategory.MISC,
                ModBlocks.PERIDOT_BLOCK.get());
        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.VANADIUM.get(), RecipeCategory.MISC,
                ModBlocks.VANADIUM_BLOCK.get());
        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.PLUTONIUM_INGOT.get(), RecipeCategory.MISC,
                ModBlocks.PLUTONIUM_BLOCK.get());
        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.TITANIUM_INGOT.get(), RecipeCategory.MISC,
                ModBlocks.TITANIUM_BLOCK.get());
        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.NICKEL_INGOT.get(), RecipeCategory.MISC,
                ModBlocks.NICKEL_BLOCK.get());
        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.STEEL_INGOT.get(), RecipeCategory.MISC,
                ModBlocks.STEEL_BLOCK.get());

        // ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BLACK_OPAL.get())
        //         .requires(ModBlocks.BLACK_OPAL_BLOCK.get())
         //        .unlockedBy("has_black_opal_block", inventoryTrigger(ItemPredicate.Builder.item()
         //                .of(ModBlocks.BLACK_OPAL_BLOCK.get()).build()))
         //        .save(consumer);

        // ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLACK_OPAL_BLOCK.get())
        //         .define('B', ModItems.BLACK_OPAL.get())
        //         .pattern("BBB")
        //         .pattern("BBB")
        //         .pattern("BBB")
        //         .unlockedBy("has_black_opal", inventoryTrigger(ItemPredicate.Builder.item()
        //                 .of(ModItems.BLACK_OPAL.get()).build()))
        //         .save(consumer);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> p_250654_, List<ItemLike> p_250172_, RecipeCategory p_250588_, ItemLike p_251868_, float p_250789_, int p_252144_, String p_251687_) {
        oreCooking(p_250654_, RecipeSerializer.SMELTING_RECIPE, p_250172_, p_250588_, p_251868_, p_250789_, p_252144_, p_251687_, "_from_smelting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> p_250791_, RecipeSerializer<? extends AbstractCookingRecipe> p_251817_, List<ItemLike> p_249619_, RecipeCategory p_251154_, ItemLike p_250066_, float p_251871_, int p_251316_, String p_251450_, String p_249236_) {
        for(ItemLike itemlike : p_249619_) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), p_251154_, p_250066_, p_251871_, p_251316_, p_251817_).group(p_251450_)
                    .unlockedBy(getHasName(itemlike), has(itemlike)).save(p_250791_, new ResourceLocation(RealismMod.MOD_ID, getItemName(p_250066_)) + p_249236_ + "_" + getItemName(itemlike));
        }
    }

    protected static void nineBlockStorageRecipes(Consumer<FinishedRecipe> p_249580_, RecipeCategory p_251203_, ItemLike p_251689_, RecipeCategory p_251376_, ItemLike p_248771_) {
        nineBlockStorageRecipes(p_249580_, p_251203_, p_251689_, p_251376_, p_248771_, getSimpleRecipeName(p_248771_), (String)null, getSimpleRecipeName(p_251689_), (String)null);
    }

    protected static void nineBlockStorageRecipes(Consumer<FinishedRecipe> p_250423_, RecipeCategory p_250083_, ItemLike p_250042_,
                                                  RecipeCategory p_248977_, ItemLike p_251911_, String p_250475_, @Nullable String p_248641_,
                                                  String p_252237_, @Nullable String p_250414_) {
        ShapelessRecipeBuilder.shapeless(p_250083_, p_250042_, 9).requires(p_251911_).group(p_250414_).unlockedBy(getHasName(p_251911_), has(p_251911_))
                .save(p_250423_, new ResourceLocation(RealismMod.MOD_ID, p_252237_));
        ShapedRecipeBuilder.shaped(p_248977_, p_251911_).define('#', p_250042_).pattern("###").pattern("###").pattern("###").group(p_248641_)
                .unlockedBy(getHasName(p_250042_), has(p_250042_)).save(p_250423_, new ResourceLocation(RealismMod.MOD_ID, p_250475_));
    }
}