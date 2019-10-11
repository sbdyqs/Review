package Day06_String;

public class Demo05String {
    /**
     * 以下方法执行时将产生很多垃圾内存,降低系统性能
     * @param args
     */
    public static void main(String[] args) {
        String str = "Hello";
        for (int i = 0; i < 10; i++) {
            str += i;
        }
        System.out.println(str);
    }
}
