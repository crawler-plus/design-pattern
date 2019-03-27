package site.it4u.templateMethod;

public class BasketBallGame extends Game {

    @Override
    void endPlay() {
        System.out.println("BasketBall Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("BasketBall Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("BasketBall Game Started. Enjoy the game!");
    }
}
