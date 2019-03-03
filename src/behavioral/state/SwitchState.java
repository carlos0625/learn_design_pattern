package behavioral.state;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date: 2019/03/03-9:20
 * Description: 开关状态的抽象类
 */
public abstract class SwitchState {
    /**
     * 打开开关
     * @param s
     */
    public abstract void turnOn(Switch s);

    /**
     * 关闭开关
     * @param s
     */
    public abstract void turnOff(Switch s);
}
