package behavioral.memento;

import behavioral.memento.entity.Chessman;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date: 2019/03/01-8:37
 * Description: 客户端
 */
public class Client {
    /**
     * main method
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        undoOnce();
        System.out.println();
        undoManyTimes();
    }

    /**
     * 显示棋子位置
     * @param chess 棋子
     */
    public static void display(Chessman chess) {
        System.out.println("Chess name: " + chess.getLabel() +
                "; row: " + chess.getX() + ", column: " + chess.getY() + ".");
    }

    /**
     * 实现一次撤销的测试
     */
    public static void undoOnce() {
        //创建负责人
        MementoCaretaker caretaker = new MementoCaretaker();

        //创建棋子并显示
        Chessman chess1 = new Chessman("车", 1, 1);
        display(chess1);

        //保存棋子状态
        caretaker.setMemento(chess1.save());

        //改变棋子的位置
        chess1.setX(5);
        display(chess1);

        //再次保存状态
        caretaker.setMemento(chess1.save());

        //再次改变棋子位置
        chess1.setY(4);
        display(chess1);

        System.out.println("********************悔棋********************");

        //状态恢复
        chess1.restore(caretaker.getMemento());
        display(chess1);
    }

    /**
     * 实现多次撤销
     */
    public static void undoManyTimes() {
        MementoCaretaker2 caretaker = new MementoCaretaker2();

        Chessman chess = new Chessman("马", 3, 4);
        display(chess);
        caretaker.saveMemento(chess.save());

        chess.setX(4);
        chess.setY(5);
        display(chess);
        caretaker.saveMemento(chess.save());

        chess.setX(3);
        chess.setY(6);
        display(chess);

        System.out.println("***********************悔棋************************");
        chess.restore(caretaker.getChessmanMemento());
        display(chess);
        chess.restore(caretaker.getChessmanMemento());
        display(chess);
    }
}
