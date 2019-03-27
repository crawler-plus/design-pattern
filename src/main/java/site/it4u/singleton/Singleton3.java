package site.it4u.singleton;

/**
 * 静态内部类(线程安全，效率高并且实现了延迟加载)
 */
public class Singleton3 {

    private Singleton3() {
    }

    private static class SingletonClass {
        private static final Singleton3 instance = new Singleton3();
    }

    public static Singleton3 getInstance() {
        return SingletonClass.instance;
    }
}
