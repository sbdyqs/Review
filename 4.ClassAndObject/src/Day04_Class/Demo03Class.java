package Day04_Class;
class Person2{
    private String name;
    private int age;
    public Person2(){

    }
    public Person2(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void tell(){
        System.out.println("姓名:"+this.name+",年龄"+this.age);
    }
}
public class Demo03Class {
    public static void main(String[] args) {
        Person2 per = new Person2();
        Person2 per1 = new Person2("张三",18);
        per1.tell();
    }
}
