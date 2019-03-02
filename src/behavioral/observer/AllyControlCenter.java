package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date: 2019/03/02-19:39
 * Description: 指挥部（战队控制中心），充当抽象目标类
 */
public abstract class AllyControlCenter {
    protected String allyName;
    protected List<Observer> players;

    public AllyControlCenter() {
        players = new ArrayList<>();
    }

    public String getAllyName() {
        return allyName;
    }

    public void setAllyName(String allyName) {
        this.allyName = allyName;
    }

    public void join(Observer observer) {
        players.add(observer);
        System.out.println(observer.getName() + "刚刚加入了" + allyName + "战队!");
    }

    public void quit(Observer observer) {
        players.remove(observer);
        System.out.println(observer.getName() + "刚刚退出了" + allyName + "战队!");
    }

    /**
     * 通知观察者
     * @param name
     */
    public abstract void notifyObserver(String name);
}
