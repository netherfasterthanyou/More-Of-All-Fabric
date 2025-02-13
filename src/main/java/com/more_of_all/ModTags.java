package com.more_of_all;


import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {

        public static final TagKey<Block> NEEDS_TERMINITE_TOOL = createTag("needs_terminite_tool");
        public static final TagKey<Block> INCORRECT_FOR_TERMINITE_TOOL = createTag("incorrect_for_terminite_tool");
        public static final TagKey<Block> NEEDS_THALLIUM_TOOL = createTag("needs_thallium_tool");
        public static final TagKey<Block> INCORRECT_FOR_THALLIUM_TOOL = createTag("incorrect_for_thallium_tool");



        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(MoreOfAll.MOD_ID, name));
        }
        public static class Items {


            private static TagKey<Item> createTag(String name) {
                return TagKey.of(RegistryKeys.ITEM, Identifier.of(MoreOfAll.MOD_ID, name));
            }
        }
    }
}