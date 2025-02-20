package com.more_of_all.Datagen;

import com.more_of_all.Block.ModBlocks;
import com.more_of_all.Block.custom.BlueBerryBushBlock;
import com.more_of_all.Block.custom.ChiliCrop;
import com.more_of_all.Block.custom.LampBlock;
import com.more_of_all.Item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;

import net.minecraft.data.client.*;
import net.minecraft.item.ArmorItem;
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
        BlockStateModelGenerator.BlockTexturePool bloodwoodPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLOODWOOD_PLANKS);
        BlockStateModelGenerator.BlockTexturePool driftwoodPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DRIFTWOOD_PLANKS);
        BlockStateModelGenerator.BlockTexturePool eucalyptusPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.EUCALYPTUS_PLANKS);

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


        blockStateModelGenerator.registerCrop(ModBlocks.CHILI_CROP, ChiliCrop.AGE, 0, 1, 2, 3);

        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.BLUEBERRY_BUSH, BlockStateModelGenerator.TintType.NOT_TINTED,
                BlueBerryBushBlock.AGE, 0, 1, 2, 3);


        blockStateModelGenerator.registerLog(ModBlocks.DRIFTWOOD_LOG).log(ModBlocks.DRIFTWOOD_LOG).wood(ModBlocks.DRIFTWOOD_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_DRIFTWOOD_LOG).log(ModBlocks.STRIPPED_DRIFTWOOD_LOG).wood(ModBlocks.STRIPPED_DRIFTWOOD_WOOD);


        blockStateModelGenerator.registerSingleton(ModBlocks.DRIFTWOOD_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.DRIFTWOOD_SAPLING,
                BlockStateModelGenerator.TintType.NOT_TINTED);


        blockStateModelGenerator.registerLog(ModBlocks.BLOODWOOD_LOG).log(ModBlocks.BLOODWOOD_LOG).wood(ModBlocks.BLOODWOOD_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_BLOODWOOD_LOG).log(ModBlocks.STRIPPED_BLOODWOOD_LOG).wood(ModBlocks.STRIPPED_BLOODWOOD_WOOD);


        blockStateModelGenerator.registerSingleton(ModBlocks.BLOODWOOD_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.BLOODWOOD_SAPLING,
                BlockStateModelGenerator.TintType.NOT_TINTED);


        blockStateModelGenerator.registerLog(ModBlocks.EUCALYPTUS_LOG).log(ModBlocks.EUCALYPTUS_LOG).wood(ModBlocks.EUCALYPTUS_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_EUCALYPTUS_LOG).log(ModBlocks.STRIPPED_EUCALYPTUS_LOG).wood(ModBlocks.STRIPPED_EUCALYPTUS_WOOD);


        blockStateModelGenerator.registerSingleton(ModBlocks.EUCALYPTUS_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.EUCALYPTUS_SAPLING,
                BlockStateModelGenerator.TintType.NOT_TINTED);



        bloodwoodPool.stairs(ModBlocks.BLOODWOOD_STAIRS);
        bloodwoodPool.slab(ModBlocks.BLOODWOOD_SLAB);
        bloodwoodPool.button(ModBlocks.BLOODWOOD_BUTTON);
        bloodwoodPool.pressurePlate(ModBlocks.BLOODWOOD_PRESSURE_PLATE);
        bloodwoodPool.wall(ModBlocks.BLOODWOOD_WALL);
        bloodwoodPool.fence(ModBlocks.BLOODWOOD_FENCE);
        bloodwoodPool.fenceGate(ModBlocks.BLOODWOOD_FENCE_GATE);


        blockStateModelGenerator.registerDoor(ModBlocks.BLOODWOOD_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.BLOODWOOD_TRAPDOOR);



        driftwoodPool.stairs(ModBlocks.DRIFTWOOD_STAIRS);
        driftwoodPool.slab(ModBlocks.DRIFTWOOD_SLAB);
        driftwoodPool.button(ModBlocks.DRIFTWOOD_BUTTON);
        driftwoodPool.pressurePlate(ModBlocks.DRIFTWOOD_PRESSURE_PLATE);
        driftwoodPool.wall(ModBlocks.DRIFTWOOD_WALL);
        driftwoodPool.fence(ModBlocks.DRIFTWOOD_FENCE);
        driftwoodPool.fenceGate(ModBlocks.DRIFTWOOD_FENCE_GATE);


        blockStateModelGenerator.registerDoor(ModBlocks.DRIFTWOOD_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.DRIFTWOOD_TRAPDOOR);



        eucalyptusPool.stairs(ModBlocks.EUCALYPTUS_STAIRS);
        eucalyptusPool.slab(ModBlocks.EUCALYPTUS_SLAB);
        eucalyptusPool.button(ModBlocks.EUCALYPTUS_BUTTON);
        eucalyptusPool.pressurePlate(ModBlocks.EUCALYPTUS_PRESSURE_PLATE);
        eucalyptusPool.wall(ModBlocks.EUCALYPTUS_WALL);
        eucalyptusPool.fence(ModBlocks.EUCALYPTUS_FENCE);
        eucalyptusPool.fenceGate(ModBlocks.EUCALYPTUS_FENCE_GATE);


        blockStateModelGenerator.registerDoor(ModBlocks.EUCALYPTUS_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.EUCALYPTUS_TRAPDOOR);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.TERMINITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHILI, Models.GENERATED);
        itemModelGenerator.register(ModItems.DORMANT_STARLIGHT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_TERMINITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.THALLIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHISEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TERMINITE_HORSE_ARMOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.THALLIUM_HORSE_ARMOR, Models.GENERATED);

        itemModelGenerator.register(ModItems.TRACK_SMITHING_TEMPLATE, Models.GENERATED);



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

        itemModelGenerator.registerArmor((ArmorItem) ModItems.TERMINITE_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.TERMINITE_CHESTPLATE);

        itemModelGenerator.registerArmor((ArmorItem) ModItems.TERMINITE_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.TERMINITE_BOOTS);

        itemModelGenerator.registerArmor((ArmorItem) ModItems.THALLIUM_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.THALLIUM_CHESTPLATE);

        itemModelGenerator.registerArmor((ArmorItem) ModItems.THALLIUM_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.THALLIUM_BOOTS);


    }
}