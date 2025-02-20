package com.more_of_all.worldgen.tree;

import com.more_of_all.MoreOfAll;
import com.more_of_all.worldgen.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class ModSaplingGenerators {
    public static final SaplingGenerator DRIFTWOOD = new SaplingGenerator(MoreOfAll.MOD_ID + ":driftwood",
            Optional.empty(), Optional.of(ModConfiguredFeatures.DRIFTWOOD_KEY), Optional.empty());

    public static final SaplingGenerator BLOODWOOD = new SaplingGenerator(MoreOfAll.MOD_ID + ":bloodwood",
            Optional.empty(), Optional.of(ModConfiguredFeatures.BLOODWOOD_KEY), Optional.empty());

    public static final SaplingGenerator EUCALYPTUS = new SaplingGenerator(MoreOfAll.MOD_ID + ":eucalyptus",
            Optional.empty(), Optional.of(ModConfiguredFeatures.EUCALYPTUS_KEY), Optional.empty());
}