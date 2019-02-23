package behavioral.chainofresponsibility;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Time: 2019/2/23 - 16:15
 * Description: 采购单，充当请求类
 */
@Setter
@Getter
public class PurchaseRequest {
    /**
     * 采购金额
     */
    private double amount;

    /**
     * 采购单编号
     */
    private int number;

    /**
     * 采购目的
     */
    private String purpose;

    public PurchaseRequest(double amount, int number, String purpose) {
        this.amount = amount;
        this.number = number;
        this.purpose = purpose;
    }
}
