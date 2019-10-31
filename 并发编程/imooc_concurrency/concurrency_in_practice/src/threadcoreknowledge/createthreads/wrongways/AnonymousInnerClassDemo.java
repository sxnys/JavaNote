package threadcoreknowledge.createthreads.wrongways;

/**
 * description: 通过匿名内部类创建线程
 *
 * @author sxnys
 * @date 2019/10/24
 */
public class AnonymousInnerClassDemo {

    public static void main(String[] args) {
        // 通过匿名内部类直接重写 Thread 中的 run 方法
        new Thread() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }.start();

        // 通过匿名内部类实现 Runnable 接口中的 run 方法，并将其对象传入 Thread 类
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }).start();
    }
}
