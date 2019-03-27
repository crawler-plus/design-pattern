package site.it4u.bridge;

public class Client {

    public static void main(String[] args) {
        // 销售联想的笔记本电脑
        Computer2 c = new Laptop2(new Lenovo());
        c.sale();
    }
}
