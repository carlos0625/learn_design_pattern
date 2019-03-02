package behavioral.observer;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date: 2019/03/02-19:40
 * Description: 观察者接口，充当抽象观察者
 */
public interface Observer {
    /**
     * 返回观察者的名字
     * @return 名字
     */
    String getName();

    /**
     * 设置观察者的名字
     * @param name 名字
     */
    void setName(String name);

    /**
     * 支援盟友
     */
    void help();

    /**
     * 遭受攻击，通知指挥中心
     * @param acc 指挥中心
     */
    void beAttacked(AllyControlCenter acc);
}
