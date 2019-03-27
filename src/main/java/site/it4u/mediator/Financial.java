package site.it4u.mediator;

/**
 * 财务部
 */
public class Financial implements Department {

    private Mediator m; //持有中介者的引用

    public Financial(Mediator m) {
        this.m = m;
        m.register("financial", this);
    }

    @Override
    public void selfAction() {
        System.out.println("数钱");
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作！钱太多了，怎么花？");

    }
}
