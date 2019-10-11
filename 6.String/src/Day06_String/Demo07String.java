package Day06_String;

public class Demo07String {
    public static void main(String[] args) {
        String str = "HELLOWORLD";
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] += 32;
        }
        System.out.println(chars);
        String str1 = new String(chars);
        System.out.println(new String(chars,0,5));
    }

}
