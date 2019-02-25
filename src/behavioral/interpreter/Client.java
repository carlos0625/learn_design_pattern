package behavioral.interpreter;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date:    2019/0225-14:44
 * Description: 客户端
 */
public class Client {
    public static void main(String[] args) {
        String instruction = "down run 10 and left move 20";
        InstructionHandler handler = new InstructionHandler();
        handler.handle(instruction);

        String output = handler.output();
        System.out.println(output);
    }
}
