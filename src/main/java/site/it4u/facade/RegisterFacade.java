package site.it4u.facade;

/**
 * 办理注册公司的门面对象
 * 封装子操作到统一的一个操作中，避免客户端同时调用多个操作
 */
public class RegisterFacade {

    public void doIt() {
        Step1 step1 = new Step1();
        step1.run();
        Step2 step2 = new Step2();
        step2.run();
    }
}
