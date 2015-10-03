package com.gmail.malonnnnn.friendlymobs;

import net.minecraft.server.v1_8_R3.*;

import org.bukkit.DyeColor;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_8_R3.CraftWorld;
import org.bukkit.World;
import org.bukkit.entity.PigZombie;
import org.bukkit.entity.Skeleton;
import org.bukkit.Material;
import org.bukkit.entity.Zombie;
import org.bukkit.inventory.ItemStack;

import java.lang.reflect.Field;
import java.util.Map;

public class Utils {

    public static Object getPrivateField(String fieldName, Class clazz, Object object) {
        Field field;
        Object o = null;
        try {
            field = clazz.getDeclaredField(fieldName);
            field.setAccessible(true);
            o = field.get(object);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return o;
    }

    public enum EntityTypes {
        //NAME("Entity name", Entity ID, yourcustomclass.class);
        CUSTOM_ZOMBIE("Zombie", 54, CustomZombie.class),
        CUSTOM_SKELETON("Skeleton", 51, CustomSkeleton.class),
        CUSTOM_PIGZOMBIE("PigZombie", 57, CustomPigZombie.class); //You can add as many as you want

        private EntityTypes(String name, int id, Class<? extends Entity> custom) {
            addToMaps(custom, name, id);
        }

        public static void spawnEntity(String type, Entity entity, Location loc, World world, String mobColor) {
            switch (type) {
                case "skeleton":
                    final Skeleton s = (Skeleton) entity.getBukkitEntity();
                    ItemStack bow = new ItemStack(Material.BOW, 1);
                    s.getEquipment().setItemInHand(bow);
                    if(mobColor.equalsIgnoreCase("red")){
                        ItemStack[] is = new ItemStack[4];
                        is[0] = new ItemStack(Material.AIR);
                        is[1] = new ItemStack(Material.AIR);
                        is[2] = new ItemStack(Material.AIR);
                        is[3] = new ItemStack(Material.WOOL, 1, DyeColor.RED.getData());
                        s.getEquipment().setArmorContents(is);
                    }else if (mobColor.equalsIgnoreCase("blue")){
                        ItemStack[] is = new ItemStack[4];
                        is[0] = new ItemStack(Material.AIR);
                        is[1] = new ItemStack(Material.AIR);
                        is[2] = new ItemStack(Material.AIR);
                        is[3] = new ItemStack(Material.WOOL, 1, DyeColor.BLUE.getData());
                        s.getEquipment().setArmorContents(is);
                    }

                    break;
                case "zombie":
                    final Zombie z = (Zombie) entity.getBukkitEntity();
                    z.setBaby(false);
                    if(mobColor.equalsIgnoreCase("red")){
                        ItemStack[] is = new ItemStack[4];
                        is[0] = new ItemStack(Material.AIR);
                        is[1] = new ItemStack(Material.AIR);
                        is[2] = new ItemStack(Material.AIR);
                        is[3] = new ItemStack(Material.WOOL, 1, DyeColor.RED.getData());
                        z.getEquipment().setArmorContents(is);
                    }else if (mobColor.equalsIgnoreCase("blue")){
                        ItemStack[] is = new ItemStack[4];
                        is[0] = new ItemStack(Material.AIR);
                        is[1] = new ItemStack(Material.AIR);
                        is[2] = new ItemStack(Material.AIR);
                        is[3] = new ItemStack(Material.WOOL, 1, DyeColor.BLUE.getData());
                        z.getEquipment().setArmorContents(is);
                    }
                    break;
                case "pigzombie":
                    final PigZombie pz = (PigZombie) entity.getBukkitEntity();
                    pz.setBaby(false);
                    if(mobColor.equalsIgnoreCase("red")){
                        ItemStack[] is = new ItemStack[4];
                        is[0] = new ItemStack(Material.AIR);
                        is[1] = new ItemStack(Material.AIR);
                        is[2] = new ItemStack(Material.AIR);
                        is[3] = new ItemStack(Material.WOOL, 1, DyeColor.RED.getData());
                        pz.getEquipment().setArmorContents(is);
                    }else if (mobColor.equalsIgnoreCase("blue")){
                        ItemStack[] is = new ItemStack[4];
                        is[0] = new ItemStack(Material.AIR);
                        is[1] = new ItemStack(Material.AIR);
                        is[2] = new ItemStack(Material.AIR);
                        is[3] = new ItemStack(Material.WOOL, 1, DyeColor.BLUE.getData());
                        pz.getEquipment().setArmorContents(is);
                    }
                    break;
                case "babyzombie":
                    final Zombie bz = (Zombie) entity.getBukkitEntity();
                    bz.setBaby(true);
                    if(mobColor.equalsIgnoreCase("red")){
                        ItemStack[] is = new ItemStack[4];
                        is[0] = new ItemStack(Material.AIR);
                        is[1] = new ItemStack(Material.AIR);
                        is[2] = new ItemStack(Material.AIR);
                        is[3] = new ItemStack(Material.WOOL, 1, DyeColor.RED.getData());
                        bz.getEquipment().setArmorContents(is);
                    }else if (mobColor.equalsIgnoreCase("blue")){
                        ItemStack[] is = new ItemStack[4];
                        is[0] = new ItemStack(Material.AIR);
                        is[1] = new ItemStack(Material.AIR);
                        is[2] = new ItemStack(Material.AIR);
                        is[3] = new ItemStack(Material.WOOL, 1, DyeColor.BLUE.getData());
                        bz.getEquipment().setArmorContents(is);
                    }
                    break;
                case "babypigzombie":
                    final PigZombie bpz = (PigZombie) entity.getBukkitEntity();
                    bpz.setBaby(true);
                    if(mobColor.equalsIgnoreCase("red")){
                        ItemStack[] is = new ItemStack[4];
                        is[0] = new ItemStack(Material.AIR);
                        is[1] = new ItemStack(Material.AIR);
                        is[2] = new ItemStack(Material.AIR);
                        is[3] = new ItemStack(Material.WOOL, 1, DyeColor.RED.getData());
                        bpz.getEquipment().setArmorContents(is);
                    }else if (mobColor.equalsIgnoreCase("blue")){
                        ItemStack[] is = new ItemStack[4];
                        is[0] = new ItemStack(Material.AIR);
                        is[1] = new ItemStack(Material.AIR);
                        is[2] = new ItemStack(Material.AIR);
                        is[3] = new ItemStack(Material.WOOL, 1, DyeColor.BLUE.getData());
                        bpz.getEquipment().setArmorContents(is);
                    }
                    break;
                default:

                    break;

            }

            entity.setLocation(loc.getX(), loc.getY(), loc.getZ(), loc.getYaw(), loc.getPitch());
            ((CraftWorld) loc.getWorld()).getHandle().addEntity(entity);
        }

        private static void addToMaps(Class clazz, String name, int id) {
            //getPrivateField is the method from above.
            //Remove the lines with // in front of them if you want to override default entities (You'd have to remove the default entity from the map first though).
            ((Map) getPrivateField("c", net.minecraft.server.v1_8_R3.EntityTypes.class, null)).put(name, clazz);
            ((Map) getPrivateField("d", net.minecraft.server.v1_8_R3.EntityTypes.class, null)).put(clazz, name);
            //((Map)getPrivateField("e", net.minecraft.server.v1_7_R4.Utils.class, null)).put(Integer.valueOf(id), clazz);
            ((Map) getPrivateField("f", net.minecraft.server.v1_8_R3.EntityTypes.class, null)).put(clazz, Integer.valueOf(id));
            //((Map)getPrivateField("g", net.minecraft.server.v1_7_R4.Utils.class, null)).put(name, Integer.valueOf(id));
        }
    }
}
