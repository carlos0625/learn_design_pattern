package behavioral.mediator;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date: 2019/02/28-10:04
 * Description: 抽象中介者类
 */
public abstract class AbstractMediator {
    /**
     * 组件改变
     * @param c
     */
    public abstract void componentChanged(AbstractComponent c);
}
