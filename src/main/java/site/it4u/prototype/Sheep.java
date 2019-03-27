package site.it4u.prototype;

import java.io.Serializable;
import java.util.Date;

public class Sheep implements Cloneable, Serializable {

    private String sname;

    private Date birthday;

    public Sheep() {
    }

    public Sheep(String sname, Date birthday) {
        this.sname = sname;
        this.birthday = birthday;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone(); // 直接调用object对象的clone方法（浅克隆）
        // 添加如下代码实现深克隆
        Sheep s = (Sheep) obj;
        s.birthday = (Date) this.birthday.clone(); // 把属性也进行克隆
        return obj;
    }
}
