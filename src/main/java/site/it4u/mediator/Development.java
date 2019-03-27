package site.it4u.mediator;

/**
 * 研发部
 */
public class Development implements Department {

    private Mediator m; //持有中介者的引用

    public Development(Mediator m) {
        this.m = m;
        m.register("development", this);
    }

    @Override
    public void selfAction() {
        System.out.println("专心科研，开发项目！");
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作！没钱了，需要资金支持！");

    }
}
