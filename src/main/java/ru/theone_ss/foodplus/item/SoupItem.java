package ru.theone_ss.foodplus.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;

public class SoupItem extends Item {
    public SoupItem(Settings settings) {
        super(settings);
    }

    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user)
    {
        super.finishUsing(stack, world, user);
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