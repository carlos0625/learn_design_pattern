package behavioral.strategy;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date: 2019/03/04-10:25
 * Description: 儿童折扣类，充当具体策略类
 */
public class ChildrenDiscount implements Discount {
    private static final double DISCOUNT = 10;

    @Override
    public double calculate(double price) {
        System.out.println("儿童票:");
        if (price > 20) {
            return price - DISCOUNT;
        } else {
            return price;
        }
    }
}
