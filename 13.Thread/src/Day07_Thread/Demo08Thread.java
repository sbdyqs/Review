package Day07_Thread;
class MyThread8 implements Runnable{
    private int ticket = 3;
    @Override
    public void run() {
        while (true){
            synchronized (this){
                if (this.ticket > 0){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "买票,ticket=" + this.ticket--);
                }else {
                    System.out.println("票已买完");
                    break;
                }
            }
        }
    }
}
public class Demo08Thread {
    public static void main(String[] args) {
        MyThread8 mt = new MyThread8();
        new Thread(mt,"售票员A").start();
        new Thread(mt,"售票员B").start();
        new Thread(mt,"售票员C").start();
    }
}
