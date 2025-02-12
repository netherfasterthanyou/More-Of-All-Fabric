package com.more_of_all.Block.custom;


import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SalvagerBlock extends Block {
    public SalvagerBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player,
                                 BlockHitResult hit) {
        world.playSound(player, pos, SoundEvents.BLOCK_AMETHYST_BLOCK_CHIME, SoundCategory.BLOCKS, 1f, 1f);
        return ActionResult.SUCCESS;
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if (entity instanceof ItemEntity itemEntity){


            if (itemEntity.getStack().getItem() == Items.DIAMOND_AXE) {
                itemEntity.setStack(new ItemStack(Items.DIAMOND, itemEntity.getStack().getCount()));
            }
            if (itemEntity.getStack().getItem() == Items.DIAMOND_SHOVEL) {
                itemEntity.setStack(new ItemStack(Items.DIAMOND, itemEntity.getStack().getCount()));
            }
            if (itemEntity.getStack().getItem() == Items.DIAMOND_SWORD) {
                itemEntity.setStack(new ItemStack(Items.DIAMOND, itemEntity.getStack().getCount()));
            }
            if (itemEntity.getStack().getItem() == Items.DIAMOND_HOE) {
                itemEntity.setStack(new ItemStack(Items.DIAMOND, itemEntity.getStack().getCount()));
            }
            if (itemEntity.getStack().getItem() == Items.DIAMOND_PICKAXE) {
                itemEntity.setStack(new ItemStack(Items.DIAMOND, itemEntity.getStack().getCount()));
            }
            if (itemEntity.getStack().getItem() == Items.DIAMOND_CHESTPLATE) {
                itemEntity.setStack(new ItemStack(Items.DIAMOND, itemEntity.getStack().getCount()));
            }
            if (itemEntity.getStack().getItem() == Items.DIAMOND_LEGGINGS) {
                itemEntity.setStack(new ItemStack(Items.DIAMOND, itemEntity.getStack().getCount()));
            }
            if (itemEntity.getStack().getItem() == Items.DIAMOND_BOOTS) {
                itemEntity.setStack(new ItemStack(Items.DIAMOND, itemEntity.getStack().getCount()));
            }
            if (itemEntity.getStack().getItem() == Items.DIAMOND_HELMET) {
                itemEntity.setStack(new ItemStack(Items.DIAMOND, itemEntity.getStack().getCount()));
            }
            if (itemEntity.getStack().getItem() == Items.DIAMOND_HORSE_ARMOR) {
                itemEntity.setStack(new ItemStack(Items.DIAMOND, itemEntity.getStack().getCount()));

            }
            if (itemEntity.getStack().getItem() == Items.NETHERITE_AXE) {
                itemEntity.setStack(new ItemStack(Items.NETHERITE_INGOT, itemEntity.getStack().getCount()));
            }
            if (itemEntity.getStack().getItem() == Items.NETHERITE_SHOVEL) {
                itemEntity.setStack(new ItemStack(Items.NETHERITE_INGOT, itemEntity.getStack().getCount()));
            }
            if (itemEntity.getStack().getItem() == Items.NETHERITE_SWORD) {
                itemEntity.setStack(new ItemStack(Items.NETHERITE_INGOT, itemEntity.getStack().getCount()));
            }
            if (itemEntity.getStack().getItem() == Items.NETHERITE_HOE) {
                itemEntity.setStack(new ItemStack(Items.NETHERITE_INGOT, itemEntity.getStack().getCount()));
            }
            if (itemEntity.getStack().getItem() == Items.NETHERITE_PICKAXE) {
                itemEntity.setStack(new ItemStack(Items.NETHERITE_INGOT, itemEntity.getStack().getCount()));
            }
            if (itemEntity.getStack().getItem() == Items.NETHERITE_CHESTPLATE) {
                itemEntity.setStack(new ItemStack(Items.NETHERITE_INGOT, itemEntity.getStack().getCount()));
            }
            if (itemEntity.getStack().getItem() == Items.NETHERITE_LEGGINGS) {
                itemEntity.setStack(new ItemStack(Items.NETHERITE_INGOT, itemEntity.getStack().getCount()));
            }
            if (itemEntity.getStack().getItem() == Items.NETHERITE_BOOTS) {
                itemEntity.setStack(new ItemStack(Items.NETHERITE_INGOT, itemEntity.getStack().getCount()));
            }
            if (itemEntity.getStack().getItem() == Items.NETHERITE_HELMET) {
                itemEntity.setStack(new ItemStack(Items.NETHERITE_INGOT, itemEntity.getStack().getCount()));
            }
            if (itemEntity.getStack().getItem() == Items.GOLDEN_AXE) {
                itemEntity.setStack(new ItemStack(Items.GOLD_INGOT, itemEntity.getStack().getCount()));
            }
            if (itemEntity.getStack().getItem() == Items.GOLDEN_SHOVEL) {
                itemEntity.setStack(new ItemStack(Items.GOLD_INGOT, itemEntity.getStack().getCount()));
            }
            if (itemEntity.getStack().getItem() == Items.GOLDEN_SWORD) {
                itemEntity.setStack(new ItemStack(Items.GOLD_INGOT, itemEntity.getStack().getCount()));
            }
            if (itemEntity.getStack().getItem() == Items.GOLDEN_HOE) {
                itemEntity.setStack(new ItemStack(Items.GOLD_INGOT, itemEntity.getStack().getCount()));
            }
            if (itemEntity.getStack().getItem() == Items.GOLDEN_PICKAXE) {
                itemEntity.setStack(new ItemStack(Items.GOLD_INGOT, itemEntity.getStack().getCount()));
            }
            if (itemEntity.getStack().getItem() == Items.GOLDEN_CHESTPLATE) {
                itemEntity.setStack(new ItemStack(Items.GOLD_INGOT, itemEntity.getStack().getCount()));
            }
            if (itemEntity.getStack().getItem() == Items.GOLDEN_LEGGINGS) {
                itemEntity.setStack(new ItemStack(Items.GOLD_INGOT, itemEntity.getStack().getCount()));
            }
            if (itemEntity.getStack().getItem() == Items.GOLDEN_BOOTS) {
                itemEntity.setStack(new ItemStack(Items.GOLD_INGOT, itemEntity.getStack().getCount()));
            }
            if (itemEntity.getStack().getItem() == Items.GOLDEN_HELMET) {
                itemEntity.setStack(new ItemStack(Items.GOLD_INGOT, itemEntity.getStack().getCount()));
            }
            if (itemEntity.getStack().getItem() == Items.GOLDEN_HORSE_ARMOR) {
                itemEntity.setStack(new ItemStack(Items.GOLD_INGOT, itemEntity.getStack().getCount()));

            }
            if (itemEntity.getStack().getItem() == Items.IRON_AXE) {
                itemEntity.setStack(new ItemStack(Items.IRON_INGOT, itemEntity.getStack().getCount()));
            }
            if (itemEntity.getStack().getItem() == Items.IRON_SHOVEL) {
                itemEntity.setStack(new ItemStack(Items.IRON_INGOT, itemEntity.getStack().getCount()));
            }
            if (itemEntity.getStack().getItem() == Items.IRON_SWORD) {
                itemEntity.setStack(new ItemStack(Items.IRON_INGOT, itemEntity.getStack().getCount()));
            }
            if (itemEntity.getStack().getItem() == Items.IRON_HOE) {
                itemEntity.setStack(new ItemStack(Items.IRON_INGOT, itemEntity.getStack().getCount()));
            }
            if (itemEntity.getStack().getItem() == Items.IRON_PICKAXE) {
                itemEntity.setStack(new ItemStack(Items.IRON_INGOT, itemEntity.getStack().getCount()));
            }
            if (itemEntity.getStack().getItem() == Items.IRON_CHESTPLATE) {
                itemEntity.setStack(new ItemStack(Items.IRON_INGOT, itemEntity.getStack().getCount()));
            }
            if (itemEntity.getStack().getItem() == Items.IRON_LEGGINGS) {
                itemEntity.setStack(new ItemStack(Items.IRON_INGOT, itemEntity.getStack().getCount()));
            }
            if (itemEntity.getStack().getItem() == Items.IRON_BOOTS) {
                itemEntity.setStack(new ItemStack(Items.IRON_INGOT, itemEntity.getStack().getCount()));
            }
            if (itemEntity.getStack().getItem() == Items.IRON_HELMET) {
                itemEntity.setStack(new ItemStack(Items.IRON_INGOT, itemEntity.getStack().getCount()));
            }
            if (itemEntity.getStack().getItem() == Items.IRON_HORSE_ARMOR) {
                itemEntity.setStack(new ItemStack(Items.IRON_INGOT, itemEntity.getStack().getCount()));

            }


        }

        super.onSteppedOn(world, pos, state, entity);
    }


}
