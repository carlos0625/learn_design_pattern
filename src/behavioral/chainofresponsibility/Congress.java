package behavioral.chainofresponsibility;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Time: 2019/2/23 - 16:29
 * Description: 董事会，具体请求处理类
 */
public class Congress extends Approver {
    public Congress(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        System.out.println("召开董事会审批采购单：" + request.getNumber()
                + "，金额：" + request.getAmount() + "元，采购目的：" + request.getPurpose() + ".");
    }
}
