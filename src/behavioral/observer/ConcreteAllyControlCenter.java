package behavioral.observer;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date: 2019/03/02-19:49
 * Description: 具体观察目标类，指挥中心的子类
 */
public class ConcreteAllyControlCenter extends AllyControlCenter {
    public ConcreteAllyControlCenter(String allyName) {
        this.allyName = allyName;
        System.out.println(allyName + "战队组建成功!");
    }

    @Override
    public void notifyObserver(String name) {
        System.out.println(this.allyName + "战队紧急通知。盟友" + name + "遭到攻击，请前往救援。");
        for (Observer observer : players) {
            //不是被攻击的玩家，就进行援救
            if (!observer.getName().equalsIgnoreCase(name)) {
                observer.help();
            }
        }
    }
}
