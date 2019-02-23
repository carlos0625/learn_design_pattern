package builder.abstractfactory;

import builder.abstractfactory.factory.SkinFactory;
import builder.abstractfactory.items.Button;
import builder.abstractfactory.items.ComboBox;
import builder.abstractfactory.items.TextField;

/**
 * Description:
 *
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2019/1/29 17:20
 * @version : 1.0
 */
public class Client {
    public static void main(String[] args) {
        SkinFactory skinFactory = (SkinFactory) XMLUtil.getBean();
        Button button = skinFactory.createButton();
        TextField textField = skinFactory.createTextField();
        ComboBox comboBox = skinFactory.createComboBox();
        button.display();
        textField.display();
        comboBox.display();
    }
}
