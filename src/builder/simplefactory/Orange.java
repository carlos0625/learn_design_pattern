package builder.simplefactory;

/**
 * Description:
 *
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2019/1/27 9:52
 * @version : 1.0
 */
public class Orange extends Product {

    public Orange() {
        System.out.println("生产了橘子");
    }

    @Override
    public void printName() {
        System.out.println("橘子");
    }
}
