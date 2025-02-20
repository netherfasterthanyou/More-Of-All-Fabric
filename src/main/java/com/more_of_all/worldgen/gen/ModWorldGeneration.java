package com.more_of_all.worldgen.gen;

public class ModWorldGeneration {
    public static void generateModWorldGen() {
        ModOreGeneration.generateOres();
        ModTreeGeneration.generateTrees();
        ModBushGen.generateBushes();


    }
}