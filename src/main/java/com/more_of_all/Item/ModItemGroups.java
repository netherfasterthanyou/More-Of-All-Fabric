package com.more_of_all.Item;

import com.more_of_all.Block.ModBlocks;
import com.more_of_all.MoreOfAll;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup MORE_OF_ALL_TAB = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MoreOfAll.MOD_ID, "more_of_all_tab"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.THALLIUM))
                    .displayName(Text.translatable("itemgroup.more_of_all.more_of_all_tab"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.THALLIUM);
                        entries.add(ModItems.TERMINITE);
                        entries.add(ModItems.RAW_TERMINITE);
                        entries.add(ModBlocks.THALLIUM_BLOCK);
                        entries.add(ModBlocks.TERMINITE_BLOCK);
                        entries.add(ModBlocks.SALVAGER);
                        entries.add(ModBlocks.RAW_TERMINITE_BLOCK);
                        entries.add(ModItems.CHISEL);
                        entries.add(ModItems.BLACKSTONE_CHISEL);
                        entries.add(ModItems.DEEPSLATECHISEL);
                        entries.add(ModItems.NETHER_BRICK_CHISEL);
                        entries.add(ModItems.PRISMARINE_CHISEL);
                        entries.add(ModItems.SAND_CHISEL);
                        entries.add(ModItems.TUFF_CHISEL);
                        entries.add(ModItems.CHAINSAW);
                        entries.add(ModBlocks.DEEPSLATE_THALLIUM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_TERMINITE_ORE);
                        entries.add(ModBlocks.TERMINITE_ORE);
                        entries.add(ModBlocks.THALLIUM_ORE);
                        entries.add(ModItems.CHILI);
                        entries.add(ModItems.DORMANT_STARLIGHT);
                        entries.add(ModBlocks.TERMINITE_LAMP);
                        entries.add(ModBlocks.THALLIUM_LAMP);

                        entries.add(ModBlocks.THALLIUM_SLAB);
                        entries.add(ModBlocks.THALLIUM_STAIRS);
                        entries.add(ModBlocks.THALLIUM_BUTTON);
                        entries.add(ModBlocks.THALLIUM_PRESSURE_PLATE);
                        entries.add(ModBlocks.THALLIUM_FENCE);
                        entries.add(ModBlocks.THALLIUM_FENCE_GATE);
                        entries.add(ModBlocks.THALLIUM_WALL);
                        entries.add(ModBlocks.THALLIUM_DOOR);
                        entries.add(ModBlocks.THALLIUM_TRAPDOOR);

                        entries.add(ModItems.TERMINITE_SWORD);
                        entries.add(ModItems.TERMINITE_AXE);
                        entries.add(ModItems.TERMINITE_PICKAXE);
                        entries.add(ModItems.TERMINITE_SHOVEL);
                        entries.add(ModItems.TERMINITE_HOE);
                        entries.add(ModItems.THALLIUM_SWORD);
                        entries.add(ModItems.THALLIUM_AXE);
                        entries.add(ModItems.THALLIUM_PICKAXE);
                        entries.add(ModItems.THALLIUM_SHOVEL);
                        entries.add(ModItems.THALLIUM_HOE);
                        entries.add(ModItems.HAMMER);

                        entries.add(ModItems.TERMINITE_HELMET);
                        entries.add(ModItems.TERMINITE_CHESTPLATE);

                        entries.add(ModItems.TERMINITE_LEGGINGS);
                        entries.add(ModItems.TERMINITE_HORSE_ARMOR);
                        entries.add(ModItems.THALLIUM_HORSE_ARMOR);

                        entries.add(ModItems.TERMINITE_BOOTS);

                        entries.add(ModItems.THALLIUM_HELMET);
                        entries.add(ModItems.THALLIUM_CHESTPLATE);

                        entries.add(ModItems.THALLIUM_LEGGINGS);

                        entries.add(ModItems.THALLIUM_BOOTS);


                        entries.add(ModItems.TRACK_SMITHING_TEMPLATE);




                        entries.add(ModBlocks.TERMINITE_SLAB);
                        entries.add(ModBlocks.TERMINITE_STAIRS);
                        entries.add(ModBlocks.TERMINITE_BUTTON);
                        entries.add(ModBlocks.TERMINITE_PRESSURE_PLATE);
                        entries.add(ModBlocks.TERMINITE_FENCE);
                        entries.add(ModBlocks.TERMINITE_FENCE_GATE);
                        entries.add(ModBlocks.TERMINITE_WALL);
                        entries.add(ModBlocks.TERMINITE_DOOR);
                        entries.add(ModBlocks.TERMINITE_TRAPDOOR);
                    })


                    .build());


    public static void registerItemGroups(){
        MoreOfAll.LOGGER.info("Registering Item Groups for " + MoreOfAll.MOD_ID);
    }
}
