package builder.singleton;

/**
 * Description:
 *
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2019/1/31 9:13
 * @version : 1.0
 */
public class Client {
    public static void main(String[] args) {
        //创建4个LoadBalancer对象
        LoadBalancer balancer1, balancer2, balancer3, balancer4;
        balancer1 = LoadBalancer.getInstance();
        balancer2 = LoadBalancer.getInstance();
        balancer3 = LoadBalancer.getInstance();
        balancer4 = LoadBalancer.getInstance();

        //判断是否为单例
        if (balancer1 == balancer2 && balancer2 == balancer3 && balancer3 == balancer4)
            System.out.println("服务器负载均衡器具有唯一性");

        //增加服务器
        balancer1.addServer("Server1");
        balancer1.addServer("Server2");
        balancer1.addServer("Server3");
        balancer1.addServer("Server4");

        for (int i = 0; i < 10; i++) {
            String server = balancer1.getServer();
            System.out.println("请求分发至" + server);
        }
    }
}
