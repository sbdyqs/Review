package Day06_String;

public class Demo04String {
    public static void main(String[] args) {
        String strA = new String("Java").intern();  //用intern()方法手动入池
        String strB = "Java";
        System.out.println(strA == strB);   //true

        System.out.println("================");

        String a = "baidu";
        String b = "www.baidu.com";
        String c = "www." + a + ".com";
        System.out.println(b == c);     //false
    }
}
