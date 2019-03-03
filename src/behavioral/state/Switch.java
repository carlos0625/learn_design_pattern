package behavioral.state;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date: 2019/03/03-9:19
 * Description: 开关类，共享同一状态实例中的环境类
 */
public class Switch {
    private static SwitchState currentState, onState, offState;
    private String name;
    private static final String ON = "on";

    public Switch(String name) {
        this.name = name;
        onState = new OnState();
        offState = new OffState();
        currentState = onState;
    }

    public void setState(SwitchState state) {
        currentState = state;
    }

    public static SwitchState getState(String type) {
        if (ON.equalsIgnoreCase(type)) {
            return onState;
        } else {
            return offState;
        }
    }

    public void turnOn() {
        System.out.print(name);
        currentState.turnOn(this);
    }

    public void turnOff() {
        System.out.print(name);
        currentState.turnOff(this);
    }
}
