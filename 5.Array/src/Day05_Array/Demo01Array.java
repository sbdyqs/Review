package Day05_Array;

public class Demo01Array {
    public static void main(String[] args) {
        int data[] = new int[3];
        data[0] = 11;
        data[1] = 23;
        data[2] = 56;
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }

        int data1[] = new int[]{11,12,13};
        for (int i : data1) {
            System.out.println(i);
        }
    }
}
