package Day07_Thread;
class MyThread1 implements Runnable{
    private String title;
    public MyThread1(String title){
        this.title = title;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.title + i);
        }
    }
}
public class Demo02Thread {
    public static void main(String[] args) {
        Thread threadA = new Thread(new MyThread1("线程A"));
        Thread threadB = new Thread(new MyThread1("线程B"));
        Thread threadC = new Thread(new MyThread1("线程C"));
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
