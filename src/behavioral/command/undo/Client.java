package behavioral.command.undo;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date:    2019/0224-10:28
 * Description: 客户端
 */
public class Client {
    public static void main(String[] args) {
        CalculatorForm form = new CalculatorForm();
        AbstractCommand command = new AddCommand();
        form.setCommand(command);

        form.compute(10);
        form.compute(5);
        form.compute(10);
        form.undo();
//        form.undo();
    }
}
