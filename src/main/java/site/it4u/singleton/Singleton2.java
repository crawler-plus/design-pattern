package site.it4u.singleton;

import java.io.ObjectStreamException;

/**
 * 懒汉式单例
 */
public class Singleton2 {

    private Singleton2() {
    }

    // 反序列化时，如果定义了这个方法，则直接返回此方法对应的对象，而不是再单独创建对象
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }

    // 不初始化这个对象，实现延迟加载，真正用的时候再加载
    private static Singleton2 instance;

    // 方法同步，调用效率低
    public static synchronized Singleton2 getInstance() {
        if(instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
