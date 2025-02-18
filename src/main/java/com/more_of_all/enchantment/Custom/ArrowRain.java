package com.more_of_all.enchantment.Custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.enchantment.EnchantmentEffectContext;
import net.minecraft.enchantment.effect.EnchantmentEntityEffect;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.Vec3d;

public record ArrowRain() implements EnchantmentEntityEffect {

    public static final MapCodec<ArrowRain> CODEC = MapCodec.unit(ArrowRain::new);

    @Override
    public void apply(ServerWorld world, int level, EnchantmentEffectContext context, Entity user, Vec3d pos) {
        if (level == 1){

            EntityType.ARROW.spawn(world, user.getBlockPos().west(1).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().east(1).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().north(1).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().south(1).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().west(1).north(1).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().east(1).south(1).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().north(1).east(1).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().south(1).west(1).up(20), SpawnReason.TRIGGERED);

        }

        if (level == 2){
            EntityType.ARROW.spawn(world, user.getBlockPos().west(1).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().east(1).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().north(1).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().south(1).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().up(11), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().west(2).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().east(2).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().north(2).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().south(2).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().up(11), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().west(2).north(2).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().east(2).south(2).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().north(2).east(2).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().south(2).west(2).up(20), SpawnReason.TRIGGERED);

            EntityType.ARROW.spawn(world, user.getBlockPos().west(1).east(1).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().east(1).west(1).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().north(1).south(1).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().south(1).north(1).up(20), SpawnReason.TRIGGERED);


        }

        if (level == 3){
            EntityType.ARROW.spawn(world, user.getBlockPos().west(1).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().east(1).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().north(1).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().south(1).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().up(11), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().west(2).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().east(2).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().north(2).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().south(2).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().up(11), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().west(3).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().east(3).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().north(3).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().south(3).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().west(2).north(2).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().east(2).south(2).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().north(2).east(2).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().south(2).west(2).up(20), SpawnReason.TRIGGERED);

            EntityType.ARROW.spawn(world, user.getBlockPos().west(1).east(1).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().east(1).west(1).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().north(1).south(1).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().south(1).north(1).up(20), SpawnReason.TRIGGERED);


            EntityType.ARROW.spawn(world, user.getBlockPos().west(3).east(3).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().east(3).west(3).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().north(3).south(3).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().south(3).north(3).up(20), SpawnReason.TRIGGERED);

        }

        if (level == 4) {
            EntityType.ARROW.spawn(world, user.getBlockPos().west(1).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().east(1).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().north(1).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().south(1).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().up(11), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().west(2).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().east(2).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().north(2).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().south(2).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().up(11), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().west(3).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().east(3).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().north(3).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().south(3).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().up(11), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().west(4).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().east(4).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().north(4).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().south(4).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().up(4), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().west(2).north(2).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().east(2).south(2).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().north(2).east(2).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().south(2).west(2).up(20), SpawnReason.TRIGGERED);

            EntityType.ARROW.spawn(world, user.getBlockPos().west(1).east(1).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().east(1).west(1).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().north(1).south(1).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().south(1).north(1).up(20), SpawnReason.TRIGGERED);

            EntityType.ARROW.spawn(world, user.getBlockPos().west(4).east(4).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().east(4).west(4).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().north(4).south(4).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().south(4).north(4).up(20), SpawnReason.TRIGGERED);


            EntityType.ARROW.spawn(world, user.getBlockPos().west(3).east(3).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().east(3).west(3).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().north(3).south(3).up(20), SpawnReason.TRIGGERED);
            EntityType.ARROW.spawn(world, user.getBlockPos().south(3).north(3).up(20), SpawnReason.TRIGGERED);

        }

            if (level == 5){
                EntityType.ARROW.spawn(world, user.getBlockPos().west(1).up(20), SpawnReason.TRIGGERED);
                EntityType.ARROW.spawn(world, user.getBlockPos().east(1).up(20), SpawnReason.TRIGGERED);
                EntityType.ARROW.spawn(world, user.getBlockPos().north(1).up(20), SpawnReason.TRIGGERED);
                EntityType.ARROW.spawn(world, user.getBlockPos().south(1).up(20), SpawnReason.TRIGGERED);
                EntityType.ARROW.spawn(world, user.getBlockPos().up(11), SpawnReason.TRIGGERED);
                EntityType.ARROW.spawn(world, user.getBlockPos().west(2).up(20), SpawnReason.TRIGGERED);
                EntityType.ARROW.spawn(world, user.getBlockPos().east(2).up(20), SpawnReason.TRIGGERED);
                EntityType.ARROW.spawn(world, user.getBlockPos().north(2).up(20), SpawnReason.TRIGGERED);
                EntityType.ARROW.spawn(world, user.getBlockPos().south(2).up(20), SpawnReason.TRIGGERED);
                EntityType.ARROW.spawn(world, user.getBlockPos().up(11), SpawnReason.TRIGGERED);
                EntityType.ARROW.spawn(world, user.getBlockPos().west(3).up(20), SpawnReason.TRIGGERED);
                EntityType.ARROW.spawn(world, user.getBlockPos().east(3).up(20), SpawnReason.TRIGGERED);
                EntityType.ARROW.spawn(world, user.getBlockPos().north(3).up(20), SpawnReason.TRIGGERED);
                EntityType.ARROW.spawn(world, user.getBlockPos().south(3).up(20), SpawnReason.TRIGGERED);
                EntityType.ARROW.spawn(world, user.getBlockPos().up(11), SpawnReason.TRIGGERED);
                EntityType.ARROW.spawn(world, user.getBlockPos().west(4).up(20), SpawnReason.TRIGGERED);
                EntityType.ARROW.spawn(world, user.getBlockPos().east(4).up(20), SpawnReason.TRIGGERED);
                EntityType.ARROW.spawn(world, user.getBlockPos().north(4).up(20), SpawnReason.TRIGGERED);
                EntityType.ARROW.spawn(world, user.getBlockPos().south(4).up(20), SpawnReason.TRIGGERED);
                EntityType.ARROW.spawn(world, user.getBlockPos().up(20), SpawnReason.TRIGGERED);
                EntityType.ARROW.spawn(world, user.getBlockPos().west(5).up(20), SpawnReason.TRIGGERED);
                EntityType.ARROW.spawn(world, user.getBlockPos().east(5).up(20), SpawnReason.TRIGGERED);
                EntityType.ARROW.spawn(world, user.getBlockPos().north(5).up(20), SpawnReason.TRIGGERED);
                EntityType.ARROW.spawn(world, user.getBlockPos().south(5).up(20), SpawnReason.TRIGGERED);
                EntityType.ARROW.spawn(world, user.getBlockPos().up(20), SpawnReason.TRIGGERED);




                EntityType.ARROW.spawn(world, user.getBlockPos().west(2).north(2).up(20), SpawnReason.TRIGGERED);
                EntityType.ARROW.spawn(world, user.getBlockPos().east(2).south(2).up(20), SpawnReason.TRIGGERED);
                EntityType.ARROW.spawn(world, user.getBlockPos().north(2).east(2).up(20), SpawnReason.TRIGGERED);
                EntityType.ARROW.spawn(world, user.getBlockPos().south(2).west(2).up(20), SpawnReason.TRIGGERED);

                EntityType.ARROW.spawn(world, user.getBlockPos().west(1).east(1).up(20), SpawnReason.TRIGGERED);
                EntityType.ARROW.spawn(world, user.getBlockPos().east(1).west(1).up(20), SpawnReason.TRIGGERED);
                EntityType.ARROW.spawn(world, user.getBlockPos().north(1).south(1).up(20), SpawnReason.TRIGGERED);
                EntityType.ARROW.spawn(world, user.getBlockPos().south(1).north(1).up(20), SpawnReason.TRIGGERED);

                EntityType.ARROW.spawn(world, user.getBlockPos().west(5).east(5).up(20), SpawnReason.TRIGGERED);
                EntityType.ARROW.spawn(world, user.getBlockPos().east(5).west(5).up(20), SpawnReason.TRIGGERED);
                EntityType.ARROW.spawn(world, user.getBlockPos().north(5).south(5).up(20), SpawnReason.TRIGGERED);
                EntityType.ARROW.spawn(world, user.getBlockPos().south(5).north(5).up(20), SpawnReason.TRIGGERED);


                EntityType.ARROW.spawn(world, user.getBlockPos().west(4).east(4).up(20), SpawnReason.TRIGGERED);
                EntityType.ARROW.spawn(world, user.getBlockPos().east(4).west(4).up(20), SpawnReason.TRIGGERED);
                EntityType.ARROW.spawn(world, user.getBlockPos().north(4).south(4).up(20), SpawnReason.TRIGGERED);
                EntityType.ARROW.spawn(world, user.getBlockPos().south(4).north(4).up(20), SpawnReason.TRIGGERED);


                EntityType.ARROW.spawn(world, user.getBlockPos().west(3).east(3).up(20), SpawnReason.TRIGGERED);
                EntityType.ARROW.spawn(world, user.getBlockPos().east(3).west(3).up(20), SpawnReason.TRIGGERED);
                EntityType.ARROW.spawn(world, user.getBlockPos().north(3).south(3).up(20), SpawnReason.TRIGGERED);
                EntityType.ARROW.spawn(world, user.getBlockPos().south(3).north(3).up(20), SpawnReason.TRIGGERED);

            }
    }

    @Override
    public MapCodec<? extends EnchantmentEntityEffect> getCodec() {
        return CODEC;
    }
}
