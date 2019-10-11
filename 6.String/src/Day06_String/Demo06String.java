package Day06_String;

public class Demo06String {
    public static void main(String[] args) {
        if (args.length == 0){
            System.out.println("[ERROR]系统错误,请输入参数...");
            System.exit(1);
        }
        for (String s : args) {
            System.out.println(s);
        }
    }
}
