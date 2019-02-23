package builder.simplefactory;

/**
 * Description:
 *
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2019/1/27 9:52
 * @version : 1.0
 */
public class Apple extends Product {

    public Apple() {
        System.out.println("生产了苹果");
    }

    @Override
    public void printName() {
        System.out.println("苹果");
    }
}
