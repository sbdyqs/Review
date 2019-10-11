package Day06_String;

public class Demo08String {
    public static void main(String[] args) {
        String str = "123";
        System.out.println(isNumber(str));
    }
    public static boolean isNumber(String str){
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '9' && chars[i] > '0')
                return true;
        }
        return false;
    }
}
