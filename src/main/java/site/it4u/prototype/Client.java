package site.it4u.prototype;

import java.util.Date;

/**
 * 原型模式（深复制）
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Date d = new Date(12312321331L);
        Sheep sheep1 = new Sheep("少利", d);
        Sheep sheep2 = (Sheep) sheep1.clone();
        d.setTime(1212313142342343L);
        // 下面两行输出不相等，实现深克隆效果
        System.out.println(sheep1.getBirthday());
        System.out.println(sheep2.getBirthday());
    }
}
