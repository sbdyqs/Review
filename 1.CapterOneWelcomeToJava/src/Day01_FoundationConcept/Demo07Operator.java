package Day01_FoundationConcept;

public class Demo07Operator {
    public static void main(String[] args) {
        int x = 10;
        int y = 100;

        int result = ++x + y--;          //先执行++x得11,然后执行加y得111,然后y--
        System.out.println(result);      //111
        System.out.println(y);           //99
    }
}
