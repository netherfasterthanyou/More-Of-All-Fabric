package com.more_of_all.Datagen;

import com.more_of_all.Block.ModBlocks;
import com.more_of_all.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

import net.minecraft.block.Blocks;
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
                .add(ModBlocks.MOA_GILDED_BLACKSTONE)
                .add(ModBlocks.TERMINITE_LAMP)
                .add(ModBlocks.THALLIUM_LAMP);







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
                .add(ModBlocks.BLOODWOOD_FENCE_GATE)
                .add(ModBlocks.DRIFTWOOD_FENCE_GATE)
                .add(ModBlocks.EUCALYPTUS_FENCE_GATE)
                .add(ModBlocks.THALLIUM_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.TERMINITE_WALL)
                .add(ModBlocks.BLOODWOOD_WALL)
                .add(ModBlocks.DRIFTWOOD_WALL)
                .add(ModBlocks.EUCALYPTUS_WALL)
                .add(ModBlocks.THALLIUM_WALL);


        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.EUCALYPTUS_LOG)
                .add(ModBlocks.EUCALYPTUS_WOOD)
                .add(ModBlocks.STRIPPED_EUCALYPTUS_WOOD)
                .add(ModBlocks.STRIPPED_EUCALYPTUS_LOG)
                .add(ModBlocks.DRIFTWOOD_LOG)
                .add(ModBlocks.DRIFTWOOD_WOOD)
                .add(ModBlocks.STRIPPED_DRIFTWOOD_WOOD)
                .add(ModBlocks.STRIPPED_DRIFTWOOD_LOG)
                .add(ModBlocks.BLOODWOOD_LOG)
                .add(ModBlocks.BLOODWOOD_WOOD)
                .add(ModBlocks.STRIPPED_BLOODWOOD_WOOD)
                .add(ModBlocks.STRIPPED_BLOODWOOD_LOG);

        getOrCreateTagBuilder(BlockTags.PLANKS)
                .add(ModBlocks.EUCALYPTUS_PLANKS)
                .add(ModBlocks.BLOODWOOD_PLANKS)
                .add(ModBlocks.DRIFTWOOD_PLANKS);
    }
}
