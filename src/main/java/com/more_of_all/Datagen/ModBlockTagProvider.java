package com.more_of_all.Datagen;

import com.more_of_all.Block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.THALLIUM_BLOCK)
                .add(ModBlocks.RAW_TERMINITE_BLOCK)
                .add(ModBlocks.TERMINITE_BLOCK)
                .add(ModBlocks.SALVAGER)
                .add(ModBlocks.DEEPSLATE_TERMINITE_ORE)
                .add(ModBlocks.TERMINITE_ORE)
                .add(ModBlocks.THALLIUM_ORE)
                .add(ModBlocks.DEEPSLATE_THALLIUM_ORE)
                .add(ModBlocks.MOA_GILDED_BLACKSTONE);


        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.DEEPSLATE_TERMINITE_ORE)
                .add(ModBlocks.TERMINITE_ORE)
                .add(ModBlocks.THALLIUM_ORE)
                .add(ModBlocks.DEEPSLATE_THALLIUM_ORE);


        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.TERMINITE_FENCE)
                .add(ModBlocks.THALLIUM_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.TERMINITE_FENCE_GATE)
                .add(ModBlocks.THALLIUM_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.TERMINITE_WALL)
                .add(ModBlocks.THALLIUM_WALL);
    }
}