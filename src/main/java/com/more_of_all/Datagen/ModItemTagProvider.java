package com.more_of_all.Datagen;

import com.more_of_all.Block.ModBlocks;
import com.more_of_all.Item. ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);

    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {


        getOrCreateTagBuilder(ItemTags.LEG_ARMOR_ENCHANTABLE)
                .add(ModItems.TERMINITE_LEGGINGS   )
                .add(ModItems.THALLIUM_LEGGINGS   );
        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR_ENCHANTABLE)
                .add(ModItems.TERMINITE_HELMET   )
                .add(ModItems.THALLIUM_HELMET   );

        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR_ENCHANTABLE)
                .add(ModItems.TERMINITE_CHESTPLATE   )
                .add(ModItems.THALLIUM_CHESTPLATE   );
        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR_ENCHANTABLE)
                .add(ModItems.TERMINITE_BOOTS   )
                .add(ModItems.THALLIUM_BOOTS   );



        getOrCreateTagBuilder(ItemTags.DURABILITY_ENCHANTABLE)
                .add(ModItems.TERMINITE_HELMET   )
                .add(ModItems.TERMINITE_CHESTPLATE   )
                .add(ModItems.TERMINITE_LEGGINGS   )
                .add(ModItems.TERMINITE_BOOTS   )
                .add(ModItems.THALLIUM_HELMET   )
                .add(ModItems.THALLIUM_CHESTPLATE   )
                .add(ModItems.THALLIUM_LEGGINGS   )
                .add(ModItems.THALLIUM_BOOTS   );
        
        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add( ModItems.THALLIUM_SWORD)
                .add( ModItems.TERMINITE_SWORD);

        getOrCreateTagBuilder(ItemTags.AXES)
                .add( ModItems.THALLIUM_AXE)
                .add( ModItems.TERMINITE_AXE);

        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add( ModItems.THALLIUM_PICKAXE)
                .add( ModItems.TERMINITE_PICKAXE);

        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add( ModItems.THALLIUM_SHOVEL)
                .add( ModItems.TERMINITE_SHOVEL);

        getOrCreateTagBuilder(ItemTags.HOES)
                .add( ModItems.THALLIUM_HOE)
                .add( ModItems.TERMINITE_HOE);
        getOrCreateTagBuilder(ItemTags.DURABILITY_ENCHANTABLE)

                .add( ModItems.TERMINITE_SWORD  )
                .add( ModItems.THALLIUM_SWORD  )
                .add( ModItems.HAMMER  )
                .add( ModItems.THALLIUM_AXE  )
                .add( ModItems.TERMINITE_AXE  )
                .add( ModItems.THALLIUM_PICKAXE  )
                .add( ModItems.THALLIUM_AXE  )
                .add( ModItems.THALLIUM_SHOVEL  )
                .add( ModItems.THALLIUM_HOE  )

                .add( ModItems.TERMINITE_SHOVEL  )
                .add( ModItems.TERMINITE_AXE  )
                .add( ModItems.TERMINITE_PICKAXE  )
                .add( ModItems.TERMINITE_HOE  );

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.TERMINITE_CHESTPLATE)

                .add(ModItems.TERMINITE_BOOTS)
                .add(ModItems.TERMINITE_LEGGINGS)

                .add(ModItems.TERMINITE_HELMET)
                .add(ModItems.THALLIUM_CHESTPLATE)

                .add(ModItems.THALLIUM_BOOTS)
                .add(ModItems.THALLIUM_LEGGINGS)

                .add(ModItems.THALLIUM_HELMET);

        getOrCreateTagBuilder(ItemTags.SWORD_ENCHANTABLE)
                .add( ModItems.TERMINITE_SWORD  )
                .add( ModItems.THALLIUM_SWORD  )
                .add( ModItems.HAMMER  );
        getOrCreateTagBuilder(ItemTags.SHARP_WEAPON_ENCHANTABLE)
                .add( ModItems.TERMINITE_SWORD  )
                .add( ModItems.HAMMER  )
                .add( ModItems.THALLIUM_SWORD  )
                .add( ModItems.THALLIUM_AXE  )
                .add( ModItems.TERMINITE_AXE  );
        getOrCreateTagBuilder(ItemTags.MINING_ENCHANTABLE)

                .add( ModItems.THALLIUM_PICKAXE  )
                .add( ModItems.THALLIUM_AXE  )
                .add( ModItems.THALLIUM_SHOVEL  )
                .add( ModItems.THALLIUM_HOE  )

                .add( ModItems.TERMINITE_SHOVEL  )
                .add( ModItems.TERMINITE_AXE  )
                .add( ModItems.TERMINITE_PICKAXE  )
                .add( ModItems.TERMINITE_HOE  )
                .add( ModItems.HAMMER  );

        getOrCreateTagBuilder(ItemTags.MINING_LOOT_ENCHANTABLE)

                .add( ModItems.THALLIUM_PICKAXE  )
                .add( ModItems.THALLIUM_AXE  )
                .add( ModItems.THALLIUM_SHOVEL)
                .add( ModItems.THALLIUM_HOE)

                .add( ModItems.TERMINITE_SHOVEL)
                .add( ModItems.TERMINITE_AXE)
                .add( ModItems.TERMINITE_PICKAXE)
                .add( ModItems.TERMINITE_HOE)
                .add( ModItems.HAMMER  );

        getOrCreateTagBuilder(ItemTags.TRIM_MATERIALS)
                .add(ModItems.THALLIUM)
                .add(ModItems.TERMINITE);

        getOrCreateTagBuilder(ItemTags.TRIM_TEMPLATES)
                .add(ModItems.TRACK_SMITHING_TEMPLATE);

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.EUCALYPTUS_LOG.asItem())
                .add(ModBlocks.EUCALYPTUS_WOOD.asItem())
                .add(ModBlocks.STRIPPED_EUCALYPTUS_WOOD.asItem())
                .add(ModBlocks.STRIPPED_EUCALYPTUS_LOG.asItem())
                .add(ModBlocks.DRIFTWOOD_LOG.asItem())
                .add(ModBlocks.DRIFTWOOD_WOOD.asItem())
                .add(ModBlocks.STRIPPED_DRIFTWOOD_WOOD.asItem())
                .add(ModBlocks.STRIPPED_DRIFTWOOD_LOG.asItem())
                .add(ModBlocks.BLOODWOOD_LOG.asItem())
                .add(ModBlocks.BLOODWOOD_WOOD.asItem())
                .add(ModBlocks.STRIPPED_BLOODWOOD_WOOD.asItem())
                .add(ModBlocks.STRIPPED_BLOODWOOD_LOG.asItem());

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.EUCALYPTUS_PLANKS.asItem())
                .add(ModBlocks.BLOODWOOD_PLANKS.asItem())
                .add(ModBlocks.DRIFTWOOD_PLANKS.asItem());
    }
}