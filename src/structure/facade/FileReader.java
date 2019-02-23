package structure.facade;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Time: 2019/2/17 - 12:14
 * Description: 文件读取类，返回读取的字符串
 */
public class FileReader {
    public String read(String fileNameSrc) {
        System.out.println("读取文件，获得明文：");
        StringBuilder sb = new StringBuilder();
        try {
            FileInputStream fis = new FileInputStream(fileNameSrc);
            int data;
            while ((data = fis.read()) != -1) {
                sb.append((char) data);
            }
            fis.close();
            System.out.println(sb.toString());
        } catch (FileNotFoundException e) {
            System.out.println("文件没有找到");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("输入输出异常");
            e.printStackTrace();
        }
        return sb.toString();
    }
}
