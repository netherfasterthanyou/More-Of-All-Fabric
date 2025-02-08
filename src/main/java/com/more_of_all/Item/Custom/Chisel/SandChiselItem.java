package com.more_of_all.Item.Custom.Chisel;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;

import java.util.List;
import java.util.Map;

public class SandChiselItem extends Item {
    private static final Map<Block, Block> SAND_CHISEL_MAP =
            Map.of(
                    Blocks.SAND, Blocks.SANDSTONE,
                    Blocks.SANDSTONE, Blocks.CUT_SANDSTONE,
                    Blocks.CUT_SANDSTONE, Blocks.SMOOTH_SANDSTONE,
                    Blocks.SMOOTH_SANDSTONE, Blocks.CHISELED_SANDSTONE,
                    Blocks.CHISELED_SANDSTONE, Blocks.RED_SANDSTONE,
                    Blocks.RED_SANDSTONE, Blocks.SMOOTH_RED_SANDSTONE,
                    Blocks.SMOOTH_RED_SANDSTONE, Blocks.CUT_RED_SANDSTONE,
                    Blocks.CUT_RED_SANDSTONE, Blocks.CHISELED_RED_SANDSTONE,
                    Blocks.CHISELED_RED_SANDSTONE, Blocks.SAND,
                    Blocks.RED_SAND, Blocks.RED_SANDSTONE
            );
    public SandChiselItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        Block clickedBlock = world.getBlockState(context.getBlockPos()).getBlock();
        if (SAND_CHISEL_MAP.containsKey(clickedBlock)){
            if (!world.isClient()){
                world.setBlockState(context.getBlockPos(), SAND_CHISEL_MAP.get(clickedBlock).getDefaultState());
                world.playSound(null, context.getBlockPos(), SoundEvents.BLOCK_GRINDSTONE_USE, SoundCategory.BLOCKS);

            }
        }


        return ActionResult.SUCCESS;
    }
    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("tooltip.more_of_all.sand_chisel.tooltip"));


        super.appendTooltip(stack, context, tooltip, type);
    }
}
