package behavioral.state;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date: 2019/03/03-9:31
 * Description: 开关的客户端
 */
public class ClientForSwitch {
    public static void main(String[] args) {
        Switch s1 = new Switch("开关1");
        Switch s2 = new Switch("开关2");

        s1.turnOn();
        s2.turnOn();

        s1.turnOff();
        s2.turnOff();

        s2.turnOn();
        s1.turnOn();
    }
}
