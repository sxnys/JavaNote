package threadcoreknowledge.createthreads;

/**
 * description: 同时使用 Runnable 和 Thread 方式创建线程（借助匿名内部类）
 *
 * @author sxnys
 * @date 2019/10/24
 */
public class BothRunnableThread {

    public static void main(String[] args) {
        new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println("我来自 Runnable");
            }
        }) {
            @Override
            public void run() {
                System.out.println("我来自 Thread");
            }
        }.start();
    }
}
