package com.more_of_all.effect;

import com.more_of_all.MoreOfAll;
import net.minecraft.entity.Entity;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModEffects {

    public static final RegistryEntry<StatusEffect> SLIMEY = registerSatusEffect("slimey",
            new StickyEffect(StatusEffectCategory.NEUTRAL, 0x36ebab)
                    .addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED,
                            Identifier.of(MoreOfAll.MOD_ID, "slimey"), -0.15f,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
                    .addAttributeModifier(EntityAttributes.GENERIC_FALL_DAMAGE_MULTIPLIER,
                            Identifier.of(MoreOfAll.MOD_ID, "slimey"), -1f,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));


    private static RegistryEntry<StatusEffect> registerSatusEffect(String name, StatusEffect statusEffect){
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(MoreOfAll.MOD_ID, name), statusEffect);
    }

    public static void registerEffects(){
        MoreOfAll.LOGGER.info("Registering Mod Effects for " + MoreOfAll.MOD_ID);
    }
}
