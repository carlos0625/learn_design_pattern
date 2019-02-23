package structure.adapter.objadapter;

/**
 * Description:
 *
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2019/2/3 10:15
 * @version : 1.0
 */
public class Client {
    public static void main(String[] args) {
        CarController carController = (CarController) XMLUtil.getBean();
        assert carController != null;
        carController.move();
        carController.phonate();
        carController.twinkle();
    }
}
