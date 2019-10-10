package Day05_Array;

public class Demo06Array {
    public static void main(String[] args) {
        int temp[] = intArray();
        printArray(temp);
    }
    public static void printArray(int[] data){
        for (int i : data) {
            System.out.print(i + "\t");
        }
    }
    public static int[] intArray(){
        int data[] = new int[]{1,2,3,4,5,6,7,8,9};
        return data;
    }
}
