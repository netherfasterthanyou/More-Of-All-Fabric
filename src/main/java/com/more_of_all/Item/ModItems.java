package com.more_of_all.Item;

import com.more_of_all.Item.Custom.ChainsawItem;
import com.more_of_all.Item.Custom.Chisel.*;
import com.more_of_all.Item.Custom.HammerItem;
import com.more_of_all.Item.Custom.RayMinerItem;
import com.more_of_all.MoreOfAll;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.*;
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
    public static final Item RAYMINER = registerItem("rayminer", new RayMinerItem(new Item.Settings().maxDamage(10000)));
    public static final Item CHILI = registerItem("chili", new Item(new Item.Settings().food(ModFood.CHILI)));
    public static final Item DORMANT_STARLIGHT = registerItem("dormant_starlight", new Item(new Item.Settings()));


    public static final Item TERMINITE_SWORD = registerItem("terminite_sword",
            new SwordItem(ModToolMaterials.TERMINITE, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.TERMINITE, 3, -2.4f))));
    public static final Item TERMINITE_AXE = registerItem("terminite_axe",
            new AxeItem(ModToolMaterials.TERMINITE, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.TERMINITE, 6, -3.2f))));

    public static final Item TERMINITE_PICKAXE = registerItem("terminite_pickaxe",
            new PickaxeItem(ModToolMaterials.TERMINITE, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.TERMINITE, 1, -2.8f))));

    public static final Item TERMINITE_SHOVEL = registerItem("terminite_shovel",
            new ShovelItem(ModToolMaterials.TERMINITE, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.TERMINITE, 1.5f, -3.0f))));

    public static final Item TERMINITE_HOE = registerItem("terminite_hoe",
            new HoeItem(ModToolMaterials.TERMINITE, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.TERMINITE, 0, -3.0f))));


    public static final Item THALLIUM_SWORD = registerItem("thallium_sword",
            new SwordItem(ModToolMaterials.THALLIUM, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.THALLIUM, 3, -2.4f))));
    public static final Item THALLIUM_AXE = registerItem("thallium_axe",
            new AxeItem(ModToolMaterials.THALLIUM, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.THALLIUM, 6, -3.2f))));

    public static final Item THALLIUM_PICKAXE = registerItem("thallium_pickaxe",
            new PickaxeItem(ModToolMaterials.THALLIUM, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.THALLIUM, 1, -2.8f))));

    public static final Item THALLIUM_SHOVEL = registerItem("thallium_shovel",
            new ShovelItem(ModToolMaterials.THALLIUM, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.THALLIUM, 1.5f, -3.0f))));

    public static final Item THALLIUM_HOE = registerItem("thallium_hoe",
            new HoeItem(ModToolMaterials.THALLIUM, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.THALLIUM, 0, -3.0f))));


    public static final Item HAMMER = registerItem("hammer",
            new HammerItem(ModToolMaterials.TERMINITE, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.TERMINITE, 7, -3.5f))));



    private static Item registerItem(String name, Item item){



        return Registry.register(Registries.ITEM, Identifier.of(MoreOfAll.MOD_ID, name), item);
    }

    public static void regigisterModItems() {
        MoreOfAll.LOGGER.info("Registering Mod Items for " + MoreOfAll.MOD_ID);




    }
}
