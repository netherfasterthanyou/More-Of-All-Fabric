package com.more_of_all.enchantment;

import com.mojang.serialization.MapCodec;
import com.more_of_all.MoreOfAll;
import com.more_of_all.enchantment.Custom.*;
import net.minecraft.enchantment.effect.EnchantmentEntityEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEnchantmentEffects {

    public static final MapCodec<? extends EnchantmentEntityEffect> THUNDERING =
            registerEntityEffect("thundering", Thundering.CODEC);

    public static final MapCodec<? extends EnchantmentEntityEffect> LIFESTEAL =
            registerEntityEffect("life_steal", LifeStealEnchantmentEffect.CODEC);

    public static final MapCodec<? extends EnchantmentEntityEffect> FIRE_BALL =
            registerEntityEffect("fireball", FireBall.CODEC);
    public static final MapCodec<? extends EnchantmentEntityEffect> TNT_SHOT =
            registerEntityEffect("tnt_explode_effect", TNTSHOT.CODEC);

    public static final MapCodec<? extends EnchantmentEntityEffect> ARROW_RAIN =
            registerEntityEffect("arrow_rain", ArrowRain.CODEC);





    private static MapCodec<? extends EnchantmentEntityEffect> registerEntityEffect(String name,
                                                                                    MapCodec<? extends EnchantmentEntityEffect> codec){
        return Registry.register(Registries.ENCHANTMENT_ENTITY_EFFECT_TYPE, Identifier.of(MoreOfAll.MOD_ID, name), codec);
    }


    public static void registerEnchantmentEffects(){
        MoreOfAll.LOGGER.info("Registering Mod Enchantment Effects for " + MoreOfAll.MOD_ID);
    }
}
