package behavioral.templatemethod;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date: 2019/03/05-11:44
 * Description: 活期账户类，充当具体子类
 */
public class CurrentAccount extends Account {
    /**
     * 覆盖父类的计算利息方法
     */
    @Override
    public void calculateInterest() {
        System.out.println("按活期利率计算利息!");
    }
}
