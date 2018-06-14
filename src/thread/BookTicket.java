package thread;

import java.util.concurrent.Callable;

/**
 * Created by DELL on 2018/6/14.
 */
public class BookTicket implements Callable{
    @Override
    public Object call() throws Exception {
        System.out.println("buy ticket");
        Thread.sleep(1000);
        return "success";
    }
}
