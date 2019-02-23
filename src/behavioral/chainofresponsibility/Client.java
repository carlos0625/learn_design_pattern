package behavioral.chainofresponsibility;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Time: 2019/2/23 - 16:30
 * Description: 客户端
 */
public class Client {
    public static void main(String[] args) {
        Approver zwj, yg, gj, meeting;
        zwj = new Director("张无忌");
        yg = new VicePresident("杨过");
        gj = new President("郭靖");
        meeting = new Congress("董事会");

        //创建职责链
        zwj.setSuccessor(yg);
        yg.setSuccessor(gj);
        gj.setSuccessor(meeting);

        //创建采购单
        PurchaseRequest request1 = new PurchaseRequest(45000, 10001, "购买倚天剑");
        PurchaseRequest request2 = new PurchaseRequest(60000, 10002, "购买《葵花宝典》");
        PurchaseRequest request3 = new PurchaseRequest(160000, 10003, "购买《金刚经》");
        PurchaseRequest request4 = new PurchaseRequest(800000, 10004, "购买桃花岛");

        //审批
        zwj.processRequest(request1);
        zwj.processRequest(request2);
        zwj.processRequest(request3);
        zwj.processRequest(request4);
    }
}
