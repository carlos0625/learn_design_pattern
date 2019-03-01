package behavioral.memento;

import behavioral.memento.entity.ChessmanMemento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date: 2019/03/01-8:49
 * Description: 负责人2，可以实现多次撤销
 */
public class MementoCaretaker2 {
    private List<ChessmanMemento> chessmanMementos;

    public MementoCaretaker2() {
        chessmanMementos = new ArrayList<>();
    }

    public ChessmanMemento getChessmanMemento() {
        return chessmanMementos.remove(chessmanMementos.size() - 1);
    }

    public void saveMemento(ChessmanMemento memento) {
        chessmanMementos.add(memento);
    }
}
