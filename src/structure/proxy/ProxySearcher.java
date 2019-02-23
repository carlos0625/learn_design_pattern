package structure.proxy;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Time: 2019/2/22 - 11:12
 * Description: 代理查询类，增加用户权限检验和日志记录功能
 */
public class ProxySearcher implements Searcher {
    /**
     * 维持一个对真是主题的引用
     */
    private RealSearcher realSearcher = new RealSearcher();

    private AccessValidator accessValidator;
    private Logger logger;

    public ProxySearcher() {
        accessValidator = new AccessValidator();
        logger = new Logger();
    }

    @Override
    public String doSearch(String username, String password) {
        if (this.validate(username)) {
            String result = realSearcher.doSearch(username, password);
            this.log(username);
            return result;
        }
        else {
            return null;
        }
    }

    private boolean validate(String username) {
        return accessValidator.validate(username);
    }

    private void log(String username) {
        logger.log(username);
    }
}
