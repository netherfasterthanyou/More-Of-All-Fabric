package com.more_of_all.trim;

import com.more_of_all.Item.ModItems;
import com.more_of_all.MoreOfAll;

import net.minecraft.item.Item;
import net.minecraft.item.trim.ArmorTrimMaterial;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.Map;

public class ModTrimMaterial {
    public static final RegistryKey<ArmorTrimMaterial> TERMINITE = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(MoreOfAll.MOD_ID, "terminite"));
    public static final RegistryKey<ArmorTrimMaterial> THALLIUM = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(MoreOfAll.MOD_ID, "thallium"));

    public static void bootstrap(Registerable<ArmorTrimMaterial> registerable){
        register(registerable, TERMINITE, Registries.ITEM.getEntry(ModItems.TERMINITE),
                Style.EMPTY.withColor(TextColor.parse("#031cfc").getOrThrow()), 0.9f);

        register(registerable, THALLIUM, Registries.ITEM.getEntry(ModItems.THALLIUM),
                Style.EMPTY.withColor(TextColor.parse("#031cfc").getOrThrow()), 0.8f);
    }


    private static void register(Registerable<ArmorTrimMaterial> registerable, RegistryKey<ArmorTrimMaterial> armorTrimKey,
                                 RegistryEntry<Item> item, Style style, float itemModelIndex){
        ArmorTrimMaterial trimMaterial = new ArmorTrimMaterial(armorTrimKey.getValue().getPath(), item, itemModelIndex, Map.of(),
                Text.translatable(Util.createTranslationKey("trim_material", armorTrimKey.getValue())).fillStyle(style));

        registerable.register(armorTrimKey, trimMaterial);
    }
}
