package structure.adapter.objadapter;

/**
 * Description: 对象适配器
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2019/2/3 10:18
 * @version : 1.0
 */
public class Adapter implements CarController {
    //组合对象
    private PoliceSound policeSound;
    private PoliceLamp policeLamp;

    /**
     * 构造方法中初始化
     */
    public Adapter() {
        policeSound = new PoliceSound();
        policeLamp = new PoliceLamp();
    }

    @Override
    public void phonate() {
        policeSound.alarmSound();
    }

    @Override
    public void twinkle() {
        policeLamp.alarmLamp();
    }
}
