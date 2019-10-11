package Day06_String;

public class Demo02String {
    public static void main(String[] args) {
        String strA = "Java";
        String strB = new String("Java");
        String strC = strB;

        System.out.println(strA == strB);   //false
        System.out.println(strA == strC);   //false
        System.out.println(strB == strC);   //true
        boolean equals = strA.equals(strB);
        System.out.println(equals);     //true

        System.out.println("Java".equals(strB));    //true
    }
}
