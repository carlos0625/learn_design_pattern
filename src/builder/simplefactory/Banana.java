package builder.simplefactory;

/**
 * Description:
 *
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2019/1/27 9:53
 * @version : 1.0
 */
public class Banana extends Product {

    public Banana() {
        System.out.println("生产了香蕉");
    }

    @Override
    public void printName() {
        System.out.println("香蕉");
    }
}
