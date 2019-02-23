package structure.flyweight.simple.inner;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Time: 2019/2/18 - 13:09
 * Description: 客户端
 */
public class Client {
    public static void main(String[] args) {
        IgoChessman black1, black2, black3, white1, white2;

        //创建工厂
        IgoChessmanFactory factory = IgoChessmanFactory.getInstance();

        //获取棋子对象
        black1 = factory.getIgoChessman("b");
        black2 = factory.getIgoChessman("b");
        black3 = factory.getIgoChessman("b");
        white1 = factory.getIgoChessman("w");
        white2 = factory.getIgoChessman("w");

        System.out.println("两个白棋对象是否相同：" + (white1 == white2));

        //显示棋子
        black1.display();
        black2.display();
        black3.display();
        white1.display();
        white2.display();
    }
}
