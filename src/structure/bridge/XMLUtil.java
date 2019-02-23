package structure.bridge;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * Description:
 *
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2019/2/11 11:24
 * @version : 1.0
 */
public class XMLUtil {
    public static Object getBean(String args) {
        try {
            //创建文档对象
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new File("src/structure/bridge/config.xml"));

            NodeList nodeList = document.getElementsByTagName("className");
            Node node = null;
            if ("image".equals(args)) {
                node = nodeList.item(0).getFirstChild();
            }
            if ("os".equals(args)) {
                node = nodeList.item(1).getFirstChild();
            }
            String className = node.getNodeValue();
            Class cls = Class.forName(className);
            return cls.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
