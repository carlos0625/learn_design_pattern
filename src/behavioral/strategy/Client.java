package behavioral.strategy;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date: 2019/03/04-10:32
 * Description: 客户端
 */
public class Client {
    public static void main(String[] args) {
        MovieTicket movieTicket = new MovieTicket();
        double originalPrice = 60.0;
        double currentPrice;

        movieTicket.setPrice(originalPrice);
        System.out.println("原始价格: " + originalPrice);
        System.out.println("-----------------------------------");

        Discount discount = (Discount) XmlUtil.getBean();
        movieTicket.setDiscount(discount);

        currentPrice = movieTicket.getPrice();

        System.out.println("折扣价格: " + currentPrice);
    }
}
