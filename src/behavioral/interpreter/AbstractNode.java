package behavioral.interpreter;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date:    2019/0225-14:11
 * Description: 抽象节点类，充当抽象表达式角色
 */
public abstract class AbstractNode {
    /**
     * 解释操作
     * @return 解释的结果
     */
    public abstract String interpret();
}
