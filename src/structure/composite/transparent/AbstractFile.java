package structure.composite.transparent;

/**
 * Description:
 *
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2019/2/13 9:41
 * @version : 1.0
 */
public abstract class AbstractFile {
    protected String name;

    public AbstractFile(String name) {
        this.name = name;
    }

    public abstract void add(AbstractFile abstractFile);
    public abstract void remove(AbstractFile abstractFile);
    public abstract AbstractFile getChild(int i);
    public abstract void killVirus();
}
