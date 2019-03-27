package site.it4u.builder;

/**
 * 具体装配类
 */
public class It4uAirShipDirector implements AirShipDirector {

    private AirShipBuilder builder;

    public It4uAirShipDirector(AirShipBuilder builder) {
        this.builder = builder;
    }

    @Override
    public AirShip directAirShip() {
        Engine engine = builder.buildEngine();
        EscapeTower escapeTower = builder.buildEscapeTower();
        OrbitalModule orbitalModule = builder.buildOrbitalModule();
        // 装配成飞船对象
        AirShip airShip = new AirShip();
        airShip.setEngine(engine);
        airShip.setEscapeTower(escapeTower);
        airShip.setOrbitalModule(orbitalModule);
        return airShip;
    }
}
