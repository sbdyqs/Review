package Day07_Thread;
class MyThread9 implements Runnable{
    private int ticket = 3;
    @Override
    public void run() {
        while (this.sale()){
            ;
        }
    }
    public synchronized boolean sale(){
        if (this.ticket > 0){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "买票,ticket=" + this.ticket--);
            return true;
        }else {
            System.out.println("票已买完");
        }
        return false;
    }
}
public class Demo09Thread {
    public static void main(String[] args) {
        MyThread9 mt = new MyThread9();
        new Thread(mt,"售票员A").start();
        new Thread(mt,"售票员B").start();
        new Thread(mt,"售票员C").start();

    }
}
