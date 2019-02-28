package behavioral.mediator;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date: 2019/02/28-10:05
 * Description: 抽象组件类，充当抽象同事类
 */
public abstract class AbstractComponent {
    protected AbstractMediator mediator;

    public void setMediator(AbstractMediator mediator) {
        this.mediator = mediator;
    }

    /**
     * 转发调用
     */
    public void changed() {
        mediator.componentChanged(this);
    }

    /**
     * 组件更新
     */
    public abstract void update();
}
