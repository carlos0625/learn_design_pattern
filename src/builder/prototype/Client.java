package builder.prototype;

import java.io.IOException;

/**
 * Description:
 *
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2019/1/31 10:14
 * @version : 1.0
 */
public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        WeeklyLog log_previous, log_new;
        log_previous = new WeeklyLog();
        Attachment attachment = new Attachment();
        log_previous.setAttachment(attachment);
//        log_new = (WeeklyLog) log_previous.clone();//浅复制
        log_new = log_previous.deepClone();
        System.out.println("比较周报是否相同：" + (log_previous == log_new));
        System.out.println("比较附件是否相同：" + (log_previous.getAttachment() == log_new.getAttachment()));
    }
}
