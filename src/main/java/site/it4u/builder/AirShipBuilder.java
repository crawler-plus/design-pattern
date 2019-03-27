package site.it4u.builder;

/**
 * 构建接口
 */
public interface AirShipBuilder {

    Engine buildEngine();

    OrbitalModule buildOrbitalModule();

    EscapeTower buildEscapeTower();
}
