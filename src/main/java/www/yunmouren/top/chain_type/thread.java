package www.yunmouren.top.chain_type;

import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitRunnable;
import org.json.simple.JSONValue;
import www.yunmouren.top.chain_type.tool.Http;

import java.util.Map;
import java.util.Objects;

public class thread extends BukkitRunnable {
    @Override
    public void run() {
        Map temporary = (Map) JSONValue.parse(Http.Post("http://127.0.0.1:50013/queue"));
        if (temporary.containsKey("CMD")) {
            String analysis = ((String) temporary.get("CMD"));
            if (!Objects.equals(analysis, "OK")) {
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), analysis);
            }
        }
    }
}

