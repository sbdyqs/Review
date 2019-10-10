package Day05_Array;

import java.util.Arrays;

public class Demo10Array {
    public static void main(String[] args) {
        int data[] = new int[]{100,55,96,45,2,6,84,3,5556};
        int temp[] = new int[3];
        Arrays.sort(data);
        for (int i : data) {
            System.out.print(i + "\t");
        }
        System.arraycopy(data,0,temp,0,3);
        for (int i : temp) {
            System.out.print(i + "\t");
        }
    }
}
