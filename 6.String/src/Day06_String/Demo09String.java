package Day06_String;

public class Demo09String {
    public static void main(String[] args) {
        String str = "abc";
        byte[] bytes = str.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] -= 32;
        }
        System.out.println(new String(bytes));
        System.out.println("============");
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        System.out.println(chars);
    }
}
