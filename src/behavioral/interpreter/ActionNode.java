package behavioral.interpreter;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date:    2019/0225-14:22
 * Description: 动作结点类，充当终结符表达式角色
 */
public class ActionNode extends AbstractNode {
    private static final String MOVE = "move";
    private static final String RUN = "run";

    private String action;

    public ActionNode(String action) {
        this.action = action;
    }

    @Override
    public String interpret() {
        if (MOVE.equalsIgnoreCase(action)) {
            return "移动";
        }
        if (RUN.equalsIgnoreCase(action)) {
            return "快速移动";
        }
        return "无效指令";
    }
}
