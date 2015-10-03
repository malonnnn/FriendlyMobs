package com.gmail.malonnnnn.friendlymobs;

import net.minecraft.server.v1_8_R3.*;

import net.minecraft.server.v1_8_R3.World;

import java.util.List;

public class CustomPigZombie extends EntityPigZombie
{
    public CustomPigZombie(World world)
    {
        super(world);
        this.goalSelector.a(2, new PathfinderGoalMeleeAttack(this, EntityZombie.class, 1.0D, false));
        this.goalSelector.a(4, new PathfinderGoalMeleeAttack(this, EntitySkeleton.class, 1.0D, true));
        this.targetSelector.a(2, new PathfinderGoalNearestAttackableTarget(this, EntityZombie.class, false, true));
        this.targetSelector.a(2, new PathfinderGoalNearestAttackableTarget(this, EntitySkeleton.class, false, false));
    }
}
