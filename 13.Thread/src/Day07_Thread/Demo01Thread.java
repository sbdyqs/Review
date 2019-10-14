package Day07_Thread;

class MyThread extends Thread{
    private String title;
    public MyThread(String title){
        this.title = title;
    }
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(this.title + i);
        }
    }
}
public class Demo01Thread extends Thread{
    public static void main(String[] args) {
        new MyThread("线程1-").start();
        new MyThread("线程2-").start();
        new MyThread("线程3-").start();
    }


}
