package behavioral.iterator;

import java.util.List;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date: 2019/02/26-10:13
 * Description: 用户聚合对象
 */
public class UserList extends AbstractObjectList {
    public UserList(List<Object> objects) {
        super(objects);
    }

    @Override
    public AbstractIterator createIterator() {
        return new UserIterator();
    }

    /**
     * 内部类实现迭代器，jdk使用这种方式
     */
    private class UserIterator implements AbstractIterator {
        private int cursor1;
        private int cursor2;

        UserIterator() {
            cursor1 = 0;
            cursor2 = objects.size() - 1;
        }

        @Override
        public void next() {
            if (cursor1 < objects.size()) {
                cursor1++;
            }
        }

        @Override
        public boolean isLast() {
            return cursor1 == objects.size();
        }

        @Override
        public void previous() {
            if (cursor2 > -1) {
                cursor2--;
            }
        }

        @Override
        public boolean isFirst() {
            return cursor2 == -1;
        }

        @Override
        public Object getNextItem() {
            return objects.get(cursor1);
        }

        @Override
        public Object getPreviousItem() {
            return objects.get(cursor2);
        }
    }
}
