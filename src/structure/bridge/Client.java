package structure.bridge;

/**
 * Description:
 *
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2019/2/11 11:29
 * @version : 1.0
 */
public class Client {
    public static void main(String[] args) {
        Image image = (Image) XMLUtil.getBean("image");
        ImageImp imageImp = (ImageImp) XMLUtil.getBean("os");
        image.setImageImp(imageImp);
        image.parseFile("cleo");
    }
}
