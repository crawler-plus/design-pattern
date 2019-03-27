package site.it4u.factorymethod;

public class BydFactory implements CarFactory
{
    @Override
    public Car createCar() {
        return new Byd();
    }
}
