package builder.simplefactory;

/**
 * Description:
 *
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2019/1/27 9:59
 * @version : 1.0
 */
public class TestSimpleFactory {
    public static void main(String[] args) {
//        //使用简单工厂创建对象
//        Product product = Factory.createProduct("apple");
//        product.printName();

        //从xml文件读取参数
        final String className = XMLUtil.getClassName();
        Product product = Factory.createProduct(className);
        product.printName();
    }
}
