package structure.proxy;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Time: 2019/2/22 - 11:04
 * Description: 已经实现的商务信息查询模块
 */
public class RealSearcher implements Searcher {
    @Override
    public String doSearch(String username, String password) {
        System.out.println("用户'" + username + "'使用关键词'" + password + "'查询商务信息!");
        return "返回具体内容";
    }
}
