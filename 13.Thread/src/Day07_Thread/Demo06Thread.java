package Day07_Thread;

public class Demo06Thread {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        System.out.println("第一个任务执行");
        new Thread(() -> {
            double temp = 0;
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                temp += i;
            }
            System.out.println(temp);
        }).start();
        System.out.println("第二个任务执行");
    }
}
