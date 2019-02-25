package behavioral.command.base;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date:    2019/0224-9:27
 * Description: 具体命令类，显示帮助文档
 */
public class HelpCommand extends Command {
    private DisplayHelpClass displayHelpClass;

    public HelpCommand() {
        displayHelpClass = new DisplayHelpClass();
    }

    @Override
    public void execute() {
        displayHelpClass.display();
    }
}
