package behavioral.command.macro;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date:    2019/0224-10:40
 * Description: 抽象命令类
 */
public abstract class AbstractCommand {
    /**
     * 添加命令
     * @param command
     */
    public abstract void addCommand(AbstractCommand command);

    /**
     * 删除命令
     * @param command
     */
    public abstract void removeCommand(AbstractCommand command);

    /**
     * 获取命令对象
     * @param i
     */
    public abstract AbstractCommand getCommand(int i);

    /**
     * 执行（转发命令给命令接收者）
     */
    public abstract void execute();
}
