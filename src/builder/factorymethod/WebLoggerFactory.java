package builder.factorymethod;

/**
 * Description:
 *
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2019/1/29 16:35
 * @version : 1.0
 */
public class WebLoggerFactory extends LoggerFactory {
    @Override
    public Logger createLogger() {
        return new WebLogger();
    }
}
