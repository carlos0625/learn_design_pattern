package structure.composite.safe;

import java.util.ArrayList;

/**
 * Description:
 *
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2019/2/13 10:08
 * @version : 1.0
 */
public class Composite extends Component {

    private ArrayList<Component> list = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void operation() {
        for (Component component : list) {
            component.operation();
        }
    }

    public void add(Component o) {
        list.add(o);
    }

    public void remove(Component o) {
        list.remove(o);
    }

    public Component getChild(int i) {
        return list.get(i);
    }
}
