package ru.theone_ss.foodplus.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.boss.BossBar;
import net.minecraft.entity.boss.ServerBossBar;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.GiantEntity;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.passive.MerchantEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(GiantEntity.class)
public class GiantMixin extends PathAwareEntity {

    private final ServerBossBar bossBar = (ServerBossBar)new ServerBossBar(this.getDisplayName(), BossBar.Color.PURPLE, BossBar.Style.PROGRESS)
            .setDarkenSky(true);

    protected GiantMixin(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }

    @Inject(at = @At("HEAD"), method = "createGiantAttributes", cancellable = true)
    private  static void createGiantAttributes(CallbackInfoReturnable<DefaultAttributeContainer.Builder> cir){
        cir.setReturnValue(HostileEntity.createHostileAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 250.0)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.5)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 16.0)
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 55.0)
                .add(EntityAttributes.GENERIC_ARMOR, 16.0));
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(8, new LookAtEntityGoal(this, PlayerEntity.class, 35.0F));
        this.goalSelector.add(8, new LookAroundGoal(this));
        this.initCustomGoals();
    }

    protected void initCustomGoals() {
        this.goalSelector.add(2, new MeleeAttackGoal(this, 0.5, false));
        this.goalSelector.add(7, new WanderAroundFarGoal(this, 0.4)); // бегает по территории ищет гоал
        this.targetSelector.add(3, new ActiveTargetGoal(this, PlayerEntity.class, true));
        this.targetSelector.add(3, new ActiveTargetGoal(this, MerchantEntity.class, false));
        this.targetSelector.add(3, new ActiveTargetGoal(this, IronGolemEntity.class, true));
    }

    @Override
    public int getXpToDrop() {
        if (this.isBaby()) {
            this.experiencePoints = (int)((double)this.experiencePoints * 2.5);
        }
        return super.getXpToDrop() * 50;
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.ENTITY_ZOMBIE_AMBIENT;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.ENTITY_ZOMBIE_HURT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_ZOMBIE_DEATH;
    }

    protected SoundEvent getStepSound() {
        return SoundEvents.ENTITY_ZOMBIE_STEP;
    }

    @Override
    protected void playStepSound(BlockPos pos, BlockState state) {
        this.playSound(this.getStepSound(), 0.15F, 1.0F);
    }

    @Override
    public void readCustomDataFromNbt(NbtCompound nbt) {
        super.readCustomDataFromNbt(nbt);
        if (this.hasCustomName()) {
            this.bossBar.setName(this.getDisplayName());
        }
    }

    @Override
    public void setCustomName(@Nullable Text name) {
        super.setCustomName(name);
        this.bossBar.setName(this.getDisplayName());
    }

    @Override
    protected void mobTick() {
        this.bossBar.setPercent(this.getHealth() / this.getMaxHealth());
    }

    @Override
    public void onStartedTrackingBy(ServerPlayerEntity player) {
        super.onStartedTrackingBy(player);
        this.bossBar.addPlayer(player);
    }

    @Override
    public void onStoppedTrackingBy(ServerPlayerEntity player) {
        super.onStoppedTrackingBy(player);
        this.bossBar.removePlayer(player);
    }
}
