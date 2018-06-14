package thread;

import java.util.concurrent.*;

/**
 * Created by DELL on 2018/6/14.
 */
public class ThreadPoolTest {
    public static void main(String[] args) {
        //【强制】线程池不允许使用 Executors 去创建，而是通过 ThreadPoolExecutor 的方式
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2,10,
                60, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(10));

        Future<Integer> bookResult1 = threadPoolExecutor.submit(new BookTicket());
        Future<Integer> bookResult2 = threadPoolExecutor.submit(new BookTicket());
        Future<Integer> bookResult3 = threadPoolExecutor.submit(new BookTicket());

    }
}
