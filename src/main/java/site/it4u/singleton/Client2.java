package site.it4u.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * 测试多线程环境下几种单例模式的效率
 */
public class Client2 {

    public static void main(String[] args) throws Exception {

        long start = System.currentTimeMillis();
        int threadNum = 10;
        CountDownLatch countDownLatch = new CountDownLatch(threadNum);
        for(int i = 0; i < threadNum; i ++) {
            new Thread(() -> {
                for(int j = 0; j < 100000; j ++) {
                    Singleton3.getInstance();
                }
                countDownLatch.countDown();
            }).start();
        }
        countDownLatch.await();
        long end = System.currentTimeMillis();
        System.out.println("总耗时:" + (end - start));
    }
}
