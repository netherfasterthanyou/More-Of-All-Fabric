package com.more_of_all;

import com.more_of_all.Block.ModBlocks;
import com.more_of_all.Item.ModItemGroups;
import com.more_of_all.Item.ModItems;
import com.more_of_all.effect.ModEffects;
import com.more_of_all.enchantment.ModEnchantmentEffects;
import com.more_of_all.event.HammerUsageEvent;
import com.more_of_all.potion.ModPotions;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
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
		ModEffects.registerEffects();
		ModPotions.registerPotions();
		ModEnchantmentEffects.registerEnchantmentEffects();

		FuelRegistry.INSTANCE.add(ModItems.DORMANT_STARLIGHT, 64390);
		PlayerBlockBreakEvents.BEFORE.register(new HammerUsageEvent());

		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.AWKWARD, Items.SLIME_BALL, ModPotions.SLIMEY_POTION);
		});
	}

}