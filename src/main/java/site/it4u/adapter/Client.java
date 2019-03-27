package site.it4u.adapter;

/**
 * 客户端类
 */
public class Client {

    public static void main(String[] args) {
        Target t = new Adapter(new Adaptee());
        t.handleReq();
    }
}
