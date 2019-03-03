package behavioral.state;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date: 2019/03/03-8:41
 * Description: 受限状态，账户状态类的子类，充当具体状态类
 */
public class RestrictedState extends AccountState {
    public RestrictedState(AccountState state) {
        this.account = state.account;
        setStateName("受限状态");
    }

    @Override
    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        stateCheck();
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("账号受限，取款失败!");
    }

    @Override
    public void computeInterest() {
        System.out.println("计算利息!");
    }

    @Override
    public void stateCheck() {
        if (account.getBalance() > 0) {
            account.setState(new NormalState(this));
        } else if (account.getBalance() > MINUS_BORDER) {
            account.setState(new OverdraftState(this));
        }
    }
}
