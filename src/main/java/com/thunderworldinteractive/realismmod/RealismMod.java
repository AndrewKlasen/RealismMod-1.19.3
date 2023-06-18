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
        }
        if(event.getTab() == ModCreativeModeTabs.REALISM_ITEM_TAB){
            //Other Gems
            event.accept(ModItems.BLACK_OPAL);
            event.accept(ModItems.NICKEL_INGOT);
            event.accept(ModItems.RUBY);
            event.accept(ModItems.AMETHYST);
            event.accept(ModItems.PLUTONIUM_INGOT);
            event.accept(ModItems.SAPPHIRE);
            event.accept(ModItems.STEEL_INGOT);
            event.accept(ModItems.TITANIUM_INGOT);
            event.accept(ModItems.VANADIUM);

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
