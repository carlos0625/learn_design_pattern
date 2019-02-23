package structure.flyweight.simple.inner;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Time: 2019/2/18 - 13:00
 * Description: 围棋棋子类，充当抽象享元类
 */
public abstract class IgoChessman {
    /**
     * 棋子颜色
     * @return 颜色字符串
     */
    public abstract String getColor();

    public void display() {
        System.out.println("棋子颜色: " + getColor());
    }
}
