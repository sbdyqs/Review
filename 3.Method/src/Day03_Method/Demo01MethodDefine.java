package Day03_Method;

public class Demo01MethodDefine {

    public static void main(String[] args) {
        printInfo();
        System.out.println(payAndGet(20));
        sale(3);
    }

    /**
     * 定义一个打印信息的方法,该方法不需要接收任何参数并且不返回任何处理结果
     */

    public static void printInfo(){
        System.out.println("---------------");
        System.out.println("HelloWorld!");
        System.out.println("---------------");

    }

    /**
     * 定义一个支付并获取内容的方法,该方法可以由主方法直接调用
     * @param money 需要支付的金额
     * @return 根据支付信息返回相应的信息
     */
    public static String payAndGet(double money){
        if (money >= 10.0){
            return "购买一份快猜,找零:" + (money - 10);
        }
        else {
            return "对不起,您的余额不足,请充值或捡漏";
        }
    }

    /**
     * 定义销售方法,可以根据数量输出销售信息
     * @param count 要销售的数量
     */
    public static void sale(int count){
        if (count <= 0){
            return;
        }
        System.out.println("销售出"+count+"本书");
    }
}
