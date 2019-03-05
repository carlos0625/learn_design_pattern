package behavioral.templatemethod;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date: 2019/03/05-11:49
 * Description: 客户端
 */
public class Client {
    public static void main(String[] args) {
        Account account = (Account) XmlUtil.getBean();
        assert account != null;
        account.handle("张无忌", "123456");
    }
}
