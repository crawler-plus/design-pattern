package site.it4u.abstractFactory;

/**
 * 座椅接口
 */
public interface Seat {

    void message();
}

/**
 * 高档座椅类
 */
class LuxurySeat implements Seat {

    @Override
    public void message() {
        System.out.println("可以自动按摩");
    }
}

/**
 * 低档座椅类
 */
class LowSeat implements Seat {

    @Override
    public void message() {
        System.out.println("不可以自动按摩");
    }
}