package structure.facade;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Time: 2019/2/17 - 12:22
 * Description: 文件保存类
 */
public class FileWriter {
    public void write(String encryptString, String fileNameDes) {
        System.out.println("保存密文，写入文件.");
        try (FileOutputStream fos = new FileOutputStream(fileNameDes);) {
            fos.write(encryptString.getBytes());
        } catch (FileNotFoundException e) {
            System.out.println("找不到文件");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IO异常");
            e.printStackTrace();
        }
    }
}
