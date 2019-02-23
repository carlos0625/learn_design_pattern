package structure.facade;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Time: 2019/2/17 - 12:19
 * Description: 数据加密类
 */
public class CipherMachine {
    public String encrypt(String plainText) {
        System.out.println("数据加密，将明文转换为密文：");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < plainText.length(); i++) {
            String c = String.valueOf(plainText.charAt(i) % 7);
            sb.append(c);
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
}
