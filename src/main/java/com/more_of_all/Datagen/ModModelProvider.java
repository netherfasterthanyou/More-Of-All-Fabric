package com.more_of_all.Datagen;

import com.more_of_all.Block.ModBlocks;
import com.more_of_all.Block.custom.LampBlock;
import com.more_of_all.Item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;

import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool thalliumPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.THALLIUM_BLOCK);
        BlockStateModelGenerator.BlockTexturePool terminitePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TERMINITE_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_TERMINITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SALVAGER);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_TERMINITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_THALLIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TERMINITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOA_GILDED_BLACKSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.THALLIUM_ORE);


        terminitePool.stairs(ModBlocks.TERMINITE_STAIRS);
        terminitePool.slab(ModBlocks.TERMINITE_SLAB);
        terminitePool.button(ModBlocks.TERMINITE_BUTTON);
        terminitePool.pressurePlate(ModBlocks.TERMINITE_PRESSURE_PLATE);
        terminitePool.wall(ModBlocks.TERMINITE_WALL);
        terminitePool.fence(ModBlocks.TERMINITE_FENCE);
        terminitePool.fenceGate(ModBlocks.TERMINITE_FENCE_GATE);

        thalliumPool.stairs(ModBlocks.THALLIUM_STAIRS);
        thalliumPool.slab(ModBlocks.THALLIUM_SLAB);
        thalliumPool.button(ModBlocks.THALLIUM_BUTTON);
        thalliumPool.pressurePlate(ModBlocks.THALLIUM_PRESSURE_PLATE);
        thalliumPool.wall(ModBlocks.THALLIUM_WALL);
        thalliumPool.fence(ModBlocks.THALLIUM_FENCE);
        thalliumPool.fenceGate(ModBlocks.THALLIUM_FENCE_GATE);


        blockStateModelGenerator.registerDoor(ModBlocks.TERMINITE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.TERMINITE_TRAPDOOR);

        blockStateModelGenerator.registerDoor(ModBlocks.THALLIUM_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.THALLIUM_TRAPDOOR);


        Identifier lampOffIdentifier = TexturedModel.CUBE_ALL.upload(ModBlocks.TERMINITE_LAMP, blockStateModelGenerator.modelCollector);
        Identifier lampOnIdentifier = blockStateModelGenerator.createSubModel(ModBlocks.TERMINITE_LAMP, "_on", Models.CUBE_ALL, TextureMap::all);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.TERMINITE_LAMP)
                .coordinate(BlockStateModelGenerator.createBooleanModelMap(LampBlock.CLICKED, lampOnIdentifier, lampOffIdentifier)));

        Identifier lampOffIdentifier2 = TexturedModel.CUBE_ALL.upload(ModBlocks.THALLIUM_LAMP, blockStateModelGenerator.modelCollector);
        Identifier lampOnIdentifier2 = blockStateModelGenerator.createSubModel(ModBlocks.THALLIUM_LAMP, "_on", Models.CUBE_ALL, TextureMap::all);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.THALLIUM_LAMP)
                .coordinate(BlockStateModelGenerator.createBooleanModelMap(LampBlock.CLICKED, lampOnIdentifier2, lampOffIdentifier2)));

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.TERMINITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHILI, Models.GENERATED);
        itemModelGenerator.register(ModItems.DORMANT_STARLIGHT, Models.GENERATED);
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
        itemModelGenerator.register(ModItems.RAYMINER, Models.HANDHELD);

        itemModelGenerator.register(ModItems.TERMINITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TERMINITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TERMINITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TERMINITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TERMINITE_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.THALLIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.THALLIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.THALLIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.THALLIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.THALLIUM_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.HAMMER, Models.HANDHELD);

    }
}