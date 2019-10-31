package threadcoreknowledge.createthreads;

/**
 * description: 用 Thread 方式创建线程
 *
 * @author sxnys
 * @date 2019/10/24
 */
public class ThreadStyle extends Thread {

    public static void main(String[] args) {
        new ThreadStyle().start();
    }

    @Override
    public void run() {
        System.out.println("用 Thread 方式创建线程");
    }
}
