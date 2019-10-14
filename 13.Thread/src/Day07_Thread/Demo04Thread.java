package Day07_Thread;
class MyThread3 implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
public class Demo04Thread {
    public static void main(String[] args) {
        MyThread3 mt = new MyThread3();
        new Thread(mt,"线程A").start();
        new Thread(mt).start();
        new Thread(mt,"线程B").start();
    }
}
