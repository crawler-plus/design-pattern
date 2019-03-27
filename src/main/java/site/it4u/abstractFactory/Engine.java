package site.it4u.abstractFactory;

/**
 * 引擎接口
 */
public interface Engine {

    void run();

    void start();
}

/**
 * 高档引擎类
 */
class LuxuryEngine implements Engine {

    @Override
    public void run() {
        System.out.println("转的快");
    }

    @Override
    public void start() {
        System.out.println("启动快，可以自动启停");
    }
}

/**
 * 低档引擎类
 */
class LowEngine implements Engine {

    @Override
    public void run() {
        System.out.println("转的慢");
    }

    @Override
    public void start() {
        System.out.println("启动慢，不可以自动启停");
    }
}