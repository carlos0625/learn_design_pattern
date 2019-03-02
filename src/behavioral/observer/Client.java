package behavioral.observer;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date: 2019/03/02-19:53
 * Description: 客户端
 */
public class Client {
    public static void main(String[] args) {
        AllyControlCenter allyControlCenter = new ConcreteAllyControlCenter("飞鹰");
        Observer player1 = new Player("玩家1");
        Observer player2 = new Player("玩家2");
        Observer player3 = new Player("玩家3");
        Observer player4 = new Player("玩家4");
        allyControlCenter.join(player1);
        allyControlCenter.join(player2);
        allyControlCenter.join(player3);
        allyControlCenter.join(player4);

        player2.beAttacked(allyControlCenter);
    }
}
