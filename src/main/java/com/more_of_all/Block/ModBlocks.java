package com.more_of_all.Block;

import com.more_of_all.Block.custom.BlueBerryBushBlock;
import com.more_of_all.Block.custom.ChiliCrop;
import com.more_of_all.Block.custom.LampBlock;
import com.more_of_all.Block.custom.SalvagerBlock;
import com.more_of_all.MoreOfAll;
import com.more_of_all.worldgen.tree.ModSaplingGenerators;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block TERMINITE_BLOCK = registerBlock("terminite_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block RAW_TERMINITE_BLOCK = registerBlock("raw_terminite_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block THALLIUM_BLOCK = registerBlock("thallium_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.NETHERITE)));
    public static final Block SALVAGER = registerBlock("salvager",
            new SalvagerBlock(AbstractBlock.Settings.create().strength(5f)));

    public static final Block TERMINITE_LAMP = registerBlock("terminite_lamp",
            new LampBlock(AbstractBlock.Settings.create()
                    .strength(2f).requiresTool().luminance(state -> state.get(LampBlock.CLICKED) ? 15 : 0)));

    public static final Block THALLIUM_LAMP = registerBlock("thallium_lamp",
            new LampBlock(AbstractBlock.Settings.create()
                    .strength(2f).requiresTool().luminance(state -> state.get(LampBlock.CLICKED) ? 15 : 0)));

    public static final Block THALLIUM_ORE = registerBlock("thallium_ore",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_THALLIUM_ORE = registerBlock("deepslate_thallium_ore",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block TERMINITE_ORE = registerBlock("terminite_ore",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));



    public static final Block CHILI_CROP = registerBlockWithoutBlockItem("chili_crop",
            new ChiliCrop(AbstractBlock.Settings.create().noCollision().ticksRandomly()
                    .breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)
                    .mapColor(MapColor.DARK_GREEN)));

    public static final Block BLUEBERRY_BUSH = registerBlockWithoutBlockItem("blue_berry_bush",
            new BlueBerryBushBlock(AbstractBlock.Settings.copy(Blocks.SWEET_BERRY_BUSH)));

    public static final Block DEEPSLATE_TERMINITE_ORE = registerBlock("deepslate_terminite_ore",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block MOA_GILDED_BLACKSTONE = registerBlock("moa_gilded_blackstone",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.GILDED_BLACKSTONE)));

    public static final Block TERMINITE_STAIRS = registerBlock("terminite_stairs",
            new StairsBlock(ModBlocks.TERMINITE_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f)));
    public static final Block TERMINITE_SLAB = registerBlock("terminite_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f)));

    public static final Block TERMINITE_BUTTON = registerBlock("terminite_button",
            new ButtonBlock(BlockSetType.ACACIA, 20, AbstractBlock.Settings.create().strength(2f).noCollision()));
    public static final Block TERMINITE_PRESSURE_PLATE = registerBlock("terminite_pressure_plate",
            new PressurePlateBlock(BlockSetType.ACACIA, AbstractBlock.Settings.create().strength(2f)));

    public static final Block TERMINITE_FENCE = registerBlock("terminite_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(2f)));
    public static final Block TERMINITE_WALL = registerBlock("terminite_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f)));
    public static final Block TERMINITE_FENCE_GATE = registerBlock("terminite_fence_gate",
            new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(2f)));


    public static final Block TERMINITE_DOOR = registerBlock("terminite_door",
            new DoorBlock(BlockSetType.ACACIA, AbstractBlock.Settings.create().strength(2f).nonOpaque()));
    public static final Block TERMINITE_TRAPDOOR = registerBlock("terminite_trapdoor",
            new TrapdoorBlock(BlockSetType.ACACIA, AbstractBlock.Settings.create().strength(2f).nonOpaque()));


    public static final Block THALLIUM_STAIRS = registerBlock("thallium_stairs",
            new StairsBlock(ModBlocks.THALLIUM_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f)));
    public static final Block THALLIUM_SLAB = registerBlock("thallium_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f)));

    public static final Block THALLIUM_BUTTON = registerBlock("thallium_button",
            new ButtonBlock(BlockSetType.ACACIA, 20, AbstractBlock.Settings.create().strength(2f).noCollision()));
    public static final Block THALLIUM_PRESSURE_PLATE = registerBlock("thallium_pressure_plate",
            new PressurePlateBlock(BlockSetType.ACACIA, AbstractBlock.Settings.create().strength(2f)));

    public static final Block THALLIUM_FENCE = registerBlock("thallium_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(2f)));
    public static final Block THALLIUM_WALL = registerBlock("thallium_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f)));
    public static final Block THALLIUM_FENCE_GATE = registerBlock("thallium_fence_gate",
            new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(2f)));


    public static final Block THALLIUM_DOOR = registerBlock("thallium_door",
            new DoorBlock(BlockSetType.ACACIA, AbstractBlock.Settings.create().strength(2f).nonOpaque()));
    public static final Block THALLIUM_TRAPDOOR = registerBlock("thallium_trapdoor",
            new TrapdoorBlock(BlockSetType.ACACIA, AbstractBlock.Settings.create().strength(2f).nonOpaque()));

    public static  final Block DRIFTWOOD_LOG = registerBlock("driftwood_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));
    public static  final Block STRIPPED_DRIFTWOOD_LOG = registerBlock("stripped_driftwood_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)));
    public static  final Block DRIFTWOOD_WOOD = registerBlock("driftwood_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
    public static  final Block STRIPPED_DRIFTWOOD_WOOD = registerBlock("stripped_driftwood_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));

    public static  final Block DRIFTWOOD_PLANKS = registerBlock("driftwood_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static  final Block DRIFTWOOD_LEAVES = registerBlock("driftwood_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)));

    public static  final Block DRIFTWOOD_SAPLING = registerBlock("driftwood_sapling",
            new SaplingBlock(ModSaplingGenerators.DRIFTWOOD,AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));

    public static  final Block EUCALYPTUS_LOG = registerBlock("eucalyptus_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));
    public static  final Block STRIPPED_EUCALYPTUS_LOG = registerBlock("stripped_eucalyptus_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)));
    public static  final Block EUCALYPTUS_WOOD = registerBlock("eucalyptus_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
    public static  final Block STRIPPED_EUCALYPTUS_WOOD = registerBlock("stripped_eucalyptus_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));

    public static  final Block EUCALYPTUS_PLANKS = registerBlock("eucalyptus_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static  final Block EUCALYPTUS_LEAVES = registerBlock("eucalyptus_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)));

    public static  final Block EUCALYPTUS_SAPLING = registerBlock("eucalyptus_sapling",
            new SaplingBlock(ModSaplingGenerators.EUCALYPTUS ,AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));

    public static  final Block BLOODWOOD_LOG = registerBlock("bloodwood_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));
    public static  final Block STRIPPED_BLOODWOOD_LOG = registerBlock("stripped_bloodwood_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)));
    public static  final Block BLOODWOOD_WOOD = registerBlock("bloodwood_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
    public static  final Block STRIPPED_BLOODWOOD_WOOD = registerBlock("stripped_bloodwood_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));

    public static  final Block BLOODWOOD_PLANKS = registerBlock("bloodwood_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static  final Block BLOODWOOD_LEAVES = registerBlock("bloodwood_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)));

    public static  final Block BLOODWOOD_SAPLING = registerBlock("bloodwood_sapling",
            new SaplingBlock(ModSaplingGenerators.BLOODWOOD ,AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));



    public static final Block BLOODWOOD_STAIRS = registerBlock("bloodwood_stairs",
            new StairsBlock(ModBlocks.BLOODWOOD_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f)));
    public static final Block BLOODWOOD_SLAB = registerBlock("bloodwood_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f)));

    public static final Block BLOODWOOD_BUTTON = registerBlock("bloodwood_button",
            new ButtonBlock(BlockSetType.ACACIA, 20, AbstractBlock.Settings.create().strength(2f).noCollision()));
    public static final Block BLOODWOOD_PRESSURE_PLATE = registerBlock("bloodwood_pressure_plate",
            new PressurePlateBlock(BlockSetType.ACACIA, AbstractBlock.Settings.create().strength(2f)));

    public static final Block BLOODWOOD_FENCE = registerBlock("bloodwood_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(2f)));
    public static final Block BLOODWOOD_WALL = registerBlock("bloodwood_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f)));
    public static final Block BLOODWOOD_FENCE_GATE = registerBlock("bloodwood_fence_gate",
            new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(2f)));


    public static final Block BLOODWOOD_DOOR = registerBlock("bloodwood_door",
            new DoorBlock(BlockSetType.ACACIA, AbstractBlock.Settings.create().strength(2f).nonOpaque()));
    public static final Block BLOODWOOD_TRAPDOOR = registerBlock("bloodwood_trapdoor",
            new TrapdoorBlock(BlockSetType.ACACIA, AbstractBlock.Settings.create().strength(2f).nonOpaque()));


    public static final Block DRIFTWOOD_STAIRS = registerBlock("driftwood_stairs",
            new StairsBlock(ModBlocks.DRIFTWOOD_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f)));
    public static final Block DRIFTWOOD_SLAB = registerBlock("driftwood_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f)));

    public static final Block DRIFTWOOD_BUTTON = registerBlock("driftwood_button",
            new ButtonBlock(BlockSetType.ACACIA, 20, AbstractBlock.Settings.create().strength(2f).noCollision()));
    public static final Block DRIFTWOOD_PRESSURE_PLATE = registerBlock("driftwood_pressure_plate",
            new PressurePlateBlock(BlockSetType.ACACIA, AbstractBlock.Settings.create().strength(2f)));

    public static final Block DRIFTWOOD_FENCE = registerBlock("driftwood_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(2f)));
    public static final Block DRIFTWOOD_WALL = registerBlock("driftwood_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f)));
    public static final Block DRIFTWOOD_FENCE_GATE = registerBlock("driftwood_fence_gate",
            new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(2f)));


    public static final Block DRIFTWOOD_DOOR = registerBlock("driftwood_door",
            new DoorBlock(BlockSetType.ACACIA, AbstractBlock.Settings.create().strength(2f).nonOpaque()));
    public static final Block DRIFTWOOD_TRAPDOOR = registerBlock("driftwood_trapdoor",
            new TrapdoorBlock(BlockSetType.ACACIA, AbstractBlock.Settings.create().strength(2f).nonOpaque()));


    public static final Block EUCALYPTUS_STAIRS = registerBlock("eucalyptus_stairs",
            new StairsBlock(ModBlocks.DRIFTWOOD_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f)));
    public static final Block EUCALYPTUS_SLAB = registerBlock("eucalyptus_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f)));

    public static final Block EUCALYPTUS_BUTTON = registerBlock("eucalyptus_button",
            new ButtonBlock(BlockSetType.ACACIA, 20, AbstractBlock.Settings.create().strength(2f).noCollision()));
    public static final Block EUCALYPTUS_PRESSURE_PLATE = registerBlock("eucalyptus_pressure_plate",
            new PressurePlateBlock(BlockSetType.ACACIA, AbstractBlock.Settings.create().strength(2f)));

    public static final Block EUCALYPTUS_FENCE = registerBlock("eucalyptus_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(2f)));
    public static final Block EUCALYPTUS_WALL = registerBlock("eucalyptus_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f)));
    public static final Block EUCALYPTUS_FENCE_GATE = registerBlock("eucalyptus_fence_gate",
            new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(2f)));


    public static final Block EUCALYPTUS_DOOR = registerBlock("eucalyptus_door",
            new DoorBlock(BlockSetType.ACACIA, AbstractBlock.Settings.create().strength(2f).nonOpaque()));
    public static final Block EUCALYPTUS_TRAPDOOR = registerBlock("eucalyptus_trapdoor",
            new TrapdoorBlock(BlockSetType.ACACIA, AbstractBlock.Settings.create().strength(2f).nonOpaque()));









    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(MoreOfAll.MOD_ID, name), block);
    }

    private static Block registerBlockWithoutBlockItem(String name, Block block){
        return Registry.register(Registries.BLOCK, Identifier.of(MoreOfAll.MOD_ID, name), block);
    }


    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(MoreOfAll.MOD_ID,
                name), new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        MoreOfAll.LOGGER.info("Registering Mod Blocks for" + MoreOfAll.MOD_ID);

    }
}
