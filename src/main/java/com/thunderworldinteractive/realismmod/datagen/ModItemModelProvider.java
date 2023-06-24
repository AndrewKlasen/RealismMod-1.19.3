package com.thunderworldinteractive.realismmod.datagen;

import com.thunderworldinteractive.realismmod.RealismMod;
import com.thunderworldinteractive.realismmod.block.ModBlocks;
import com.thunderworldinteractive.realismmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, RealismMod.MOD_ID, existingFileHelper);
    }
    @Override
    protected void registerModels() {
        //Gems
        simpleItem(ModItems.BLACK_OPAL);
        simpleItem(ModItems.RUBY);
        simpleItem(ModItems.SAPPHIRE);
        simpleItem(ModItems.VANADIUM);
        simpleItem(ModItems.STEEL_INGOT);
        simpleItem(ModItems.TITANIUM_INGOT);
        simpleItem(ModItems.PLUTONIUM_INGOT);
        simpleItem(ModItems.NICKEL_INGOT);
        simpleItem(ModItems.PERIDOT);

        simpleItem(ModItems.RAW_BLACK_OPAL);
        simpleItem(ModItems.RAW_RUBY);
        simpleItem(ModItems.RAW_SAPPHIRE);
        simpleItem(ModItems.RAW_VANADIUM);
        simpleItem(ModItems.RAW_PLUTONIUM);
        simpleItem(ModItems.RAW_PERIDOT);

        //Diamonds
        simpleItem(ModItems.DIAMOND_RED);
        simpleItem(ModItems.DIAMOND_BLUE);
        simpleItem(ModItems.DIAMOND_GREEN);
        simpleItem(ModItems.DIAMOND_ORANGE);
        simpleItem(ModItems.DIAMOND_YELLOW);
        simpleItem(ModItems.DIAMOND_PINK);
        simpleItem(ModItems.DIAMOND_PURPLE);

        saplingItem(ModBlocks.WILLOW_SAPLING);
    }

    private ItemModelBuilder saplingItem(RegistryObject<Block> block) {
        return withExistingParent(block.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(RealismMod.MOD_ID,"block/" + block.getId().getPath()));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(RealismMod.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(RealismMod.MOD_ID,"item/" + item.getId().getPath()));
    }
}
