package Day04_Class;
class Chinese{
    private String name;
    private int age;
    private static String country ="中华人民公共和国";
    public Chinese(String name, int age){
        this.name = name;
        this.age = age;
    }
    public static void setCountry(String c){
        country = c;
    }

    @Override
    public String toString() {
        return "Chinese{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", country=" + country +
                '}';
    }
}
public class Demo06Class {
    public static void main(String[] args) {
        Chinese per1 = new Chinese("张三", 18);
        Chinese per2 = new Chinese("李四", 20);
        Chinese per3 = new Chinese("王五", 6);
        Chinese.setCountry("伟大的国");
        System.out.println(per2);
    }
}
