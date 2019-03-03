package behavioral.state;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date: 2019/03/03-9:21
 * Description: 具体开关状态类
 */
public class OffState extends SwitchState {
    @Override
    public void turnOn(Switch s) {
        System.out.println("打开!");
        s.setState(Switch.getState("on"));
    }

    @Override
    public void turnOff(Switch s) {
        System.out.println("已经关闭!");
    }
}
