package site.it4u.command;

// 发起者
public class Invoker {

    private Command command; // 也可以通过容器放很多命令，进行批处理

    public Invoker(Command command) {
        this.command = command;
    }

    // 业务方法，用于调用命令的方法
    public void call() {
        command.execute();
    }
}
