package threadcoreknowledge.createthreads.wrongways;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

/**
 * description: 通过线程池创建线程，其本质还是实现 Runnable 接口
 *
 * @author sxnys
 * @date 2019/10/24
 */
public class ThreadPools {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 1000; i++) {
            executorService.submit(new Task());
        }
    }
}

class Task implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
    }
}
