package site.it4u.decorator;

public class Client {

    public static void main(String[] args) {
        ICar car = new Car();
        car.move();
        System.out.println("----增加飞行功能-----");
        ICar flyCar = new FlyCar(car);
        flyCar.move();
        System.out.println("----增加水上飞行功能-----");
        ICar waterCar = new WaterCar(flyCar);
        waterCar.move();
        System.out.println("----增加人工智能飞行功能-----");
        ICar aiCar = new AICar(waterCar);
        aiCar.move();
    }
}
