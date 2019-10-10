package Day05_Array;

class ArrayUtil1{
    public static void sort(int[] data){
        for (int x = 0; x < data.length; x++) {
            for (int y = 0; y < data.length - x - 1; y++) {
                if (data[y] > data[y+1]){
                    int temp = data[y];
                    data[y] = data[y+1];
                    data[y+1] = temp;
                }
            }
        }
    }
    public static void printArray(int[] data){
        for (int i : data) {
            System.out.print(i + "\t");
        }
    }
}
public class Demo09Array {
    public static void main(String[] args) {
        int data[] = new int[]{9,8,7,6,5,4,3,2,1};
        ArrayUtil1.sort(data);
        ArrayUtil1.printArray(data);
    }

}
