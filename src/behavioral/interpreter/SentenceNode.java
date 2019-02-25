package behavioral.interpreter;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date:    2019/0225-14:15
 * Description: 简单句子结点类，充当非终结符表达式角色
 */
public class SentenceNode extends AbstractNode {
    /**
     * 方向
     */
    private AbstractNode direction;
    /**
     * 动作
     */
    private AbstractNode action;
    /**
     * 距离
     */
    private AbstractNode distance;

    public SentenceNode(AbstractNode direction, AbstractNode action, AbstractNode distance) {
        this.direction = direction;
        this.action = action;
        this.distance = distance;
    }

    /**
     * 简单句子的解释操作
     * @return 解释的结果
     */
    @Override
    public String interpret() {
        return direction.interpret() + action.interpret() + distance.interpret();
    }
}
