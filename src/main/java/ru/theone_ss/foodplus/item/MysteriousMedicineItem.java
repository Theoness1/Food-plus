package ru.theone_ss.foodplus.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

import java.util.Objects;

public class MysteriousMedicineItem extends Item {

    protected final Random random = Random.create();

    public MysteriousMedicineItem(Settings settings) {
        super(settings);
    }

    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user)
    {
        super.finishUsing(stack, world, user);

        Objects.requireNonNull(user.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH)).setBaseValue(user.getMaxHealth() + 2);

        if (!world.isClient)
        {
            world.playSound(null, user.getBlockPos(), SoundEvents.ITEM_TOTEM_USE, SoundCategory.PLAYERS, 1.0F, 1.0F);
        }

        if(user.getWorld() instanceof ServerWorld serverWorld)
        {
            for(int i = 0; i < 8; ++i)
            {
                int d = this.random.nextInt(2);
                int e = this.random.nextInt(2);
                int f = this.random.nextInt(2);
                serverWorld.spawnParticles(ParticleTypes.HEART, user.getX(), user.getY() + 0.5, user.getZ(), 3, d, e + 0.5f, f, 0);
            }
        }
        //world.addParticle(ParticleTypes.HEART, user.prevX, user.prevY + 0.5, user.prevZ, 0.0, 0.0, 0.0);
        return stack;
    }

}
