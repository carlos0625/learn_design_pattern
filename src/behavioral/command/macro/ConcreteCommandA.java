package behavioral.command.macro;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date:    2019/0224-10:43
 * Description: 具体命令类
 */
public class ConcreteCommandA extends AbstractCommand {
    private ReceiverA receiverA;

    public ConcreteCommandA() {
        receiverA = new ReceiverA();
    }

    @Override
    public void addCommand(AbstractCommand command) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void removeCommand(AbstractCommand command) {
        throw new UnsupportedOperationException();
    }

    @Override
    public AbstractCommand getCommand(int i) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void execute() {
        receiverA.action();
    }
}
