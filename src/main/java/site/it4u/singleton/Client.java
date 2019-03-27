package site.it4u.singleton;

public class Client {

    public static void main(String[] args) {
        Singleton1 s1 = Singleton1.getInstance();
        Singleton1 s2 = Singleton1.getInstance();
        System.out.println(s1 == s2);
        System.out.println(Singleton4.INSTANCE == Singleton4.INSTANCE);
    }

}
