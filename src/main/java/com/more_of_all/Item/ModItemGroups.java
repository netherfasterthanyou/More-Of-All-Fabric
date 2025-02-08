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
                    })


                    .build());


    public static void registerItemGroups(){
        MoreOfAll.LOGGER.info("Registering Item Groups for " + MoreOfAll.MOD_ID);
    }
}
