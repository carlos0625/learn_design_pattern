package builder.simplefactory;

/**
 * Description: 产品工厂
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2019/2/3 9:30
 * @version : 1.0
 */
public class Factory2 {
    public static Product createApple() {
        return new Apple();
    }

    public static Product createBanana() {
        return new Banana();
    }

    public static Product createOrange() {
        return new Orange();
    }
}
