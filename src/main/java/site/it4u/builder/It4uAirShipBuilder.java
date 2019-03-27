package site.it4u.builder;

/**
 * 具体构建类
 */
public class It4uAirShipBuilder implements AirShipBuilder {

    @Override
    public Engine buildEngine() {
        System.out.println("构建it4u牌子的发动机");
        return new Engine("it4u牌子的发动机");
    }

    @Override
    public OrbitalModule buildOrbitalModule() {
        System.out.println("构建it4u牌子的轨道舱");
        return new OrbitalModule("it4u牌子的轨道舱");
    }

    @Override
    public EscapeTower buildEscapeTower() {
        System.out.println("构建it4u牌子的逃逸塔");
        return new EscapeTower("it4u牌子的逃逸塔");
    }
}
