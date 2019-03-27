package site.it4u.command;

/**
 * 命令接口
 */
public interface Command {

    /**
     * 这个方法是一个返回结果为空的方法
     * 实际项目中，可以根据需求设计多个不同的方法
     */
    void execute();
}

/**
 * 命令实现类
 */
class ConcreteCommand implements Command {

    private Receiver receiver; // 命令的真正执行者

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        // 命令真正执行前后，执行相关的处理！
        receiver.action();
    }
}
