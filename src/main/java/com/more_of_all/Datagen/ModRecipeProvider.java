package com.more_of_all.Datagen;

import com.more_of_all.Block.ModBlocks;
import com.more_of_all.Item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;

import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }



    @Override
    public void generate(RecipeExporter exporter) {
        List<ItemConvertible> THALLIUM_SMELTABLES = List.of(ModBlocks.THALLIUM_ORE,
                ModBlocks.DEEPSLATE_THALLIUM_ORE);

        offerSmelting(exporter, THALLIUM_SMELTABLES, RecipeCategory.MISC, ModItems.THALLIUM, 0.25f, 200, "thallium");
        offerBlasting(exporter, THALLIUM_SMELTABLES, RecipeCategory.MISC, ModItems.THALLIUM, 0.25f, 100, "thallium");

        List<ItemConvertible> TERMINITE_SMELTABLES = List.of(ModItems.TERMINITE, ModBlocks.TERMINITE_ORE,
                ModBlocks.DEEPSLATE_TERMINITE_ORE);

        offerSmelting(exporter, TERMINITE_SMELTABLES, RecipeCategory.MISC, ModItems.TERMINITE, 0.25f, 200, "terminite");
        offerBlasting(exporter, TERMINITE_SMELTABLES, RecipeCategory.MISC, ModItems.TERMINITE, 0.25f, 100, "terminite");


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_TERMINITE_BLOCK)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.RAW_TERMINITE)
                .criterion(hasItem(ModItems.RAW_TERMINITE), conditionsFromItem(ModItems.RAW_TERMINITE))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_TERMINITE, 9)
                .input(ModBlocks.RAW_TERMINITE_BLOCK)
                .criterion(hasItem(ModBlocks.RAW_TERMINITE_BLOCK),
                        conditionsFromItem(ModBlocks.RAW_TERMINITE_BLOCK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.TERMINITE_BLOCK)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.TERMINITE)
                .criterion(hasItem(ModItems.TERMINITE), conditionsFromItem(ModItems.TERMINITE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SALVAGER)
                .pattern("XRX")
                .pattern("RXR")
                .pattern("XRX")
                .input('R', ModItems.TERMINITE)
                .input('X', ModItems.THALLIUM)
                .criterion(hasItem(ModItems.TERMINITE), conditionsFromItem(ModItems.TERMINITE))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TERMINITE, 9)
                .input(ModBlocks.TERMINITE_BLOCK)
                .criterion(hasItem(ModBlocks.TERMINITE_BLOCK),
                        conditionsFromItem(ModBlocks.TERMINITE_BLOCK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.THALLIUM_BLOCK)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.THALLIUM)
                .criterion(hasItem(ModItems.THALLIUM), conditionsFromItem(ModItems.THALLIUM))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CHISEL)
                .pattern("SA ")
                .pattern("AX ")
                .pattern("SA ")
                .input('X', Items.IRON_INGOT)
                .input('A', Items.COBBLESTONE)
                .input('S', Items.STICK)
                        .criterion(hasItem(Items.COBBLESTONE), conditionsFromItem(Items.COBBLESTONE))
                                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.DEEPSLATECHISEL)
                .pattern("SA ")
                .pattern("AX ")
                .pattern("SA ")
                .input('X', Items.IRON_INGOT)
                .input('A', Items.COBBLED_DEEPSLATE)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.COBBLED_DEEPSLATE), conditionsFromItem(Items.COBBLED_DEEPSLATE))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BLACKSTONE_CHISEL)
                .pattern("SA ")
                .pattern("AX ")
                .pattern("SA ")
                .input('X', Items.IRON_INGOT)
                .input('A', Items.BLACKSTONE)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.BLACKSTONE), conditionsFromItem(Items.BLACKSTONE))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.NETHER_BRICK_CHISEL)
                .pattern("SA ")
                .pattern("AX ")
                .pattern("SA ")
                .input('X', Items.IRON_INGOT)
                .input('A', Items.NETHER_BRICKS)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.NETHER_BRICKS), conditionsFromItem(Items.NETHER_BRICKS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.PRISMARINE_CHISEL)
                .pattern("SA ")
                .pattern("AX ")
                .pattern("SA ")
                .input('X', Items.IRON_INGOT)
                .input('A', Items.PRISMARINE)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.PRISMARINE), conditionsFromItem(Items.PRISMARINE))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.SAND_CHISEL)
                .pattern("SA ")
                .pattern("AX ")
                .pattern("SA ")
                .input('X', Items.IRON_INGOT)
                .input('A', Items.SANDSTONE)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.SANDSTONE), conditionsFromItem(Items.SANDSTONE))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TUFF_CHISEL)
                .pattern("SA ")
                .pattern("AX ")
                .pattern("SA ")
                .input('X', Items.IRON_INGOT)
                .input('A', Items.TUFF)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.TUFF), conditionsFromItem(Items.TUFF))
                .offerTo(exporter);




        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THALLIUM, 9)
                .input(ModBlocks.THALLIUM_BLOCK)
                .criterion(hasItem(ModBlocks.THALLIUM_BLOCK),
                        conditionsFromItem(ModBlocks.THALLIUM_BLOCK))
                .offerTo(exporter);
    }
}