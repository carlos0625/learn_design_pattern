package structure.flyweight.simple.includeouter;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Time: 2019/2/18 - 13:24
 * Description:
 */
public abstract class AbstractChess {
    /**
     * 棋子颜色
     * @return 颜色
     */
    public abstract String getColor();

    public void display(Coordinates coordinates) {
        System.out.println(this.getColor() + "棋子, 坐标为：(" + coordinates.getX() + ", " + coordinates.getY() + ")");
    }
}
