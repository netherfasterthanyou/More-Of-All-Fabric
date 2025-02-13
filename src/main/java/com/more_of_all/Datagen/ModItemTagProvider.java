package com.more_of_all.Datagen;

import com.more_of_all.Item. ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);

    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
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


    }
}