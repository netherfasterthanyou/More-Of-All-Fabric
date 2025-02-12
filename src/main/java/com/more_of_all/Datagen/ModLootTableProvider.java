package com.more_of_all.Datagen;

import com.more_of_all.Block.ModBlocks;
import com.more_of_all.Item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.TERMINITE_BLOCK);
        addDrop(ModBlocks.MOA_GILDED_BLACKSTONE);
        addDrop(ModBlocks.THALLIUM_BLOCK);
        addDrop(ModBlocks.RAW_TERMINITE_BLOCK);
        addDrop(ModBlocks.SALVAGER);

        addDrop(ModBlocks.THALLIUM_ORE, oreDrops(ModBlocks.THALLIUM_ORE, ModItems.THALLIUM));
        addDrop(ModBlocks.DEEPSLATE_THALLIUM_ORE, oreDrops(ModBlocks.DEEPSLATE_THALLIUM_ORE, ModItems.THALLIUM));
        addDrop(ModBlocks.DEEPSLATE_TERMINITE_ORE, oreDrops(ModBlocks.DEEPSLATE_TERMINITE_ORE, ModItems.TERMINITE));
        addDrop(ModBlocks.TERMINITE_ORE, oreDrops(ModBlocks.TERMINITE_ORE, ModItems.TERMINITE));

        addDrop(ModBlocks.TERMINITE_STAIRS);
        addDrop(ModBlocks.TERMINITE_BUTTON);
        addDrop(ModBlocks.TERMINITE_PRESSURE_PLATE);
        addDrop(ModBlocks.TERMINITE_WALL);
        addDrop(ModBlocks.TERMINITE_FENCE);
        addDrop(ModBlocks.TERMINITE_FENCE_GATE);
        addDrop(ModBlocks.TERMINITE_TRAPDOOR);
        addDrop(ModBlocks.TERMINITE_SLAB, slabDrops(ModBlocks.TERMINITE_SLAB));
        addDrop(ModBlocks.TERMINITE_DOOR, doorDrops(ModBlocks.TERMINITE_DOOR));

        addDrop(ModBlocks.THALLIUM_STAIRS);
        addDrop(ModBlocks.THALLIUM_BUTTON);
        addDrop(ModBlocks.THALLIUM_PRESSURE_PLATE);
        addDrop(ModBlocks.THALLIUM_WALL);
        addDrop(ModBlocks.THALLIUM_FENCE);
        addDrop(ModBlocks.THALLIUM_FENCE_GATE);
        addDrop(ModBlocks.THALLIUM_TRAPDOOR);
        addDrop(ModBlocks.THALLIUM_SLAB, slabDrops(ModBlocks.THALLIUM_SLAB));
        addDrop(ModBlocks.THALLIUM_DOOR, doorDrops(ModBlocks.THALLIUM_DOOR));



    }

    public LootTable.Builder multipleOreDrops(Block drop, Item item, float minDrops, float maxDrops) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
                ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops))))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
    }
}