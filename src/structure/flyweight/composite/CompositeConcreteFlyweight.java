package structure.flyweight.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Time: 2019/2/18 - 14:05
 * Description: 非共享享元类
 */
public class CompositeConcreteFlyweight extends BaseFlyweight {
    private List<BaseFlyweight> flyweights;

    public CompositeConcreteFlyweight() {
        flyweights = new ArrayList<>();
    }

    public void add(BaseFlyweight flyweight) {
        flyweights.add(flyweight);
    }

    public void delete(BaseFlyweight flyweight) {
        flyweights.remove(flyweight);
    }

    @Override
    public void operation(String extrinsicState) {
        //...
    }
}
