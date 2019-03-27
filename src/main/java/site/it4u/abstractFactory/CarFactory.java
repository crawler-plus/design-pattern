package site.it4u.abstractFactory;

/**
 * 汽车工厂接口
 */
public interface CarFactory {

    Engine createEngine();

    Seat createSeat();

    Tyre createTyre();
}


