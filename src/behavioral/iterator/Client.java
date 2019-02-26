package behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date: 2019/02/26-10:06
 * Description: 客户端
 */
public class Client {
    public static void main(String[] args) {
        List<Object> products = new ArrayList<>();
        products.add("倚天剑");
        products.add("屠龙刀");
        products.add("断肠草");
        products.add("葵花宝典");
        products.add("四十二章经");

        AbstractObjectList productList = new ProductList(products);
        AbstractIterator productIterator = productList.createIterator();

        System.out.println("正向遍历");
        System.out.println("==============================================");
        while (!productIterator.isLast()) {
            System.out.println(productIterator.getNextItem());
            productIterator.next();
        }
        System.out.println("----------------------------------------------");
        System.out.println();

        System.out.println("逆向遍历");
        System.out.println("==============================================");
        while (!productIterator.isFirst()) {
            System.out.println(productIterator.getPreviousItem());
            productIterator.previous();
        }
        System.out.println("----------------------------------------------");
    }
}
