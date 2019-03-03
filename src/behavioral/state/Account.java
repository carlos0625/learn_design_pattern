package behavioral.state;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date: 2019/03/03-8:24
 * Description: 银行账户类，充当环境类
 */
public class Account {
    private AccountState state;
    private String owner;
    private double balance;

    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
        state = new NormalState(this);
        System.out.println(this.owner + "开户，初始金额为" + balance);
        System.out.println("----------------------------------------------");
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public AccountState getState() {
        return state;
    }

    public void setState(AccountState state) {
        this.state = state;
    }

    public void deposit(double amount) {
        System.out.println(this.owner + "存款" + amount);
        state.deposit(amount);
        System.out.println("现在的余额为" + this.balance);
        System.out.println("现在账户的状态为" + this.state.getStateName());
        System.out.println("-----------------------------------------------");
    }

    public void withdraw(double amount) {
        System.out.println(this.owner + "取款" + amount);
        state.withdraw(amount);
        System.out.println("现在的余额为" + this.balance);
        System.out.println("现在账户的状态为" + this.state.getStateName());
        System.out.println("------------------------------------------------");
    }

    public void computeInterest() {
        state.computeInterest();
    }
}
