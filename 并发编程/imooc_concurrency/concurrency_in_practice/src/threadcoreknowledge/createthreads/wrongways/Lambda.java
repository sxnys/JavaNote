package threadcoreknowledge.createthreads.wrongways;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

/**
 * description: 通过 lambda 表达式创建线程
 *
 * @author sxnys
 * @date 2019/10/24
 */
public class Lambda {
    public static void main(String[] args) {
        // 通过 lambda 表达式重写 run 方法
        new Thread(
                () -> System.out.println(Thread.currentThread().getName())
        ).start();
    }
}
