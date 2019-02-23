package builder.abstractfactory.factory;

import builder.abstractfactory.items.Button;
import builder.abstractfactory.items.ComboBox;
import builder.abstractfactory.items.TextField;

/**
 * Description:
 *
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2019/1/29 17:12
 * @version : 1.0
 */
public interface SkinFactory {
    Button createButton();
    TextField createTextField();
    ComboBox createComboBox();
}
