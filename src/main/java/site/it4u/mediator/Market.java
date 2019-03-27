package site.it4u.mediator;

/**
 * 市场部
 */
public class Market implements Department {

    private Mediator m; //持有中介者的引用

    public Market(Mediator m) {
        this.m = m;
        m.register("market", this);
    }

    @Override
    public void selfAction() {
        System.out.println("承接项目");
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作！项目承接的进度，需要资金支持");
        m.command("financial");
    }
}
