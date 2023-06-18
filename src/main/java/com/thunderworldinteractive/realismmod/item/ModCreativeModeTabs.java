package com.thunderworldinteractive.realismmod.item;

import com.thunderworldinteractive.realismmod.RealismMod;
import com.thunderworldinteractive.realismmod.block.ModBlocks;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = RealismMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab REALISM_ITEM_TAB;
    public static CreativeModeTab REALISM_BLOCK_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        REALISM_ITEM_TAB = event.registerCreativeModeTab(new ResourceLocation(RealismMod.MOD_ID, "realism_item_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.BLACK_OPAL.get()))
                        .title(Component.translatable("creativemodetab.realism_item_tab")));

        REALISM_BLOCK_TAB = event.registerCreativeModeTab(new ResourceLocation(RealismMod.MOD_ID, "realism_block_tab"),
                builder -> builder.icon(() -> new ItemStack(ModBlocks.BLACK_OPAL_BLOCK.get()))
                        .title(Component.translatable("creativemodetab.realism_block_tab")));

    }
}
