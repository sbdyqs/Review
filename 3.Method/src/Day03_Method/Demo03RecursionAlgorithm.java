package Day03_Method;

public class Demo03RecursionAlgorithm {
    public static void main(String[] args) {
        System.out.println(sum(90));
    }


    /**
     * 定义一个数据累加操作
     * @param num 累加操作上限值
     * @return  累加结果
     */
    public static double sum(int num){
        if (num == 1){
            return factorial(1);
        }
        return factorial(num) + sum(num - 1);
    }

    /**
     * 定义一个数据阶乘操作
     * @param num 阶乘操作上限
     * @return  返回阶乘结果
     */
    public static double factorial(int num){
        if (num == 1){
            return 1;
        }
        return num * factorial(num - 1);
    }
}
