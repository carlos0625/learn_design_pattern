package behavioral.command.undo;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date:    2019/0224-10:22
 * Description: 抽象命令类
 */
public abstract class AbstractCommand {
    /**
     * 声明命令执行方法execute()
     * @param value
     * @return
     */
    public abstract int execute(int value);

    /**
     * 声明撤销方法undo()，只能实现一次撤销
     * @return
     */
    public abstract int undo();
}
