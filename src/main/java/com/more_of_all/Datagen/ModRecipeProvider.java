package com.more_of_all.Datagen;

import com.more_of_all.Block.ModBlocks;
import com.more_of_all.Item.ModItems;
import com.more_of_all.MoreOfAll;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;

import net.minecraft.block.Block;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
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

        List<ItemConvertible> TERMINITE_SMELTABLES = List.of(ModItems.RAW_TERMINITE, ModBlocks.TERMINITE_ORE,
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

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAYMINER)
                .pattern("TTT")
                .pattern(" F ")
                .pattern(" F ")
                .input('T', Items.NETHER_STAR)
                .input('F', Items.NETHERITE_INGOT)
                .criterion(hasItem(Items.NETHER_STAR), conditionsFromItem(Items.NETHER_STAR))
                .offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DORMANT_STARLIGHT)
                .pattern("XAX")
                .pattern("AAA")
                .pattern("XAX")
                .input('A', ModItems.THALLIUM)
                .input('X', Items.COAL_BLOCK)
                .criterion(hasItem(Items.COAL), conditionsFromItem(Items.COAL))
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

        createStairsRecipe(ModBlocks.TERMINITE_STAIRS, Ingredient.ofItems(ModItems.TERMINITE))
                .criterion(hasItem(ModItems.TERMINITE), conditionsFromItem(ModItems.TERMINITE)).offerTo(exporter);
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TERMINITE_SLAB, Ingredient.ofItems(ModItems.TERMINITE))
                .criterion(hasItem(ModItems.TERMINITE), conditionsFromItem(ModItems.TERMINITE)).offerTo(exporter);
        createPressurePlateRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TERMINITE_PRESSURE_PLATE,
                Ingredient.ofItems(ModItems.TERMINITE))
                .criterion(hasItem(ModItems.TERMINITE), conditionsFromItem(ModItems.TERMINITE)).offerTo(exporter);
        createFenceRecipe(ModBlocks.TERMINITE_FENCE, Ingredient.ofItems(ModItems.TERMINITE))
                .criterion(hasItem(ModItems.TERMINITE), conditionsFromItem(ModItems.TERMINITE)).offerTo(exporter);
        createFenceGateRecipe(ModBlocks.TERMINITE_FENCE_GATE, Ingredient.ofItems(ModItems.TERMINITE))
                .criterion(hasItem(ModItems.TERMINITE), conditionsFromItem(ModItems.TERMINITE)).offerTo(exporter);

        createDoorRecipe(ModBlocks.TERMINITE_DOOR, Ingredient.ofItems(ModItems.TERMINITE))
                .criterion(hasItem(ModItems.TERMINITE), conditionsFromItem(ModItems.TERMINITE)).offerTo(exporter);
        createTrapdoorRecipe(ModBlocks.TERMINITE_TRAPDOOR, Ingredient.ofItems(ModItems.TERMINITE))
                .criterion(hasItem(ModItems.TERMINITE), conditionsFromItem(ModItems.TERMINITE)).offerTo(exporter);

        createStairsRecipe(ModBlocks.THALLIUM_STAIRS, Ingredient.ofItems(ModItems.THALLIUM))
                .criterion(hasItem(ModItems.THALLIUM), conditionsFromItem(ModItems.THALLIUM)).offerTo(exporter);
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.THALLIUM_SLAB, Ingredient.ofItems(ModItems.THALLIUM))
                .criterion(hasItem(ModItems.THALLIUM), conditionsFromItem(ModItems.THALLIUM)).offerTo(exporter);
        createPressurePlateRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.THALLIUM_PRESSURE_PLATE,
                Ingredient.ofItems(ModItems.THALLIUM))
                .criterion(hasItem(ModItems.THALLIUM), conditionsFromItem(ModItems.THALLIUM)).offerTo(exporter);
        createFenceRecipe(ModBlocks.THALLIUM_FENCE, Ingredient.ofItems(ModItems.THALLIUM))
                .criterion(hasItem(ModItems.THALLIUM), conditionsFromItem(ModItems.THALLIUM)).offerTo(exporter);
        createFenceGateRecipe(ModBlocks.THALLIUM_FENCE_GATE, Ingredient.ofItems(ModItems.THALLIUM))
                .criterion(hasItem(ModItems.THALLIUM), conditionsFromItem(ModItems.THALLIUM)).offerTo(exporter);

        createDoorRecipe(ModBlocks.THALLIUM_DOOR, Ingredient.ofItems(ModItems.THALLIUM))
                .criterion(hasItem(ModItems.THALLIUM), conditionsFromItem(ModItems.THALLIUM)).offerTo(exporter);
        createTrapdoorRecipe(ModBlocks.THALLIUM_TRAPDOOR, Ingredient.ofItems(ModItems.THALLIUM))
                .criterion(hasItem(ModItems.THALLIUM), conditionsFromItem(ModItems.THALLIUM)).offerTo(exporter);

        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.THALLIUM_WALL, ModItems.THALLIUM);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TERMINITE_WALL, ModItems.TERMINITE);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TERMINITE_BUTTON)
                .pattern("   ")
                .pattern(" X ")
                .pattern("   ")
                .input('X', ModItems.TERMINITE)

                .criterion(hasItem(ModItems.TERMINITE), conditionsFromItem(ModItems.TERMINITE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.THALLIUM_BUTTON)
                .pattern("   ")
                .pattern(" X ")
                .pattern("   ")
                .input('X', ModItems.THALLIUM)

                .criterion(hasItem(ModItems.THALLIUM), conditionsFromItem(ModItems.THALLIUM))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.THALLIUM_LAMP)
                .pattern("   ")
                .pattern("CX ")
                .pattern("   ")
                .input('X', ModItems.THALLIUM)
                .input('C', Items.GLOWSTONE)

                .criterion(hasItem(ModItems.THALLIUM), conditionsFromItem(ModItems.THALLIUM))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TERMINITE_LAMP)
                .pattern("   ")
                .pattern("CX ")
                .pattern("   ")
                .input('X', ModItems.TERMINITE)
                .input('C', Items.GLOWSTONE)

                .criterion(hasItem(ModItems.TERMINITE), conditionsFromItem(ModItems.TERMINITE))
                .offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TERMINITE_SWORD)
                .pattern(" X ")
                .pattern(" X ")
                .pattern(" C ")
                .input('X', ModItems.TERMINITE)
                .input('C', Items.STICK)

                .criterion(hasItem(ModItems.TERMINITE), conditionsFromItem(ModItems.TERMINITE))
                .offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TERMINITE_AXE)
                .pattern("XX ")
                .pattern("XC ")
                .pattern(" C ")
                .input('X', ModItems.TERMINITE)
                .input('C', Items.STICK)

                .criterion(hasItem(ModItems.TERMINITE), conditionsFromItem(ModItems.TERMINITE))
                .offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TERMINITE_PICKAXE)
                .pattern("XXX")
                .pattern(" C ")
                .pattern(" C ")
                .input('X', ModItems.TERMINITE)
                .input('C', Items.STICK)

                .criterion(hasItem(ModItems.TERMINITE), conditionsFromItem(ModItems.TERMINITE))
                .offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TERMINITE_SHOVEL)
                .pattern(" X ")
                .pattern(" C ")
                .pattern(" C ")
                .input('X', ModItems.TERMINITE)
                .input('C', Items.STICK)

                .criterion(hasItem(ModItems.TERMINITE), conditionsFromItem(ModItems.TERMINITE))
                .offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TERMINITE_HOE)
                .pattern("XX ")
                .pattern(" C ")
                .pattern(" C ")
                .input('X', ModItems.TERMINITE)
                .input('C', Items.STICK)

                .criterion(hasItem(ModItems.TERMINITE), conditionsFromItem(ModItems.TERMINITE))
                .offerTo(exporter);



        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.THALLIUM_SWORD)
                .pattern(" X ")
                .pattern(" X ")
                .pattern(" C ")
                .input('X', ModItems.THALLIUM)
                .input('C', Items.STICK)

                .criterion(hasItem(ModItems.THALLIUM), conditionsFromItem(ModItems.THALLIUM))
                .offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.THALLIUM_AXE)
                .pattern("XX ")
                .pattern("XC ")
                .pattern(" C ")
                .input('X', ModItems.THALLIUM)
                .input('C', Items.STICK)

                .criterion(hasItem(ModItems.THALLIUM), conditionsFromItem(ModItems.THALLIUM))
                .offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.THALLIUM_PICKAXE)
                .pattern("XXX")
                .pattern(" C ")
                .pattern(" C ")
                .input('X', ModItems.THALLIUM)
                .input('C', Items.STICK)

                .criterion(hasItem(ModItems.THALLIUM), conditionsFromItem(ModItems.THALLIUM))
                .offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.THALLIUM_SHOVEL)
                .pattern(" X ")
                .pattern(" C ")
                .pattern(" C ")
                .input('X', ModItems.THALLIUM)
                .input('C', Items.STICK)

                .criterion(hasItem(ModItems.THALLIUM), conditionsFromItem(ModItems.THALLIUM))
                .offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.THALLIUM_HOE)
                .pattern("XX ")
                .pattern(" C ")
                .pattern(" C ")
                .input('X', ModItems.THALLIUM)
                .input('C', Items.STICK)

                .criterion(hasItem(ModItems.THALLIUM), conditionsFromItem(ModItems.THALLIUM))
                .offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.THALLIUM_HELMET)
                .pattern("XXX")
                .pattern("X X")
                .pattern("   ")
                .input('X', ModItems.THALLIUM)


                .criterion(hasItem(ModItems.THALLIUM), conditionsFromItem(ModItems.THALLIUM))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.THALLIUM_CHESTPLATE)
                .pattern("X X")
                .pattern("XXX")
                .pattern("XXX")
                .input('X', ModItems.THALLIUM)


                .criterion(hasItem(ModItems.THALLIUM), conditionsFromItem(ModItems.THALLIUM))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.THALLIUM_LEGGINGS)
                .pattern("XXX")
                .pattern("X X")
                .pattern("X X")
                .input('X', ModItems.THALLIUM)


                .criterion(hasItem(ModItems.THALLIUM), conditionsFromItem(ModItems.THALLIUM))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.THALLIUM_BOOTS)
                .pattern("   ")
                .pattern("X X")
                .pattern("X X")
                .input('X', ModItems.THALLIUM)


                .criterion(hasItem(ModItems.THALLIUM), conditionsFromItem(ModItems.THALLIUM))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TERMINITE_HELMET)
                .pattern("XXX")
                .pattern("X X")
                .pattern("   ")
                .input('X', ModItems.TERMINITE)


                .criterion(hasItem(ModItems.TERMINITE), conditionsFromItem(ModItems.TERMINITE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TERMINITE_CHESTPLATE)
                .pattern("X X")
                .pattern("XXX")
                .pattern("XXX")
                .input('X', ModItems.TERMINITE)


                .criterion(hasItem(ModItems.TERMINITE), conditionsFromItem(ModItems.TERMINITE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TERMINITE_LEGGINGS)
                .pattern("XXX")
                .pattern("X X")
                .pattern("X X")
                .input('X', ModItems.TERMINITE)


                .criterion(hasItem(ModItems.TERMINITE), conditionsFromItem(ModItems.TERMINITE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TERMINITE_BOOTS)
                .pattern("   ")
                .pattern("X X")
                .pattern("X X")
                .input('X', ModItems.TERMINITE)


                .criterion(hasItem(ModItems.TERMINITE), conditionsFromItem(ModItems.TERMINITE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THALLIUM_HORSE_ARMOR)
                .pattern(" A ")
                .pattern("ASA")
                .pattern(" A ")
                .input('A', ModItems.THALLIUM)
                .input('S', Items.LEATHER_HORSE_ARMOR)
                .criterion(hasItem(ModItems.THALLIUM), conditionsFromItem(ModItems.THALLIUM)).offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TERMINITE_HORSE_ARMOR)
                .pattern(" A ")
                .pattern("ASA")
                .pattern(" A ")
                .input('A', ModItems.TERMINITE)
                .input('S', Items.LEATHER_HORSE_ARMOR)
                .criterion(hasItem(ModItems.TERMINITE), conditionsFromItem(ModItems.TERMINITE)).offerTo(exporter);


        offerSmithingTrimRecipe(exporter, ModItems.TRACK_SMITHING_TEMPLATE, Identifier.of(MoreOfAll.MOD_ID, "track"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TRACK_SMITHING_TEMPLATE)
                .pattern("ASA")
                .pattern("ATA")
                .pattern("AAA")
                .input('A', ModItems.THALLIUM)
                .input('S', Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE)
                .input('T', ModItems.TERMINITE)
                .criterion(hasItem(ModItems.TERMINITE), conditionsFromItem(ModItems.TERMINITE)).offerTo(exporter);



        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THALLIUM, 9)
                .input(ModBlocks.THALLIUM_BLOCK)
                .criterion(hasItem(ModBlocks.THALLIUM_BLOCK),
                        conditionsFromItem(ModBlocks.THALLIUM_BLOCK))
                .offerTo(exporter);


    }





}