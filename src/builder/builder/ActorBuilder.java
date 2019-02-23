package builder.builder;

/**
 * Description:
 *
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2019/1/30 9:05
 * @version : 1.0
 */
public abstract class ActorBuilder {
    protected Actor actor = new Actor();

    public abstract void buildType();
    public abstract void buildSex();
    public abstract void buildFace();
    public abstract void buildCostume();
    public abstract void buildHairstyle();

    //钩子方法
    public boolean isBaredHeaded() {
        return false;//默认不是光头
    }

    public Actor createActor() {
        return actor;
    }
}
