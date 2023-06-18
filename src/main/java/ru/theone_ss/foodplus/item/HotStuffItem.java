package ru.theone_ss.foodplus.item;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class HotStuffItem extends Item {

    private final BlockState fireBlock = Blocks.FIRE.getDefaultState();

    public HotStuffItem(Settings settings) {
        super(settings);
    }

    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user)
    {
        super.finishUsing(stack, world, user);

        BlockPos pos = user.getBlockPos();

        if (!world.isClient)
        {
            world.setBlockState(pos, fireBlock);
            user.setPosition(user.getX(), user.getY() + 1, user.getZ());
        }

        if (stack.isEmpty())
        {
            return new ItemStack(Items.BOWL);
        }
        else
        {
            if (user instanceof PlayerEntity playerEntity && !((PlayerEntity)user).getAbilities().creativeMode)
            {
                ItemStack itemStack = new ItemStack(Items.BOWL);
                if (!playerEntity.getInventory().insertStack(itemStack))
                {
                    playerEntity.dropItem(itemStack, false);
                }
            }
            return stack;
        }
    }
}
