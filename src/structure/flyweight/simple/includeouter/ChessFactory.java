package structure.flyweight.simple.includeouter;


import java.util.HashMap;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Time: 2019/2/18 - 13:43
 * Description: 棋子工厂类，单例模式维护工厂类
 */
public class ChessFactory {
    private static ChessFactory instance = new ChessFactory();
    private HashMap<String, AbstractChess> chessHashMap;

    private ChessFactory() {
        chessHashMap = new HashMap<>();
        AbstractChess blackChess = new BlackChess();
        AbstractChess whiteChess = new WhiteChess();
        chessHashMap.put("black", blackChess);
        chessHashMap.put("white", whiteChess);
    }

    public static ChessFactory getInstance() {
        return instance;
    }

    public AbstractChess getChess(String chessColor) {
        return chessHashMap.get(chessColor);
    }
}
