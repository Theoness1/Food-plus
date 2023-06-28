package ru.theone_ss.foodplus.item;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.GiantEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Objects;

public class MysteriousMedicineItem extends Item {

    protected final Random random = Random.create();
    private final MutableText titleText = (MutableText) Text.of("Don't give zombies");

    public MysteriousMedicineItem(Settings settings) {
        super(settings);
    }

    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(titleText.formatted(Formatting.GRAY)); //текст добавляет к предмету
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

    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        if(itemStack.isOf(this) && entity.isUndead())
        {
            itemStack.decrement(1);
            if(user.getWorld() instanceof ServerWorld serverWorld)
            {
                GiantEntity giantEntity = new GiantEntity(EntityType.GIANT, user.getWorld());
                serverWorld.spawnEntity(giantEntity);
                entity.kill();
                //giantEntity.copyPositionAndRotation(entity);
                giantEntity.setPosition(entity.getX(), entity.getY(), entity.getZ());
            }
            return ActionResult.PASS;
        }
        return super.useOnEntity(stack, user, entity, hand);
    }
}
