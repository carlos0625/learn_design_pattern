package builder.simplefactory;

/**
 * Description:
 *
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2019/1/27 9:53
 * @version : 1.0
 */
public class Factory {
    public static Product createProduct(String args) {
        if ("apple".equals(args))
            return new Apple();
        if ("banana".equals(args))
            return new Banana();
        if ("orange".equals(args))
            return new Orange();
        return null;
    }
}
