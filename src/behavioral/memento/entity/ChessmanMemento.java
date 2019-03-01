package behavioral.memento.entity;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date: 2019/03/01-8:29
 * Description: 象棋棋子备忘录，充当备忘录类
 *   属性设置为私有，构造方法、getter、setter系列方法均设置为包私有类型
 */
public class ChessmanMemento {
    private String label;
    private int x;
    private int y;

    ChessmanMemento(String label, int x, int y) {
        this.label = label;
        this.x = x;
        this.y = y;
    }

    String getLabel() {
        return label;
    }

    void setLabel(String label) {
        this.label = label;
    }

    int getX() {
        return x;
    }

    void setX(int x) {
        this.x = x;
    }

    int getY() {
        return y;
    }

    void setY(int y) {
        this.y = y;
    }
}
