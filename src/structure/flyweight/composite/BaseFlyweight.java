package structure.flyweight.composite;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Time: 2019/2/18 - 14:00
 * Description: 抽象享元类（复合享元模式）
 */
public abstract class BaseFlyweight {
    /**
     * 操作外部状态
     * @param extrinsicState 外部状态
     */
    public abstract void operation(String extrinsicState);
}
