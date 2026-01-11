package com.darkcore.core.updater;

import com.darkcore.core.DarkCoreMain;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.HttpURLConnection;

/**
 * Handles automatic update checking from GitHub.
 */
public class CoreUpdater implements Listener {
    private final DarkCoreMain plugin;
    private final String currentVersion;
    private String latestVersion;
    
    // Repository details
    private final String githubRepo = "animesao/darkcore";
    private final String websiteUrl = "https://alfheimguide.ct.ws/";

    public CoreUpdater(DarkCoreMain plugin) {
        this.plugin = plugin;
        this.currentVersion = plugin.getDescription().getVersion();
        checkForUpdates();
    }

    /**
     * Performs an asynchronous update check against GitHub API.
     */
    public void checkForUpdates() {
        Bukkit.getScheduler().runTaskAsynchronously(plugin, () -> {
            try {
                URL url = new URL("https://api.github.com/repos/" + githubRepo + "/releases/latest");
                HttpURLConnection con = (HttpURLConnection) url.openConnection();
                con.setRequestMethod("GET");
                con.setRequestProperty("User-Agent", "DarkCore-Updater");

                if (con.getResponseCode() == 200) {
                    BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                    StringBuilder response = new StringBuilder();
                    String inputLine;
                    while ((inputLine = in.readLine()) != null) {
                        response.append(inputLine);
                    }
                    in.close();

                    String content = response.toString();
                    if (content.contains("\"tag_name\":\"")) {
                        latestVersion = content.split("\"tag_name\":\"")[1].split("\"")[0];
                    }
                }

                if (latestVersion != null && !currentVersion.equalsIgnoreCase(latestVersion)) {
                    plugin.getLogger().warning("========================================");
                    plugin.getLogger().warning("A new version of DarkCore is available!");
                    plugin.getLogger().warning("Current: " + currentVersion + " | Latest: " + latestVersion);
                    plugin.getLogger().warning("Download: https://github.com/" + githubRepo + "/releases");
                    plugin.getLogger().warning("Website: " + websiteUrl);
                    plugin.getLogger().warning("========================================");
                }
            } catch (Exception e) {
                plugin.getLogger().info("Update check failed: " + e.getMessage());
            }
        });
    }

    /**
     * Notifies operators about available updates when they join.
     */
    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        if (player.isOp() && latestVersion != null && !currentVersion.equalsIgnoreCase(latestVersion)) {
            player.sendMessage(ChatColor.DARK_PURPLE + "[DarkCore] " + ChatColor.LIGHT_PURPLE + "A new update (" + latestVersion + ") is ready!");
            player.sendMessage(ChatColor.DARK_PURPLE + "[DarkCore] " + ChatColor.GRAY + "Download & Info: " + ChatColor.WHITE + websiteUrl);
        }
    }
}
