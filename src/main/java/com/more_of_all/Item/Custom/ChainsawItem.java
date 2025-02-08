package com.more_of_all.Item.Custom;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.entry.RegistryEntryList;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;

import java.util.List;
import java.util.Objects;

public class ChainsawItem extends Item {
    public ChainsawItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();

        if(!world.isClient()) {
            if(world.getBlockState(context.getBlockPos()).isIn(BlockTags.LOGS)) {
                world.breakBlock(context.getBlockPos(), true, context.getPlayer());

                context.getStack().damage(1, ((ServerWorld) world), ((ServerPlayerEntity) context.getPlayer()), item ->
                        Objects.requireNonNull(context.getPlayer()).sendEquipmentBreakStatus(item, EquipmentSlot.MAINHAND));
            }
            if(world.getBlockState(context.getBlockPos()).isIn(BlockTags.LEAVES)) {
                world.breakBlock(context.getBlockPos(), true, context.getPlayer());

                context.getStack().damage(1, ((ServerWorld) world), ((ServerPlayerEntity) context.getPlayer()), item ->
                        Objects.requireNonNull(context.getPlayer()).sendEquipmentBreakStatus(item, EquipmentSlot.MAINHAND));
            }
        }

        return ActionResult.CONSUME;
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("tooltip.more_of_all.chainsaw.tooltip"));


        super.appendTooltip(stack, context, tooltip, type);
    }
}