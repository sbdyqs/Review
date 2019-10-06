package Day03_Method;

public class Demo02MethodOverload {

    public static void main(String[] args) {
        System.out.println(sum(1,2,3));
        System.out.println(sum(10,20));
        System.out.println(sum(1.84,3.14));
    }

    /**
     * 定义两个整型加法运算
     * @param a
     * @param b
     * @return
     */
    public static int sum(int a, int b){
        return a + b;
    }

    /**
     * 定义三个整型加法运算
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static int sum(int a, int b, int c){
        return a + b + c;
    }

    /**
     * 定义两个浮点型数据加法,返回整型结果
     * @param a
     * @param b
     * @return
     */
    public static int sum(double a, double b){
        return (int)(a + b);
    }
}
