package behavioral.strategy;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date: 2019/03/04-10:22
 * Description: 电影票，充当上下文环境类
 */
public class MovieTicket {
    private Discount discount;
    private double price;

    public MovieTicket() {
    }

    public MovieTicket(double price) {
        this.price = price;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return discount.calculate(this.price);
    }
}
