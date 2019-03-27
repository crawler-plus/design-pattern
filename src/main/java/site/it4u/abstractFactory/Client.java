package site.it4u.abstractFactory;

public class Client {

    public static void main(String[] args) {
        CarFactory factory = new LuxuryCarFactory();
        Engine engine = factory.createEngine();
        Seat seat = factory.createSeat();
        Tyre tyre = factory.createTyre();
        engine.run();
        engine.start();
        seat.message();
        tyre.revolve();
    }
}
