package site.it4u.templateMethod;

public class Client {

    public static void main(String[] args) {
        Game game = new BasketBallGame();
        game.play();
        System.out.println();
        game = new FootBallGame();
        game.play();
    }
}
