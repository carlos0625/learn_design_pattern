package behavioral.memento;

import behavioral.memento.entity.ChessmanMemento;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date: 2019/03/01-8:36
 * Description: 象棋棋子备忘录管理类，充当负责人，只能实现一次撤销
 */
public class MementoCaretaker {
    private ChessmanMemento memento;

    public void setMemento(ChessmanMemento memento) {
        this.memento = memento;
    }

    public ChessmanMemento getMemento() {
        return memento;
    }
}
