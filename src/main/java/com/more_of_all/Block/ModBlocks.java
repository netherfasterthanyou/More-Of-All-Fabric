package com.more_of_all.Block;

import com.more_of_all.Block.custom.SalvagerBlock;
import com.more_of_all.MoreOfAll;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
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

    public static final Block THALLIUM_ORE = registerBlock("thallium_ore",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_THALLIUM_ORE = registerBlock("deepslate_thallium_ore",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block TERMINITE_ORE = registerBlock("terminite_ore",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));
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








    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
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
