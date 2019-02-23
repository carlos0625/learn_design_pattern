package builder.builder;

/**
 * Description:
 *
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2019/1/30 9:21
 * @version : 1.0
 */
public class Client {
    public static void main(String[] args) {
        ActorController actorController = new ActorController();
        ActorBuilder actorBuilder = (ActorBuilder) XMLUtil.getBean();
        Actor actor = actorController.construct(actorBuilder);
        System.out.println(actor);
    }
}
