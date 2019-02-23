package structure.bridge;

/**
 * Description:
 *
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2019/2/11 11:17
 * @version : 1.0
 */
public class LinuxImageImp implements ImageImp {
    @Override
    public void doPoint(Matrix matrix) {
        System.out.println("在Linux系统上显示图像: ");
    }
}
