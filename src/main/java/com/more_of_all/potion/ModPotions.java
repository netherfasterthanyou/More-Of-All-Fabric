package com.more_of_all.potion;

import com.more_of_all.MoreOfAll;
import com.more_of_all.effect.ModEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModPotions {
    public static final RegistryEntry<Potion> SLIMEY_POTION = registerPotion("slimey_potion",
            new Potion(new StatusEffectInstance(ModEffects.SLIMEY, 1200, 0)));



    private static final RegistryEntry<Potion> registerPotion(String name, Potion potion){
        return Registry.registerReference(Registries.POTION, Identifier.of(MoreOfAll.MOD_ID, name), potion);
    }



    public static void registerPotions(){
        MoreOfAll.LOGGER.info("Registering Mod Potions for " + MoreOfAll.MOD_ID);
    }
}
