package behavioral.interpreter;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date:    2019/0225-14:12
 * Description: And结点类，充当非终结符复合表达式角色
 */
public class AndNode extends AbstractNode {
    /**
     * 左表达式
     */
    private AbstractNode left;
    /**
     * 右表达式
     */
    private AbstractNode right;

    public AndNode(AbstractNode left, AbstractNode right) {
        this.left = left;
        this.right = right;
    }

    /**
     * And表达式解释操作
     * @return 解释的结果
     */
    @Override
    public String interpret() {
        return left.interpret() + "再" + right.interpret();
    }
}
