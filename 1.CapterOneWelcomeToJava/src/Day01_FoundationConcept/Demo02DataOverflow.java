package Day01_FoundationConcept;

public class Demo02DataOverflow {
    public static void main(String[] args) {
        /*数据类型范围不够时会出现内存溢出
        * 解决办法:
        *   扩大数据范围*/
        int max = 2147483647;       //获取int类型最大值;
        int min = -2147483648;      //获取int类型最小值;
        System.out.println("最大值加1:" + (max + 1));   //最大值加1:-2147483648
        System.out.println("最小值减1:" + (min - 1));   //最小值减1:2147483647

    }
}
