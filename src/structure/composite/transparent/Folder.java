package structure.composite.transparent;

import java.util.ArrayList;

/**
 * Description:
 *
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2019/2/13 9:49
 * @version : 1.0
 */
public class Folder extends AbstractFile {

    private ArrayList<AbstractFile> files = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    public void add(AbstractFile abstractFile) {
        files.add(abstractFile);
    }

    @Override
    public void remove(AbstractFile abstractFile) {
        files.remove(abstractFile);
    }

    @Override
    public AbstractFile getChild(int i) {
        return files.get(i);
    }

    @Override
    public void killVirus() {
        System.out.println("对文件夹 " + name + " 进行杀毒.");
        System.out.println("---------------------------------------------");
        for (AbstractFile file : files) {
            file.killVirus();
        }
        System.out.println("---------------------------------------------");
    }
}
