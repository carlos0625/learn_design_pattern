package behavioral.state;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date: 2019/03/03-9:21
 * Description: 具体开关状态类
 */
public class OnState extends SwitchState {
    @Override
    public void turnOn(Switch s) {
        System.out.println("已经打开!");
    }

    @Override
    public void turnOff(Switch s) {
        System.out.println("关闭!");
        s.setState(Switch.getState("off"));
    }
}
