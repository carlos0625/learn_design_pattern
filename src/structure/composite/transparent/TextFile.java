package structure.composite.transparent;

/**
 * Description:
 *
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2019/2/13 9:44
 * @version : 1.0
 */
public class TextFile extends AbstractFile {

    public TextFile(String name) {
        super(name);
    }

    @Override
    public void add(AbstractFile abstractFile) {
        throw new  UnsupportedOperationException("这是叶子结点，不含有子结点，不支持该方法");
    }

    @Override
    public void remove(AbstractFile abstractFile) {
        throw new  UnsupportedOperationException("这是叶子结点，不含有子结点，不支持该方法");
    }

    @Override
    public AbstractFile getChild(int i) {
        throw new  UnsupportedOperationException("这是叶子结点，不含有子结点，不支持该方法");
    }

    @Override
    public void killVirus() {
        System.out.println("给文件 " + name + ".txt 杀毒.");
    }
}
