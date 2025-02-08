package com.more_of_all.Block;

import com.more_of_all.Block.custom.SalvagerBlock;
import com.more_of_all.MoreOfAll;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
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
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.TERMINITE_BLOCK);
            entries.add(ModBlocks.RAW_TERMINITE_BLOCK);
            entries.add(ModBlocks.THALLIUM_BLOCK);
        });
    }
}
