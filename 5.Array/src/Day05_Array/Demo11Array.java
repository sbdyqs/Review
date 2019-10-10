package Day05_Array;
class ArrayUtil2{
    public static int sum(int...data){
        int sum = 0;
        for (int i : data) {
            sum += i;
        }
        return sum;
    }
}
public class Demo11Array {
    public static void main(String[] args) {
        int data[] = new int[]{1,2,3,4,5};
        System.out.println(ArrayUtil2.sum(data));
        System.out.println(ArrayUtil2.sum(new int[]{10,9,8}));
    }
}
