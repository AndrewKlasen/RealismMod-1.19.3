package com.thunderworldinteractive.realismmod.worldgen;

import com.thunderworldinteractive.realismmod.RealismMod;
import com.thunderworldinteractive.realismmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILLOW_KEY = registerKey("willow");

    //Gem Ores
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_BLACK_OPAL_ORE_KEY  = registerKey("black_opal_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ORE_RUBY_KEY  = registerKey("ore_ruby");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ORE_SAPPHIRE_KEY  = registerKey("ore_sapphire");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ORE_TITANIUM_KEY  = registerKey("ore_titanium");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ORE_PLUTONIUM_KEY  = registerKey("ore_plutonium");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ORE_NICKEL_KEY  = registerKey("ore_nickel");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ORE_VANADIUM_KEY  = registerKey("ore_vanadium");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ORE_PERIDOT_KEY  = registerKey("ore_peridot");
    //Diamond Ores
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ORE_RED_DIAMOND_KEY  = registerKey("ore_red_diamond");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ORE_BLUE_DIAMOND_KEY  = registerKey("ore_blue_diamond");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ORE_GREEN_DIAMOND_KEY  = registerKey("ore_green_diamond");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ORE_ORANGE_DIAMOND_KEY  = registerKey("ore_orange_diamond");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ORE_YELLOW_DIAMOND_KEY  = registerKey("ore_yellow_diamond");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ORE_PINK_DIAMOND_KEY  = registerKey("ore_pink_diamond");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ORE_PURPLE_DIAMOND_KEY  = registerKey("ore_purple_diamond");


    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        register(context, WILLOW_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.WILLOW_LOG.get()),
                new StraightTrunkPlacer(5, 6, 3),
                BlockStateProvider.simple(ModBlocks.WILLOW_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                new TwoLayersFeatureSize(1, 0, 2)).build());


        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherrackReplaceables = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endstoneReplaceables = new BlockMatchTest(Blocks.END_STONE);

        List<OreConfiguration.TargetBlockState> overworldBlackOpalOres = List.of(OreConfiguration.target(stoneReplaceables,
                        ModBlocks.ORE_BLACK_OPAL.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.ORE_BLACK_OPAL.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldRubyOres = List.of(OreConfiguration.target(stoneReplaceables,
                        ModBlocks.ORE_RUBY.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.ORE_RUBY.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldSapphireOres = List.of(OreConfiguration.target(stoneReplaceables,
                        ModBlocks.ORE_SAPPHIRE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.ORE_SAPPHIRE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldTitaniumOres = List.of(OreConfiguration.target(stoneReplaceables,
                        ModBlocks.ORE_TITANIUM.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.ORE_TITANIUM.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldPlutoniumOres = List.of(OreConfiguration.target(stoneReplaceables,
                        ModBlocks.ORE_PLUTONIUM.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.ORE_PLUTONIUM.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldNickelOres = List.of(OreConfiguration.target(stoneReplaceables,
                        ModBlocks.ORE_NICKEL.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.ORE_NICKEL.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldVanadiumOres = List.of(OreConfiguration.target(stoneReplaceables,
                        ModBlocks.ORE_VANADIUM.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.ORE_VANADIUM.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldPeridotOres = List.of(OreConfiguration.target(stoneReplaceables,
                        ModBlocks.ORE_PERIDOT.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.ORE_PERIDOT.get().defaultBlockState()));

        //Diamond Ores
        List<OreConfiguration.TargetBlockState> overworldRedDiamondOres = List.of(OreConfiguration.target(stoneReplaceables,
                        ModBlocks.ORE_RED_DIAMOND.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_ORE_RED_DIAMOND.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldBlueDiamondOres = List.of(OreConfiguration.target(stoneReplaceables,
                        ModBlocks.ORE_BLUE_DIAMOND.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_ORE_BLUE_DIAMOND.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldGreenDiamondOres = List.of(OreConfiguration.target(stoneReplaceables,
                        ModBlocks.ORE_GREEN_DIAMOND.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_ORE_GREEN_DIAMOND.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldOrangeDiamondOres = List.of(OreConfiguration.target(stoneReplaceables,
                        ModBlocks.ORE_ORANGE_DIAMOND.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_ORE_ORANGE_DIAMOND.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldYellowDiamondOres = List.of(OreConfiguration.target(stoneReplaceables,
                        ModBlocks.ORE_YELLOW_DIAMOND.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_ORE_YELLOW_DIAMOND.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldPinkDiamondOres = List.of(OreConfiguration.target(stoneReplaceables,
                        ModBlocks.ORE_PINK_DIAMOND.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_ORE_PINK_DIAMOND.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldPurpleDiamondOres = List.of(OreConfiguration.target(stoneReplaceables,
                        ModBlocks.ORE_PURPLE_DIAMOND.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_ORE_PURPLE_DIAMOND.get().defaultBlockState()));

        //Gem ores
        register(context, OVERWORLD_BLACK_OPAL_ORE_KEY, Feature.ORE, new OreConfiguration(overworldBlackOpalOres, 9));
        register(context, OVERWORLD_ORE_RUBY_KEY, Feature.ORE, new OreConfiguration(overworldRubyOres, 9));
        register(context, OVERWORLD_ORE_SAPPHIRE_KEY, Feature.ORE, new OreConfiguration(overworldSapphireOres, 9));
        register(context, OVERWORLD_ORE_TITANIUM_KEY, Feature.ORE, new OreConfiguration(overworldTitaniumOres, 9));
        register(context, OVERWORLD_ORE_PLUTONIUM_KEY, Feature.ORE, new OreConfiguration(overworldPlutoniumOres, 9));
        register(context, OVERWORLD_ORE_NICKEL_KEY, Feature.ORE, new OreConfiguration(overworldNickelOres, 9));
        register(context, OVERWORLD_ORE_VANADIUM_KEY, Feature.ORE, new OreConfiguration(overworldVanadiumOres, 9));
        register(context, OVERWORLD_ORE_PERIDOT_KEY, Feature.ORE, new OreConfiguration(overworldPeridotOres, 9));

        //Diamond Ores
        register(context, OVERWORLD_ORE_RED_DIAMOND_KEY, Feature.ORE, new OreConfiguration(overworldRedDiamondOres, 9));
        register(context, OVERWORLD_ORE_BLUE_DIAMOND_KEY, Feature.ORE, new OreConfiguration(overworldBlueDiamondOres, 9));
        register(context, OVERWORLD_ORE_GREEN_DIAMOND_KEY, Feature.ORE, new OreConfiguration(overworldGreenDiamondOres, 9));
        register(context, OVERWORLD_ORE_ORANGE_DIAMOND_KEY, Feature.ORE, new OreConfiguration(overworldOrangeDiamondOres, 9));
        register(context, OVERWORLD_ORE_YELLOW_DIAMOND_KEY, Feature.ORE, new OreConfiguration(overworldYellowDiamondOres, 9));
        register(context, OVERWORLD_ORE_PINK_DIAMOND_KEY, Feature.ORE, new OreConfiguration(overworldPinkDiamondOres, 9));
        register(context, OVERWORLD_ORE_PURPLE_DIAMOND_KEY, Feature.ORE, new OreConfiguration(overworldPurpleDiamondOres, 9));

    }
        public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(RealismMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}


