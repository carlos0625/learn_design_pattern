package structure.flyweight.composite;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Time: 2019/2/18 - 14:03
 * Description: 可共享的享元类
 */
public class ConcreteFlyweight extends BaseFlyweight {
    /**
     * 内部状态
     * @return intrinsicState
     */
    private String intrinsicState() {
        return "intrinsicState";
    }

    @Override
    public void operation(String extrinsicState) {
        System.out.println("操作外部状态：" + extrinsicState);
    }
}
