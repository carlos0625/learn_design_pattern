package behavioral.command.macro;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date:    2019/0224-10:45
 * Description: 具体命令类B
 */
public class ConcreteCommandB extends AbstractCommand {
    private ReceiverB receiverB;

    public ConcreteCommandB() {
        receiverB = new ReceiverB();
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
        receiverB.action();
    }
}
