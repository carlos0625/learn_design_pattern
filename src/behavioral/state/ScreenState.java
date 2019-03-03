package behavioral.state;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date: 2019/03/03-9:49
 * Description: 屏幕状态类，不含状态转换的职责
 */
public abstract class ScreenState {
    /**
     * 显示屏幕
     */
    public abstract void display();
}
