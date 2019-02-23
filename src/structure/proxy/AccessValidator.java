package structure.proxy;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Time: 2019/2/22 - 11:06
 * Description: 权限检验
 */
public class AccessValidator {
    public boolean validate(String username) {
        System.out.println("在数据库中验证用户'" + username + "'是否为合法用户?");
        String yang = "杨过";
        if (yang.equals(username)) {
            System.out.println("'" + username + "'登录成功!");
            return true;
        }
        else {
            System.out.println("'" + username + "'登录失败!");
            return false;
        }
    }
}
