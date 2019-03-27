package site.it4u.simplefactory;

/**
 * 测试简单工厂
 */
public class Client {

    public static void main(String[] args) {
        Car c1 = CarFactory01.createCar("奥迪");
        Car c2 = CarFactory01.createCar("比亚迪");
        c1.run();
        c2.run();
    }
}
