package behavioral.templatemethod;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date: 2019/03/05-11:45
 * Description: 定期账户类
 */
public class SavingAccount extends Account {
    /**
     * 覆盖父类的计算利息方法
     */
    @Override
    public void calculateInterest() {
        System.out.println("按定期账户计算利息!");
    }
}
