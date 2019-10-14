package Day07_Thread;
class MyThread4 implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
public class Demo05Thread {
    public static void main(String[] args) {
        MyThread4 mt = new MyThread4();
        new Thread(mt,"新线程").start();
        mt.run();
    }
}
