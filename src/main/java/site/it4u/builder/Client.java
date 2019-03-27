package site.it4u.builder;

public class Client {

    public static void main(String[] args) {
        AirShipDirector airShipDirector = new It4uAirShipDirector(new It4uAirShipBuilder());
        AirShip airShip = airShipDirector.directAirShip();
        System.out.println(airShip.getEngine().getName());
        System.out.println(airShip.getEscapeTower().getName());
        System.out.println(airShip.getOrbitalModule().getName());
    }
}
