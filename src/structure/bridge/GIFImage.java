package structure.bridge;

/**
 * Description:
 *
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2019/2/11 11:22
 * @version : 1.0
 */
public class GIFImage extends Image {
    @Override
    public void parseFile(String fileName) {
        //模拟解析JPG格式图像为像素
        Matrix matrix = new Matrix();
        imageImp.doPoint(matrix);
        System.out.println(fileName + ", 格式为GIF.");
    }
}
