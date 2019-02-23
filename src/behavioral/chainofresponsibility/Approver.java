package behavioral.chainofresponsibility;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Time: 2019/2/23 - 16:17
 * Description: 抽象审批者类
 */
public abstract class Approver {
    /**
     * 定义后继对象
     */
    protected Approver successor;

    /**
     * 审批者姓名
     */
    protected String name;

    public Approver(String name) {
        this.name = name;
    }

    /**
     * 设置后继者
     * @param successor 后继者子类
     */
    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }

    /**
     * 抽象处理请求方法
     * @param request 请求
     */
    public abstract void processRequest(PurchaseRequest request);
}
