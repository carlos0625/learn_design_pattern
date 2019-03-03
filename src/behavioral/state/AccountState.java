package behavioral.state;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * @see RestrictedState
 * @see NormalState
 * @see OverdraftState
 * Date: 2019/03/03-8:25
 * Description: 账户状态类，充当抽象状态类
 */
public abstract class AccountState {
    /**
     * 维持一个对环境类的引用以检查余额
     */
    protected Account account;
    protected static final int MINUS_BORDER = -2000;
    private String stateName;

    /**
     * 取款
     * @param amount 取款金额
     */
    public abstract void deposit(double amount);

    /**
     * 存款
     * @param amount 存款金额
     */
    public abstract void withdraw(double amount);

    /**
     * 计算利息
     */
    public abstract void computeInterest();

    /**
     * 状态检查
     */
    public abstract void stateCheck();

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
}
