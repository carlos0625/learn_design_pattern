package behavioral.interpreter;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date:    2019/0225-14:18
 * Description: 方向结点类，充当终结符表达式角色
 */
public class DirectionNode extends AbstractNode {
    private static final String UP = "up";
    private static final String DOWN = "down";
    private static final String LEFT = "left";
    private static final String RIGHT = "right";

    private String direction;

    public DirectionNode(String direction) {
        this.direction = direction;
    }

    @Override
    public String interpret() {
        if (UP.equalsIgnoreCase(direction)) {
            return "向上";
        }
        if (DOWN.equalsIgnoreCase(direction)) {
            return "向下";
        }
        if (LEFT.equalsIgnoreCase(direction)) {
            return "向左";
        }
        if (RIGHT.equalsIgnoreCase(direction)) {
            return "向右";
        }
        return "无效指令";
    }
}
