package Day05_Array;

public class Demo02Array {
    public static void main(String[] args) {
        int data[] = new int[]{1,2,3};
        int temp[] = data;

        temp[0] = 100;
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
}
