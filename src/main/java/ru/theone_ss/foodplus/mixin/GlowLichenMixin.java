package ru.theone_ss.foodplus.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.theone_ss.foodplus.registry.FoodItems;

import java.util.random.RandomGenerator;

@Mixin(Block.class)
abstract class GlowLichenMixin {
    @Inject(at = @At("HEAD"), method = "onBreak")
    private void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player, CallbackInfo ci)
    {
        if(!world.isClient() && state.isOf(Blocks.GLOW_LICHEN) && !player.getStackInHand(Hand.MAIN_HAND).isOf(Items.SHEARS))
        { //TODO
            Block.dropStack(world, pos, new ItemStack(FoodItems.LICHEN, RandomGenerator.getDefault().nextInt(1, 3)));
        }
    }
}
