package com.thunderworldinteractive.realismmod.worldgen;

import com.thunderworldinteractive.realismmod.RealismMod;
import com.thunderworldinteractive.realismmod.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> WILLOW_PLACED_KEY = createKey("willow_placed");
    
    //Gem Ores
    public static final ResourceKey<PlacedFeature> BLACK_OPAL_PLACED_KEY = createKey("black_opal_placed");
    public static final ResourceKey<PlacedFeature> RUBY_PLACED_KEY = createKey("ruby_placed");
    public static final ResourceKey<PlacedFeature> SAPPHIRE_PLACED_KEY = createKey("sapphire_placed");
    public static final ResourceKey<PlacedFeature> TITANIUM_PLACED_KEY = createKey("titanium_placed");
    public static final ResourceKey<PlacedFeature> PLUTONIUM_PLACED_KEY = createKey("plutonium_placed");
    public static final ResourceKey<PlacedFeature> VANADIUM_PLACED_KEY = createKey("vanadium_placed");
    public static final ResourceKey<PlacedFeature> NICKEL_PLACED_KEY = createKey("nickel_placed");
    public static final ResourceKey<PlacedFeature> PERIDOT_PLACED_KEY = createKey("peridot_placed");
    //Diamond Ores
    public static final ResourceKey<PlacedFeature> ORE_RED_DIAMOND_KEY = createKey("red_diamond_placed");
    public static final ResourceKey<PlacedFeature> ORE_BLUE_DIAMOND_KEY = createKey("blue_diamond_placed");
    public static final ResourceKey<PlacedFeature> ORE_GREEN_DIAMOND_KEY = createKey("green_diamond_placed");
    public static final ResourceKey<PlacedFeature> ORE_ORANGE_DIAMOND_KEY = createKey("orange_diamond_placed");
    public static final ResourceKey<PlacedFeature> ORE_YELLOW_DIAMOND_KEY = createKey("yellow_diamond_placed");
    public static final ResourceKey<PlacedFeature> ORE_PINK_DIAMOND_KEY = createKey("pink_diamond_placed");
    public static final ResourceKey<PlacedFeature> ORE_PURPLE_DIAMOND_KEY = createKey("purple_diamond_placed");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

       register(context, WILLOW_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.WILLOW_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.1f, 1), ModBlocks.WILLOW_SAPLING.get()));
       
       //Gem ores
        register(context, BLACK_OPAL_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_BLACK_OPAL_ORE_KEY),
                ModOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-64), VerticalAnchor.absolute(80))));// veins per chunk
        register(context, RUBY_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_ORE_RUBY_KEY),
                ModOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-64), VerticalAnchor.absolute(80))));// veins per chunk
        register(context, SAPPHIRE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_ORE_SAPPHIRE_KEY),
                ModOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-64), VerticalAnchor.absolute(80))));// veins per chunk
        register(context, TITANIUM_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_ORE_TITANIUM_KEY),
                ModOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-64), VerticalAnchor.absolute(80))));// veins per chunk
        register(context, PLUTONIUM_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_ORE_PLUTONIUM_KEY),
                ModOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-64), VerticalAnchor.absolute(80))));// veins per chunk
        register(context, VANADIUM_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_ORE_VANADIUM_KEY),
                ModOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-64), VerticalAnchor.absolute(80))));// veins per chunk
        register(context, NICKEL_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_ORE_NICKEL_KEY),
                ModOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-64), VerticalAnchor.absolute(80))));// veins per chunk
        register(context, PERIDOT_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_ORE_PERIDOT_KEY),
                ModOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-64), VerticalAnchor.absolute(80))));// veins per chunk


        //Diamond Ores
        register(context, ORE_RED_DIAMOND_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_ORE_RED_DIAMOND_KEY),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-64), VerticalAnchor.absolute(32))));// veins per chunk
        register(context, ORE_BLUE_DIAMOND_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_ORE_BLUE_DIAMOND_KEY),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-64), VerticalAnchor.absolute(32))));// veins per chunk
        register(context, ORE_GREEN_DIAMOND_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_ORE_GREEN_DIAMOND_KEY),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-64), VerticalAnchor.absolute(32))));// veins per chunk
        register(context, ORE_ORANGE_DIAMOND_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_ORE_ORANGE_DIAMOND_KEY),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-64), VerticalAnchor.absolute(32))));// veins per chunk
        register(context, ORE_YELLOW_DIAMOND_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_ORE_YELLOW_DIAMOND_KEY),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-64), VerticalAnchor.absolute(32))));// veins per chunk
        register(context, ORE_PINK_DIAMOND_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_ORE_PINK_DIAMOND_KEY),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-64), VerticalAnchor.absolute(32))));// veins per chunk
        register(context, ORE_PURPLE_DIAMOND_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_ORE_PURPLE_DIAMOND_KEY),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-64), VerticalAnchor.absolute(32))));// veins per chunk
    }


    private static ResourceKey<PlacedFeature> createKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(RealismMod.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}
