package com.thunderworldinteractive.realismmod;

import com.mojang.logging.LogUtils;
import com.thunderworldinteractive.realismmod.block.ModBlocks;
import com.thunderworldinteractive.realismmod.item.ModCreativeModeTabs;
import com.thunderworldinteractive.realismmod.item.ModItems;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(RealismMod.MOD_ID)
public class RealismMod
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "realismmod";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public RealismMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    private void addCreative(CreativeModeTabEvent.BuildContents event)
    {
        if(event.getTab() == ModCreativeModeTabs.REALISM_BLOCK_TAB){
            //Other Gems
            event.accept(ModBlocks.BLACK_OPAL_BLOCK);
            event.accept(ModBlocks.NICKEL_BLOCK);
            event.accept(ModBlocks.PERIDOT_BLOCK);
            event.accept(ModBlocks.RUBY_BLOCK);
            event.accept(ModBlocks.STEEL_BLOCK);
            event.accept(ModBlocks.PLUTONIUM_BLOCK);
            event.accept(ModBlocks.VANADIUM_BLOCK);
            event.accept(ModBlocks.TITANIUM_BLOCK);
            event.accept(ModBlocks.SAPPHIRE_BLOCK);

            //Gem Ores
            event.accept(ModBlocks.ORE_BLACK_OPAL);
            event.accept(ModBlocks.ORE_NICKEL);
            event.accept(ModBlocks.ORE_PERIDOT);
            event.accept(ModBlocks.ORE_RUBY);
            event.accept(ModBlocks.ORE_PLUTONIUM);
            event.accept(ModBlocks.ORE_VANADIUM);
            event.accept(ModBlocks.ORE_TITANIUM);
            event.accept(ModBlocks.ORE_SAPPHIRE);

            event.accept(ModBlocks.ORE_CHROMIUM);
            event.accept(ModBlocks.ORE_ZINC);
            event.accept(ModBlocks.ORE_SILVER);
            event.accept(ModBlocks.ORE_COBALT);
            event.accept(ModBlocks.ORE_ALUMINUM);
            event.accept(ModBlocks.ORE_JADE);
            event.accept(ModBlocks.ORE_TIN);


            //Diamond Blocks
            event.accept(ModBlocks.BLOCK_BLUE_DIAMOND);
            event.accept(ModBlocks.BLOCK_RED_DIAMOND);
            event.accept(ModBlocks.BLOCK_ORANGE_DIAMOND);
            event.accept(ModBlocks.BLOCK_YELLOW_DIAMOND);
            event.accept(ModBlocks.BLOCK_PINK_DIAMOND);
            event.accept(ModBlocks.BLOCK_PURPLE_DIAMOND);
            event.accept(ModBlocks.BLOCK_GREEN_DIAMOND);
            
            //ALL Diamond Ores
            event.accept(ModBlocks.ORE_BLUE_DIAMOND);
            event.accept(ModBlocks.ORE_RED_DIAMOND);
            event.accept(ModBlocks.ORE_ORANGE_DIAMOND);
            event.accept(ModBlocks.ORE_YELLOW_DIAMOND);
            event.accept(ModBlocks.ORE_PINK_DIAMOND);
            event.accept(ModBlocks.ORE_PURPLE_DIAMOND);
            event.accept(ModBlocks.ORE_GREEN_DIAMOND);

            event.accept(ModBlocks.DEEPSLATE_ORE_BLUE_DIAMOND);
            event.accept(ModBlocks.DEEPSLATE_ORE_RED_DIAMOND);
            event.accept(ModBlocks.DEEPSLATE_ORE_ORANGE_DIAMOND);
            event.accept(ModBlocks.DEEPSLATE_ORE_YELLOW_DIAMOND);
            event.accept(ModBlocks.DEEPSLATE_ORE_PINK_DIAMOND);
            event.accept(ModBlocks.DEEPSLATE_ORE_PURPLE_DIAMOND);
            event.accept(ModBlocks.DEEPSLATE_ORE_GREEN_DIAMOND);


            //LOGS
            event.accept(ModBlocks.WILLOW_LEAVES);
            event.accept(ModBlocks.WILLOW_LOG);
            event.accept(ModBlocks.WILLOW_WOOD);
            event.accept(ModBlocks.WILLOW_PLANKS);
            event.accept(ModBlocks.STRIPPED_WILLOW_LOG);
            event.accept(ModBlocks.STRIPPED_WILLOW_WOOD);
            event.accept(ModBlocks.WILLOW_SAPLING);

        }
        if(event.getTab() == ModCreativeModeTabs.REALISM_ITEM_TAB){
            //Other Gems
            event.accept(ModItems.BLACK_OPAL);
            event.accept(ModItems.NICKEL_INGOT);
            event.accept(ModItems.RUBY);
            event.accept(ModItems.PLUTONIUM_INGOT);
            event.accept(ModItems.SAPPHIRE);
            event.accept(ModItems.STEEL_INGOT);
            event.accept(ModItems.TITANIUM_INGOT);
            event.accept(ModItems.VANADIUM);
            event.accept(ModItems.PERIDOT);

            event.accept(ModItems.RAW_CHROMIUM);
            event.accept(ModItems.RAW_ZINC);
            event.accept(ModItems.RAW_SILVER);
            event.accept(ModItems.RAW_COBALT);
            event.accept(ModItems.RAW_ALUMINUM);
            event.accept(ModItems.RAW_JADE);
            event.accept(ModItems.RAW_TIN);
            //raw Gems
            event.accept(ModItems.RAW_RUBY);
            event.accept(ModItems.RAW_PLUTONIUM);
            event.accept(ModItems.RAW_SAPPHIRE);
            event.accept(ModItems.RAW_VANADIUM);
            event.accept(ModItems.RAW_PERIDOT);

            event.accept(ModItems.CHROMIUM_INGOT);
            event.accept(ModItems.ZINC_INGOT);
            event.accept(ModItems.SILVER_INGOT);
            event.accept(ModItems.COBALT_INGOT);
            event.accept(ModItems.ALUMINUM_INGOT);
            event.accept(ModItems.JADE_INGOT);
            event.accept(ModItems.TIN_INGOT);

            //Diamond Ingots
            event.accept(ModItems.DIAMOND_BLUE);
            event.accept(ModItems.DIAMOND_GREEN);
            event.accept(ModItems.DIAMOND_ORANGE);
            event.accept(ModItems.DIAMOND_PURPLE);
            event.accept(ModItems.DIAMOND_PINK);
            event.accept(ModItems.DIAMOND_RED);
            event.accept(ModItems.DIAMOND_YELLOW);
        }
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
