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

public class NetherBrickChiselItem extends Item {
    private static final Map<Block, Block> NETHER_BRICK_CHISEL_MAP =
            Map.of(
                    Blocks.NETHER_BRICKS, Blocks.CRACKED_NETHER_BRICKS,
                    Blocks.CRACKED_NETHER_BRICKS, Blocks.CHISELED_NETHER_BRICKS,
                    Blocks.CHISELED_NETHER_BRICKS, Blocks.RED_NETHER_BRICKS,
                    Blocks.RED_NETHER_BRICKS, Blocks.NETHER_BRICKS
            );
    public NetherBrickChiselItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        Block clickedBlock = world.getBlockState(context.getBlockPos()).getBlock();
        if (NETHER_BRICK_CHISEL_MAP.containsKey(clickedBlock)){
            if (!world.isClient()){
                world.setBlockState(context.getBlockPos(), NETHER_BRICK_CHISEL_MAP.get(clickedBlock).getDefaultState());
                world.playSound(null, context.getBlockPos(), SoundEvents.BLOCK_GRINDSTONE_USE, SoundCategory.BLOCKS);

            }
        }


        return ActionResult.SUCCESS;
    }
    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("tooltip.more_of_all.nether_brick_chisel.tooltip"));


        super.appendTooltip(stack, context, tooltip, type);
    }
}
