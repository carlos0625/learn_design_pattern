package structure.bridge;

/**
 * Description:
 *
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2019/2/11 11:16
 * @version : 1.0
 */
public class WindowsImageImp implements ImageImp {
    @Override
    public void doPoint(Matrix matrix) {
        System.out.println("在Windows操作系统中显示图像: ");
    }
}
