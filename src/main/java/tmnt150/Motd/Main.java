package tmnt150.Motd;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable(){
        System.out.println("插件開啟");
        getCommand("nick").setExecutor(new NickCmd());
    }
}
