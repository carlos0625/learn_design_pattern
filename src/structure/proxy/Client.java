package structure.proxy;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Time: 2019/2/22 - 11:24
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        ProxySearcher proxy = (ProxySearcher) XmlUtil.getBean();
        proxy.doSearch("杨过", "123456");
    }
}
