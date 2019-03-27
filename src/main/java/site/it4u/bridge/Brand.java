package site.it4u.bridge;

/**
 * 品牌的维度（使用桥接模式）
 */
public interface Brand {

    void sale();
}

class Lenovo implements Brand {

    @Override
    public void sale() {
        System.out.println("联想电脑");
    }
}

class Dell implements Brand {

    @Override
    public void sale() {
        System.out.println("Dell电脑");
    }
}
