package builder.prototype;

import java.io.Serializable;

/**
 * Description: 附件类
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2019/1/31 10:10
 * @version : 1.0
 */
public class Attachment implements Serializable {
    /**
     * 姓名
     */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void download() {
        System.out.println("下载附件，文件名为：" + name);
    }
}
