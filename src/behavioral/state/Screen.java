package behavioral.state;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date: 2019/03/03-9:48
 * Description: 环境类，包含状态转换功能，此时将状态转换功能放入了环境类中，而不再是放入状态类中
 */
public class Screen {
    private ScreenState currentState, normalState, largerState, largestState;

    public Screen() {
        normalState = new NormalScreenState();
        largerState = new LargerScreenState();
        largestState = new LargestScreenState();
        currentState = normalState;
        currentState.display();
    }

    public void setCurrentState(ScreenState currentState) {
        this.currentState = currentState;
    }

    /**
     * 单击事件处理方法，封装了对状态类中业务方法的调用和状态的转换
     */
    public void onClick() {
        if (this.currentState == normalState) {
            currentState = largerState;
        } else if (this.currentState == largerState) {
            currentState = largestState;
        } else {
            currentState = normalState;
        }
        currentState.display();
    }
}
