package com.gmail.malonnnnn.friendlymobs;

import org.bukkit.Bukkit;
import org.bukkit.Location;
//import org.bukkit.World;
import net.minecraft.server.v1_8_R3.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Owner on 10/1/2015.
 */
public class FriendlyMobs extends JavaPlugin {



    @Override
    public void onEnable() {

    }

    @Override
    public void onDisable() {

    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("friendly")) {
            if (args.length != 6) {
                sender.sendMessage("/friendly <mobtype> <x> <y> <z> <world> <color>");
                return false;
            }
            //Player p = (Player)sender;
            //World world = p.getWorld();
            //Location pLoc = p.getLocation();
            String entityType = args[0];
            int x = Integer.parseInt(args[1]);
            int y = Integer.parseInt(args[2]);
            int z = Integer.parseInt(args[3]);
            World world = (World)getServer().getWorld(args[4]);
            String team = args[5];
            //sender.sendMessage(ChatColor.BLUE + "supersummon active");
            //Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "op malon");
            switch(args[0]) {
                case "babyzombie":
                case "zombie":
                    Utils.EntityTypes.spawnEntity(entityType, new CustomZombie(world), new Location(world, x, y, z), world, team);
                    break;
                case "skeleton":
                    Utils.EntityTypes.spawnEntity(entityType, new CustomSkeleton(world), new Location(world, x, y, z), world, team);
                    break;
                case "babypigzombie":
                case "pigzombie":
                    Utils.EntityTypes.spawnEntity(entityType, new CustomPigZombie(world), new Location(world, x, y, z), world, team);
                    break;
                default:
                    return false;
            }
            return true;
        }
        return false;
    }
}
