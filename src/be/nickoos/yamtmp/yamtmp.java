package be.nickoos.yamtmp;

import org.bukkit.plugin.java.JavaPlugin;
import org.bstats.bukkit.Metrics;


public class yamtmp extends JavaPlugin {

    @Override
    public void onEnable() {
    	Metrics metrics = new Metrics(this);
        super.onEnable();
        this.getServer().getMessenger().registerOutgoingPluginChannel(this, "BungeeCord");
        this.getServer().getMessenger().registerIncomingPluginChannel(this, "BungeeCord", new PluginMessageListener(this));
    }
    
    public void onDisable() {
        super.onDisable();
    }
}