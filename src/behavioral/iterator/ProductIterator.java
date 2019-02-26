package behavioral.iterator;

import java.util.List;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date:    2019/0226-9:57
 * Description: 商品数据类的迭代器
 */
public class ProductIterator implements AbstractIterator {
    private List<Object> products;
    private int cursor1;
    private int cursor2;

    public ProductIterator(ProductList list) {
        this.products = list.getObjects();
        cursor1 = 0;
        cursor2 = products.size() - 1;
    }

    @Override
    public void next() {
        if (cursor1 < products.size()) {
            cursor1++;
        }
        else {
            throw new IndexOutOfBoundsException("迭代器下标超越界限");
        }
    }

    @Override
    public boolean isLast() {
        return cursor1 == products.size();
    }

    @Override
    public void previous() {
        if (cursor2 > -1) {
            cursor2--;
        }
        else {
            throw new IndexOutOfBoundsException("迭代器下标越界");
        }
    }

    @Override
    public boolean isFirst() {
        return cursor2 == -1;
    }

    @Override
    public Object getNextItem() {
        return products.get(cursor1);
    }

    @Override
    public Object getPreviousItem() {
        return products.get(cursor2);
    }
}
