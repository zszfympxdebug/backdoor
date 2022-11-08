package com.zszf.backdoor;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class backdoor extends JavaPlugin {
    public static JavaPlugin instance;
    public static Logger logger = Bukkit.getLogger();
    public static final String version = "0.0.1";
    public static final String api_version = "1.19.2";

    @Override
    public void onEnable(){
        instance = this;
        logger.info(ChatColor.RED +"Enable zszf_backdoor" + version);
        logger.info(ChatColor.MAGIC + "本插件运行于paper-"+api_version+" 其他版本如有错误 概不负责");
        logger.info(ChatColor.BLUE +"===========================");
        logger.info(ChatColor.BLUE +
                "\\_ |__ _____    ____ |  | __ __| _/____   ___________ \n" +
                " | __ \\\\__  \\ _/ ___\\|  |/ // __ |/  _ \\ /  _ \\_  __ \\\n" +
                " | \\_\\ \\/ __ \\\\  \\___|    </ /_/ (  <_> |  <_> )  | \\/\n" +
                " |___  (____  /\\___  >__|_ \\____ |\\____/ \\____/|__|   \n" +
                "     \\/     \\/     \\/     \\/    \\/              ");
        logger.info(ChatColor.BLUE + "===========================");
        logger.info(String.valueOf(ChatColor.RESET));
    }

    @Override
    public void onLoad(){
        saveDefaultConfig();
    }

    @Override
    public void onDisable(){
        logger.info("Disable zszf_backdoor");
    }
}
