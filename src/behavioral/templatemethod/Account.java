package behavioral.templatemethod;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date: 2019/03/05-11:38
 * Description: 账户类，充当抽象类
 */
public abstract class Account {
    public boolean validate(String account, String password) {
        System.out.println("账号: " + account);
        System.out.println("密码: " + password);
        return ("张无忌".equalsIgnoreCase(account) && "123456".equalsIgnoreCase(password));
    }

    /**
     * 计算利息
     */
    public abstract void calculateInterest();

    /**
     * 钩子方法
     */
    public void display() {
        System.out.println("显示利息");
    }

    /**
     * 模板方法，定义了基本方法的执行顺序
     * @param account 账户用户名
     * @param password 账户密码
     */
    public void handle(String account, String password) {
        /*
         * 钩子方法
         */
        if (!validate(account, password)) {
            System.out.println("用户或密码错误!");
            return;
        }
        calculateInterest();
        display();
    }
}
