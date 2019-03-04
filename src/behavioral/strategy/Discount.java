package behavioral.strategy;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date: 2019/03/04-10:23
 * Description: 折扣类，充当抽象策略类
 */
public interface Discount {
    /**
     * 计算折扣票价
     * @param price 原价
     * @return 折扣价
     */
    double calculate(double price);
}
