package com.more_of_all.Item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFood {
    public static final FoodComponent CHILI = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 1000), 0.1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 300), 0.4f).build();

    public static final FoodComponent BLUEBERRIES = new FoodComponent.Builder().nutrition(2).saturationModifier(0.4f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1000), 0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 300), 0.3f).snack().build();
}
