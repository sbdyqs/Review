package Day07_Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class MyThread2 implements Callable<String>{

    @Override
    public String call() throws Exception {
        for (int i = 0; i < 10; i++) {
            System.out.println("线程执行:x=" + i);
        }
        return "执行结果";
    }
}
public class Demo03Thread {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<String> task = new FutureTask<>(new MyThread2());
        new Thread(task).start();
        System.out.println(task.get());
    }
}
