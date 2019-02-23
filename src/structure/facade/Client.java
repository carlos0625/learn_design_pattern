package structure.facade;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Time: 2019/2/17 - 12:29
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        EncryptFacade encryptFacade = new EncryptFacade();
        encryptFacade.fileEncrypt("src/structure/facade/transport.txt",
                "src/structure/facade/secret.txt");
    }
}
