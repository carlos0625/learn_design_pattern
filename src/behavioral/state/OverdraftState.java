package behavioral.state;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date: 2019/03/03-8:40
 * Description: 透支状态，账户状态的子类，充当具体状态类
 */
public class OverdraftState extends AccountState {
    public OverdraftState(AccountState state) {
        this.account = state.account;
        setStateName("透支状态");
    }

    @Override
    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        stateCheck();
    }

    @Override
    public void withdraw(double amount) {
        account.setBalance(account.getBalance() - amount);
        stateCheck();
    }

    @Override
    public void computeInterest() {
        System.out.println("计算利息!");
    }

    @Override
    public void stateCheck() {
        if (account.getBalance() > 0) {
            account.setState(new NormalState(this));
        } else if (account. getBalance() == MINUS_BORDER) {
            account.setState(new RestrictedState(this));
        } else if (account.getBalance() < MINUS_BORDER) {
            System.out.println("操作受限!");
        }
    }
}