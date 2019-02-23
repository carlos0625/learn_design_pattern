package builder.factorymethod;

/**
 * Description:
 *
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2019/1/29 8:37
 * @version : 1.0
 */
public class Client {
    public static void main(String[] args) {
        LoggerFactory factory;
        Logger logger;
        //反射机制获取具体工厂类
        factory = (LoggerFactory) XMLUtil.getBean();
        logger = factory.createLogger();
        logger.writeLog();
    }
}
