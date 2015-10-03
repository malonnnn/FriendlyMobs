package com.gmail.malonnnnn.friendlymobs;

import net.minecraft.server.v1_8_R3.*;

import net.minecraft.server.v1_8_R3.World;

import java.util.List;

public class CustomSkeleton extends EntitySkeleton
{
    public CustomSkeleton(World world)
    {
        super (world);
        List goalB = (List)Utils.getPrivateField("b", PathfinderGoalSelector.class, goalSelector); goalB.clear();
        List goalC = (List)Utils.getPrivateField("c", PathfinderGoalSelector.class, goalSelector); goalC.clear();
        List targetB = (List)Utils.getPrivateField("b", PathfinderGoalSelector.class, targetSelector); targetB.clear();
        List targetC = (List)Utils.getPrivateField("c", PathfinderGoalSelector.class, targetSelector); targetC.clear();

        this.goalSelector.a(1, new PathfinderGoalFloat(this));
        this.goalSelector.a(2, new PathfinderGoalRestrictSun(this));
        this.goalSelector.a(3, new PathfinderGoalFleeSun(this, 1.0D));
        this.goalSelector.a(5, new PathfinderGoalRandomStroll(this, 1.0D));
        this.goalSelector.a(6, new PathfinderGoalLookAtPlayer(this, EntityHuman.class, 8.0F));
        this.goalSelector.a(6, new PathfinderGoalRandomLookaround(this));
        this.targetSelector.a(1, new PathfinderGoalHurtByTarget(this, false));
        this.targetSelector.a(2, new PathfinderGoalNearestAttackableTarget(this, EntitySkeleton.class, false, true));
        this.targetSelector.a(2, new PathfinderGoalNearestAttackableTarget(this, EntityCreeper.class, false, true));
        this.targetSelector.a(2, new PathfinderGoalNearestAttackableTarget(this, EntityEnderman.class, false, true));
        this.targetSelector.a(2, new PathfinderGoalNearestAttackableTarget(this, EntityZombie.class, false, true));
    }

}
