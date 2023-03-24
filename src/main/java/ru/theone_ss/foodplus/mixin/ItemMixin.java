package ru.theone_ss.foodplus.mixin;

import net.fabricmc.fabric.api.tag.convention.v1.ConventionalItemTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ru.theone_ss.foodplus.registry.FoodItems;

import java.util.random.RandomGenerator;

@Mixin(Item.class)
abstract class ItemMixin
{
    @Inject(at = @At("HEAD"), method = "useOnBlock", cancellable = true)
    private void useOnBlock(ItemUsageContext context, CallbackInfoReturnable<ActionResult> cir)
    {
        World world = context.getWorld();
        BlockPos blockPos = context.getBlockPos();
        PlayerEntity playerEntity = context.getPlayer();
        BlockState blockState = context.getWorld().getBlockState(blockPos);
        if(!world.isClient && blockState.isOf(Blocks.MANGROVE_ROOTS) && playerEntity.getStackInHand(context.getHand()).isIn(ConventionalItemTags.SWORDS))
        {
            ItemStack stack = playerEntity.getStackInHand(context.getHand());
            stack.setDamage(stack.getDamage()+1);
            Block.dropStack(world, blockPos, new ItemStack(FoodItems.ROOT, RandomGenerator.getDefault().nextInt(1, 3)));
            world.playSound(null, blockPos, SoundEvents.BLOCK_MANGROVE_ROOTS_BREAK, SoundCategory.BLOCKS, 1.0F, 2.0F);
            world.removeBlock(blockPos, true);
            cir.setReturnValue(ActionResult.SUCCESS);
        }
    }
}
