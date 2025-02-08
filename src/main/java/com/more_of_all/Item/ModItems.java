package com.more_of_all.Item;

import com.more_of_all.Item.Custom.ChainsawItem;
import com.more_of_all.Item.Custom.Chisel.*;
import com.more_of_all.MoreOfAll;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item TERMINITE = registerItem("terminite", new Item(new Item.Settings()));
    public static final Item RAW_TERMINITE = registerItem("raw_terminite", new Item(new Item.Settings()));
    public static final Item THALLIUM = registerItem("thallium", new Item(new Item.Settings()));
    public static final Item CHISEL = registerItem("chisel", new ChiselItem(new Item.Settings()));
    public static final Item BLACKSTONE_CHISEL = registerItem("blackstone_chisel", new BlackstoneChiselItem(new Item.Settings()));
    public static final Item DEEPSLATECHISEL = registerItem("deepslate_chisel", new DeepslateChiselItem(new Item.Settings()));
    public static final Item NETHER_BRICK_CHISEL = registerItem("nether_brick_chisel", new NetherBrickChiselItem(new Item.Settings()));
    public static final Item PRISMARINE_CHISEL = registerItem("prismarine_chisel", new PrismarineChiselItem(new Item.Settings()));
    public static final Item SAND_CHISEL = registerItem("sand_chisel", new SandChiselItem(new Item.Settings()));
    public static final Item TUFF_CHISEL = registerItem("tuff_chisel", new TuffChiselItem(new Item.Settings()));
    public static final Item CHAINSAW = registerItem("chainsaw", new ChainsawItem(new Item.Settings().maxDamage(296)));

    private static Item registerItem(String name, Item item){



        return Registry.register(Registries.ITEM, Identifier.of(MoreOfAll.MOD_ID, name), item);
    }

    public static void regigisterModItems() {
        MoreOfAll.LOGGER.info("Registering Mod Items for " + MoreOfAll.MOD_ID);


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(TERMINITE);
            entries.add(RAW_TERMINITE);
            entries.add(THALLIUM);
        });

    }
}
