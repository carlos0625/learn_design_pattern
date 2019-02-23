package structure.proxy;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Time: 2019/2/22 - 11:10
 * Description: 日志记录
 */
public class Logger {
    /**
     * 模拟实现日志记录
     * @param username 用户名
     */
    public void log(String username) {
        System.out.println("更新数据库，用户'" + username + "'查询次数加1!");
    }
}
