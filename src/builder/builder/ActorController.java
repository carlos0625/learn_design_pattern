package builder.builder;

/**
 * Description:
 *
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2019/1/30 9:15
 * @version : 1.0
 */
public class ActorController {
    public Actor construct(ActorBuilder actorBuilder) {
        actorBuilder.buildType();
        actorBuilder.buildSex();
        actorBuilder.buildCostume();
        actorBuilder.buildFace();
        if (!actorBuilder.isBaredHeaded()) {
            actorBuilder.buildHairstyle();
        }
        return actorBuilder.createActor();
    }
}
