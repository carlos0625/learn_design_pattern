package behavioral.chainofresponsibility;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Time: 2019/2/23 - 16:21
 * Description: 主任类，具体请求处理者
 */
public class Director extends Approver {
    public Director(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        //采购单金额小于五万可以由主任审批，否则向后传递请求
        if (request.getAmount() < 50000) {
            System.out.println("主任" + this.name + "审批采购单：" + request.getNumber()
                    + "，金额：" + request.getAmount() + "元，采购目的：" + request.getPurpose() + ".");
        }
        else {
            this.successor.processRequest(request);
        }
    }
}
