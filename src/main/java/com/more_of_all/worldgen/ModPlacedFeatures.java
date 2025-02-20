package com.more_of_all.worldgen;

import com.more_of_all.Block.ModBlocks;
import com.more_of_all.MoreOfAll;
import net.minecraft.datafixer.fix.BiomeFormatFix;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;
import java.util.Random;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> THALLIUM_ORE_PLACEMENT_KEY = registerKey("thallium_ore_placed");
    public static final RegistryKey<PlacedFeature> TERMINITE_ORE_PLACEMENT_KEY = registerKey("terminite_ore_placed");
    public static final RegistryKey<PlacedFeature> DRIFTWOOD_PLACED_KEY = registerKey("driftwood_placed");
    public static final RegistryKey<PlacedFeature> BLOODWOOD_PLACED_KEY = registerKey("bloodwood_placed");

    public static final RegistryKey<PlacedFeature> EUCALYPTUS_PLACED_KEY = registerKey("eucalyptus_placed");
    public static final RegistryKey<PlacedFeature> BLUEBERRY_PLACED = registerKey("blue_berry_placed");


    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatures = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, THALLIUM_ORE_PLACEMENT_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.THALLIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(5,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-64), YOffset.fixed(25))));
        register(context, TERMINITE_ORE_PLACEMENT_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.TERMINITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(3,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-64), YOffset.fixed(15))));


        register(context, DRIFTWOOD_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.DRIFTWOOD_KEY),
                List.of(
                        PlacedFeatures.createCountExtraModifier(3, 0.1f, 1),

                        SquarePlacementModifier.of(),
                        PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP,
                        EnvironmentScanPlacementModifier.of(Direction.DOWN, BlockPredicate.solid(), 12),
                        RandomOffsetPlacementModifier.vertically(ConstantIntProvider.create(1))

                )
        );


        register(context, EUCALYPTUS_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.EUCALYPTUS_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(3, 0.1f, 1),
                        ModBlocks.EUCALYPTUS_SAPLING));

        register(context, BLOODWOOD_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BLOODWOOD_KEY),
                List.of(
                        PlacedFeatures.createCountExtraModifier(8, 0.1f, 2),

                        SquarePlacementModifier.of(),
                        PlacedFeatures.BOTTOM_TO_TOP_RANGE,
                        EnvironmentScanPlacementModifier.of(Direction.DOWN, BlockPredicate.solid(), BlockPredicate.IS_AIR, 12),
                        RandomOffsetPlacementModifier.vertically(ConstantIntProvider.create(1))

                )
        );
        register(context, BLUEBERRY_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.BLUEBERRY_BUSH_KEY),
                RarityFilterPlacementModifier.of(32), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());


    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(MoreOfAll.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}