package behavioral.state;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date: 2019/03/03-8:59
 * Description: 客户端
 */
public class Client {
    public static void main(String[] args) {
        Account account = new Account("段誉", 0.0);
        account.deposit(1000.0);
        account.withdraw(2000.0);
        account.deposit(3000.0);
        account.withdraw(4000.0);
        account.withdraw(1000.0);
        account.computeInterest();
    }
}
