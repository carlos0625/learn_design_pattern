package behavioral.iterator;

import java.util.List;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date:    2019/0226-9:49
 * Description: 抽象聚合类
 */
public abstract class AbstractObjectList {
    protected List<Object> objects;

    public AbstractObjectList(List<Object> objects) {
        this.objects = objects;
    }

    public void addObject(Object o) {
        objects.add(o);
    }

    public void removeObject(Object o) {
        objects.remove(o);
    }

    public List<Object> getObjects() {
        return this.objects;
    }

    /**
     * 获取聚合对象的迭代器
     * @return 迭代器
     */
    public abstract AbstractIterator createIterator();
}
