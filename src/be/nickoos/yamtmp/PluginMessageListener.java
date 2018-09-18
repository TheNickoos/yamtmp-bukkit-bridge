package be.nickoos.yamtmp;

import org.bukkit.entity.Player;





public class PluginMessageListener implements org.bukkit.plugin.messaging.PluginMessageListener {
    private static yamtmp plugin;

    PluginMessageListener(yamtmp p) {
        plugin = p;
    }

    public void onPluginMessageReceived(String channel, Player player, byte[] message) {
        if (!channel.equals("BungeeCord")) {
            return;
        }

    }

}

