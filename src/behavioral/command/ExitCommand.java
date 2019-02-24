package behavioral.command;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date:    2019/0224-9:25
 * Description: 具体命令类，退出命令
 */
public class ExitCommand extends Command {
    private SystemExitClass systemExitClass;

    public ExitCommand() {
        systemExitClass = new SystemExitClass();
    }

    @Override
    public void execute() {
        systemExitClass.exit();
    }
}
