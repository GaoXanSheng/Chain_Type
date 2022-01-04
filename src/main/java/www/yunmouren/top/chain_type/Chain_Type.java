package www.yunmouren.top.chain_type;

import org.bukkit.plugin.java.JavaPlugin;

public final class Chain_Type extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        thread thread = new thread();
        // Time is 5ms
        //保证队列低消耗
        thread.runTaskTimer(this, 1L, 1L);
        this.getLogger().info("------[Chain_Type]------");
        this.getLogger().info("thread已经启动");
        this.getLogger().info("----[By Yun_Nan]----");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
