package com.more_of_all;

import com.more_of_all.Block.ModBlocks;
import com.more_of_all.Item.ModItemGroups;
import com.more_of_all.Item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreOfAll implements ModInitializer {
	public static final String MOD_ID = "more_of_all";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.regigisterModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();

		FuelRegistry.INSTANCE.add(ModItems.DORMANT_STARLIGHT, 64390);
	}
}