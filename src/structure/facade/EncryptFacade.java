package structure.facade;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Time: 2019/2/17 - 12:26
 * Description:
 */
public class EncryptFacade {
    /**
     * 维持对子系统对象的引用
     */
    private FileReader reader;
    private CipherMachine cipherMachine;
    private FileWriter fileWriter;

    public EncryptFacade() {
        reader = new FileReader();
        cipherMachine = new CipherMachine();
        fileWriter = new FileWriter();
    }

    /**
     * 调用子系统对象的业务方法
     * @param fileNameSrc 明文来源文件
     * @param fileNameDes 密文输出文件
     */
    public void fileEncrypt(String fileNameSrc, String fileNameDes) {
        fileWriter.write(cipherMachine.encrypt(reader.read(fileNameSrc)), fileNameDes);
    }
}
