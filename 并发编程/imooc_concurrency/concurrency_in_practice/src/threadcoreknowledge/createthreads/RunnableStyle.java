package threadcoreknowledge.createthreads;

/**
 * description: 用 Runnable 方式创建线程
 *
 * @author sxnys
 * @date 2019/10/24
 */
public class RunnableStyle implements Runnable {

    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableStyle());
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("用 Runnable 方式创建线程");
    }
}
