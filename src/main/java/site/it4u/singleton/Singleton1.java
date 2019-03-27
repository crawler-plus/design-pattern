package site.it4u.singleton;

import java.io.ObjectStreamException;

/**
 * 饿汉式单例
 */
public class Singleton1 {

    // 由于加载类时，天然的是线程安全的，没有延时加载的优势
    private static Singleton1 instance = new Singleton1();

    private Singleton1() {
    }

    // 反序列化时，如果定义了这个方法，则直接返回此方法对应的对象，而不是再单独创建对象
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }

    // 方法没有同步，调用效率高
    public static Singleton1 getInstance() {
        return instance;
    }
}
