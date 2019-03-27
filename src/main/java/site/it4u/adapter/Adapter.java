package site.it4u.adapter;

/**
 * 对象适配器(使用了组合的方式跟被适配对象整合）
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void handleReq() {
        adaptee.request();
    }
}
