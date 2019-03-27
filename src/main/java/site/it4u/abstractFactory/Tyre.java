package site.it4u.abstractFactory;

/**
 * 轮胎接口
 */
public interface Tyre {

    void revolve();
}

/**
 * 高档轮胎类
 */
class LuxuryTyre implements Tyre {

    @Override
    public void revolve() {
        System.out.println("旋转不磨损");
    }
}

/**
 * 低档轮胎类
 */
class LowTyre implements Tyre {

    @Override
    public void revolve() {
        System.out.println("磨损快");
    }
}
