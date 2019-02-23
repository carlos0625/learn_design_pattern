package structure.proxy;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Time: 2019/2/22 - 11:03
 * Description:
 */
public interface Searcher {
    /**
     * 商务信息查询模块
     * @param username 用户名
     * @param password 密码
     * @return 查询结果
     */
    String doSearch(String username, String password);
}
