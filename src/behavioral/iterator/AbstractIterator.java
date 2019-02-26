package behavioral.iterator;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date:    2019/0226-9:51
 * Description: 抽象迭代器
 */
public interface AbstractIterator {
    /**
     * 移至下一个元素
     */
    void next();

    /**
     * 是否为最后一个元素
     * @return
     */
    boolean isLast();

    /**
     * 移至上一个元素
     */
    void previous();

    /**
     * 是否为第一个元素
     * @return
     */
    boolean isFirst();

    /**
     * 获取下一个元素
     * @return
     */
    Object getNextItem();

    /**
     * 获取上一个元素
     * @return
     */
    Object getPreviousItem();
}
