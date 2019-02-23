package behavioral.chainofresponsibility;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Time: 2019/2/23 - 16:28
 * Description: 董事长，具体的请求处理者类
 */
public class President extends Approver {
    public President(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 500000) {
            System.out.println("董事长" + this.name + "审批采购单：" + request.getNumber()
                    + "，金额：" + request.getAmount() + "元，采购目的：" + request.getPurpose() + ".");
        }
        else {
            this.successor.processRequest(request);
        }
    }
}
