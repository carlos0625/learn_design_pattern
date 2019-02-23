package structure.flyweight.simple.includeouter;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Time: 2019/2/18 - 13:48
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        ChessFactory chessFactory = ChessFactory.getInstance();

        AbstractChess bc1, bc2, bc3, wc1, wc2;
        bc1 = chessFactory.getChess("black");
        bc2 = chessFactory.getChess("black");
        bc3 = chessFactory.getChess("black");
        wc1 = chessFactory.getChess("white");
        wc2 = chessFactory.getChess("white");

        System.out.println("\"bc1 == bc2\" = " + (bc1 == bc2));
        System.out.println("\"bc2 == bc3\" = " + (bc2 == bc3));
        System.out.println("\"wc1 == wc2\" = " + (wc1 == wc2));

        bc1.display(new Coordinates(1, 1));
        bc2.display(new Coordinates(3, 6));
        bc3.display(new Coordinates(2, 4));
        wc1.display(new Coordinates(10, 2));
        wc2.display(new Coordinates(7, 2));
    }
}
