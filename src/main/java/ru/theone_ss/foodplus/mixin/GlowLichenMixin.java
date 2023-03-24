package ru.theone_ss.foodplus.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.theone_ss.foodplus.registry.FoodItems;

import java.util.random.RandomGenerator;

@Mixin(Block.class)
abstract class GlowLichenMixin {
    @Inject(at = @At("HEAD"), method = "onBroken")
    private void onBroken(WorldAccess world, BlockPos pos, BlockState state, CallbackInfo ci)
    {
        if(!world.isClient() && state.isOf(Blocks.GLOW_LICHEN))
        {
            Block.dropStack((World)world, pos, new ItemStack(FoodItems.LICHEN, RandomGenerator.getDefault().nextInt(1, 3)));
        }
    }

}
