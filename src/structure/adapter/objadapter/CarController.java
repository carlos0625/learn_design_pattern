package structure.adapter.objadapter;

/**
 * Description:
 *
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2019/2/3 10:16
 * @version : 1.0
 */
public interface CarController {
    default void move() {
        System.out.println("汽车移动...");
    }

    void phonate();

    void twinkle();
}
