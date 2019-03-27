package site.it4u.mediator;

public class Client {

    public static void main(String[] args) {
        Mediator m = new President();
        Market market = new Market(m);
        Development development = new Development(m);
        Financial financial = new Financial(m);
        market.selfAction();
        market.outAction();
    }
}
