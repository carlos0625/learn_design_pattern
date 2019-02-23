package structure.composite.safe;

/**
 * Description: 安全组合模式的设计
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2019/2/13 10:06
 * @version : 1.0
 */
public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void operation();
}
