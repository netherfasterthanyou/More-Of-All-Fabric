package com.more_of_all.enchantment.Custom;

import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.enchantment.EnchantmentEffectContext;
import net.minecraft.enchantment.effect.*;
import net.minecraft.entity.*;
import net.minecraft.registry.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.*;
import com.mojang.serialization.*;
import net.minecraft.util.math.Vec3d;

public record LifeStealEnchantmentEffect(float percentage, float maxHeal)
    implements EnchantmentEntityEffect {

    public static final MapCodec<LifeStealEnchantmentEffect> CODEC = RecordCodecBuilder.mapCodec(instance ->
            instance.group(
                    Codec.FLOAT.fieldOf("percentage").forGetter(LifeStealEnchantmentEffect::percentage),
                    Codec.FLOAT.fieldOf("max_heal").forGetter(LifeStealEnchantmentEffect::maxHeal)
            ).apply(instance, LifeStealEnchantmentEffect::new)
    );

    @Override
    public void apply(ServerWorld world, int level, EnchantmentEffectContext context, Entity target, Vec3d pos) {
        if(context.owner() instanceof LivingEntity livingAttacker && target instanceof LivingEntity victim) {
            // Assuming damage is dealt here; you might need to adjust based on actual damage calculation
            float damageDealt = 0; // Replace with actual damage dealt
            float healAmount = damageDealt * (percentage * level);
            healAmount = Math.min(healAmount, maxHeal);
            healAmount = Math.max(healAmount, 1.0f);

            livingAttacker.heal(healAmount);
        }
    }

    @Override
    public MapCodec<? extends EnchantmentEntityEffect> getCodec() {
        return CODEC;
    }
}
