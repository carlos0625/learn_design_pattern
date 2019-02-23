package behavioral.chainofresponsibility;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Time: 2019/2/23 - 16:25
 * Description: 副董事长，具体请求处理者
 */
public class VicePresident extends Approver {
    public VicePresident(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        //副董事长可以审批50000-100000
        if (request.getAmount() < 100000) {
            System.out.println("副董事长" + this.name + "审批采购单：" + request.getNumber()
                    + "，金额：" + request.getAmount() + "元，采购目的：" + request.getPurpose() + ".");
        }
        else {
            this.successor.processRequest(request);
        }
    }
}
