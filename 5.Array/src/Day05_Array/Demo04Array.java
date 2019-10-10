package Day05_Array;

public class Demo04Array {
    public static void main(String[] args) {
        int data[][] = new int[][]{{1,2,3},{4,5,6}};
        for (int[] datum : data) {
            for (int i : datum) {
                System.out.print(i + "/");
            }
            System.out.println();;
        }

        int temp[][] = new int[1][2];
        temp[0][0] = 1;
        temp[0][1] = 2;
        for (int[] ints : temp) {
            for (int anInt : ints) {
                System.out.print(anInt + "/");
            }
            System.out.println();
        }
    }
}
