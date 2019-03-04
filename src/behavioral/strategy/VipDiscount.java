package behavioral.strategy;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date: 2019/03/04-10:25
 * Description: VIP折扣策略，充当具体策略类
 */
public class VipDiscount implements Discount {
    private static final double DISCOUNT = 0.5;

    @Override
    public double calculate(double price) {
        System.out.println("VIP票:");
        System.out.println("增加积分");
        return price * DISCOUNT;
    }
}
