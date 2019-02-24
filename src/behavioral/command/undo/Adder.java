package behavioral.command.undo;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date:    2019/0224-10:20
 * Description: 加法类
 */
public class Adder {
    /**
     * 定义初始值为0
     */
    private int num = 0;

    /**
     * 加法操作，每次将传入的值与num作加法运算，再将结果返回
     * @param value
     * @return
     */
    public int add(int value) {
        num += value;
        return num;
    }
}
