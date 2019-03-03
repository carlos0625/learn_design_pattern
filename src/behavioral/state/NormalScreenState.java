package behavioral.state;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date: 2019/03/03-9:51
 * Description:
 */
public class NormalScreenState extends ScreenState {
    @Override
    public void display() {
        System.out.println("正常大小!");
    }
}
