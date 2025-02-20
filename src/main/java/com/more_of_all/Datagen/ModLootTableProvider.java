package com.more_of_all.Datagen;

import com.more_of_all.Block.ModBlocks;
import com.more_of_all.Block.custom.BlueBerryBushBlock;
import com.more_of_all.Block.custom.ChiliCrop;
import com.more_of_all.Item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SweetBerryBushBlock;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
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
        addDrop(ModBlocks.THALLIUM_LAMP);
        addDrop(ModBlocks.TERMINITE_LAMP);



        addDrop(ModBlocks.BLOODWOOD_STAIRS);
        addDrop(ModBlocks.BLOODWOOD_BUTTON);
        addDrop(ModBlocks.BLOODWOOD_PRESSURE_PLATE);
        addDrop(ModBlocks.BLOODWOOD_WALL);
        addDrop(ModBlocks.BLOODWOOD_FENCE);
        addDrop(ModBlocks.BLOODWOOD_FENCE_GATE);
        addDrop(ModBlocks.BLOODWOOD_TRAPDOOR);
        addDrop(ModBlocks.BLOODWOOD_SLAB, slabDrops(ModBlocks.BLOODWOOD_SLAB));
        addDrop(ModBlocks.BLOODWOOD_DOOR, doorDrops(ModBlocks.BLOODWOOD_DOOR));

        addDrop(ModBlocks.DRIFTWOOD_STAIRS);
        addDrop(ModBlocks.DRIFTWOOD_BUTTON);
        addDrop(ModBlocks.DRIFTWOOD_PRESSURE_PLATE);
        addDrop(ModBlocks.DRIFTWOOD_WALL);
        addDrop(ModBlocks.DRIFTWOOD_FENCE);
        addDrop(ModBlocks.DRIFTWOOD_FENCE_GATE);
        addDrop(ModBlocks.DRIFTWOOD_TRAPDOOR);
        addDrop(ModBlocks.DRIFTWOOD_SLAB, slabDrops(ModBlocks.DRIFTWOOD_SLAB));
        addDrop(ModBlocks.DRIFTWOOD_DOOR, doorDrops(ModBlocks.DRIFTWOOD_DOOR));


        addDrop(ModBlocks.EUCALYPTUS_STAIRS);
        addDrop(ModBlocks.EUCALYPTUS_BUTTON);
        addDrop(ModBlocks.EUCALYPTUS_PRESSURE_PLATE);
        addDrop(ModBlocks.EUCALYPTUS_WALL);
        addDrop(ModBlocks.EUCALYPTUS_FENCE);
        addDrop(ModBlocks.EUCALYPTUS_FENCE_GATE);
        addDrop(ModBlocks.EUCALYPTUS_TRAPDOOR);
        addDrop(ModBlocks.EUCALYPTUS_SLAB, slabDrops(ModBlocks.EUCALYPTUS_SLAB));
        addDrop(ModBlocks.EUCALYPTUS_DOOR, doorDrops(ModBlocks.EUCALYPTUS_DOOR));



        BlockStatePropertyLootCondition.Builder builder2 = BlockStatePropertyLootCondition.builder(ModBlocks.CHILI_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(ChiliCrop.AGE, 3));
        this.addDrop(ModBlocks.CHILI_CROP, this.cropDrops(ModBlocks.CHILI_CROP, ModItems.CHILI, ModItems.CHILI_SEEDS, builder2));


        this.addDrop(
                ModBlocks.BLUEBERRY_BUSH,
                block -> this.applyExplosionDecay(
                        block,
                        LootTable.builder()
                                .pool(
                                        LootPool.builder()
                                                .conditionally(
                                                        BlockStatePropertyLootCondition.builder(ModBlocks.BLUEBERRY_BUSH).properties(StatePredicate.Builder.create().exactMatch(BlueBerryBushBlock.AGE, 3))
                                                )
                                                .with(ItemEntry.builder(ModItems.BLUEBERRIES))
                                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0F, 3.0F)))
                                                .apply(ApplyBonusLootFunction.uniformBonusCount(impl.getOrThrow(Enchantments.FORTUNE)))
                                )
                                .pool(
                                        LootPool.builder()
                                                .conditionally(
                                                        BlockStatePropertyLootCondition.builder(ModBlocks.BLUEBERRY_BUSH).properties(StatePredicate.Builder.create().exactMatch(BlueBerryBushBlock.AGE, 2))
                                                )
                                                .with(ItemEntry.builder(ModItems.BLUEBERRIES))
                                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 2.0F)))
                                                .apply(ApplyBonusLootFunction.uniformBonusCount(impl.getOrThrow(Enchantments.FORTUNE)))
                                )));

        addDrop(ModBlocks.DRIFTWOOD_LOG);
        addDrop(ModBlocks.DRIFTWOOD_WOOD);
        addDrop(ModBlocks.STRIPPED_DRIFTWOOD_LOG);
        addDrop(ModBlocks.STRIPPED_DRIFTWOOD_WOOD);
        addDrop(ModBlocks.DRIFTWOOD_PLANKS);
        addDrop(ModBlocks.DRIFTWOOD_SAPLING);

        addDrop(ModBlocks.DRIFTWOOD_LEAVES, leavesDrops(ModBlocks.DRIFTWOOD_LEAVES, ModBlocks.DRIFTWOOD_SAPLING, 0.0625f));



        addDrop(ModBlocks.BLOODWOOD_LOG);
        addDrop(ModBlocks.BLOODWOOD_WOOD);
        addDrop(ModBlocks.STRIPPED_BLOODWOOD_LOG);
        addDrop(ModBlocks.STRIPPED_BLOODWOOD_WOOD);
        addDrop(ModBlocks.BLOODWOOD_PLANKS);
        addDrop(ModBlocks.BLOODWOOD_SAPLING);

        addDrop(ModBlocks.BLOODWOOD_LEAVES, leavesDrops(ModBlocks.BLOODWOOD_LEAVES, ModBlocks.BLOODWOOD_SAPLING, 0.0625f));



        addDrop(ModBlocks.EUCALYPTUS_LOG);
        addDrop(ModBlocks.EUCALYPTUS_WOOD);
        addDrop(ModBlocks.STRIPPED_EUCALYPTUS_LOG);
        addDrop(ModBlocks.STRIPPED_EUCALYPTUS_WOOD);
        addDrop(ModBlocks.EUCALYPTUS_PLANKS);
        addDrop(ModBlocks.EUCALYPTUS_SAPLING);

        addDrop(ModBlocks.EUCALYPTUS_LEAVES, leavesDrops(ModBlocks.EUCALYPTUS_LEAVES, ModBlocks.EUCALYPTUS_SAPLING, 0.0625f));
    }

    public LootTable.Builder multipleOreDrops(Block drop, Item item, float minDrops, float maxDrops) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
                ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops))))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
    }
}