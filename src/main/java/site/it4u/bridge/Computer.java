package site.it4u.bridge;

/**
 * 未使用桥接模式
 */
public interface Computer {

    void sale();
}

class Desktop implements Computer {

    @Override
    public void sale() {
        System.out.println("销售台式机");
    }
}

class Laptop implements Computer {

    @Override
    public void sale() {
        System.out.println("销售笔记本");
    }
}

class Pad implements Computer {

    @Override
    public void sale() {
        System.out.println("销售平板电脑");
    }
}

class LenovoDesktop extends Desktop {

    @Override
    public void sale() {
        System.out.println("销售联想台式机");
    }
}

class LenovoLaptop extends Laptop {

    @Override
    public void sale() {
        System.out.println("销售联想笔记本");
    }
}

class LenovoPad extends Pad {

    @Override
    public void sale() {
        System.out.println("销售联想Pad");
    }
}

class ShenzhouDesktop extends Desktop {

    @Override
    public void sale() {
        System.out.println("销售神舟台式机");
    }
}

class ShenzhouLaptop extends Laptop {

    @Override
    public void sale() {
        System.out.println("销售神舟笔记本");
    }
}

class ShenzhouPad extends Pad {

    @Override
    public void sale() {
        System.out.println("销售神舟Pad");
    }
}