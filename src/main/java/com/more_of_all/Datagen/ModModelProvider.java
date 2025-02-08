package com.more_of_all.Datagen;

import com.more_of_all.Block.ModBlocks;
import com.more_of_all.Item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;

import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.THALLIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TERMINITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_TERMINITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SALVAGER);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_TERMINITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_THALLIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TERMINITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.THALLIUM_ORE);


    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.TERMINITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_TERMINITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.THALLIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHISEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BLACKSTONE_CHISEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DEEPSLATECHISEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHER_BRICK_CHISEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PRISMARINE_CHISEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAND_CHISEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TUFF_CHISEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CHAINSAW, Models.HANDHELD);

    }
}