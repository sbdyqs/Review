package Day05_Array;

public class Demo07Array {
    public static void main(String[] args) {
        int data[] = new int[]{1,2,3};
        int[] a = changeArray(data);
        printArray(a);
    }
    public static void printArray(int[] temp){
        for (int i : temp) {
            System.out.print(i + "\t");
        }
    }
    public static int[] changeArray(int[] temp){
        for (int i = 0; i < temp.length; i++) {
            temp[i] *= 2;
        }
        return temp;
    }
}
