package site.it4u.templateMethod;

public class FootBallGame extends Game {

    @Override
    void endPlay() {
        System.out.println("FootBall Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("FootBall Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("FootBall Game Started. Enjoy the game!");
    }
}
