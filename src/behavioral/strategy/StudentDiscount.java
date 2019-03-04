package behavioral.strategy;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date: 2019/03/04-10:23
 * Description: 学生打折策略，充当具体策略类
 */
public class StudentDiscount implements Discount {
    private static final double DISCOUNT = 0.8;

    @Override
    public double calculate(double price) {
        System.out.println("学生票:");
        return DISCOUNT * price;
    }
}
