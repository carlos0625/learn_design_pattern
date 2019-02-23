package builder.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Description:
 *
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2019/1/31 9:09
 * @version : 1.0
 */
public class LoadBalancer {
    private static LoadBalancer instance = null;
    private List<String> servers = null;

    private LoadBalancer() {
        servers = new ArrayList<>();
    }

    public static LoadBalancer getInstance() {
        if (instance == null)
            instance =  new LoadBalancer();
        return instance;
    }

    public void addServer(String server) {
        servers.add(server);
    }

    public void deleteServer(String server) {
        servers.remove(server);
    }

    public String getServer() {
        Random random = new Random();
        int i = random.nextInt(servers.size());
        return servers.get(i);
    }
}
