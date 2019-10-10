package Day05_Array;

public class Demo05Array {
    public static void main(String[] args) {
        int data[] = new int[]{1,1,2,3,3,6,4,85,8};
        printArray(data);
    }
    public static void printArray(int[] data){
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }
    }
}
