package Day04_Class;

class Person{
    String name;
    int age;
    public void tell(){
        System.out.println("姓名:"+name+",年龄:"+age);
    }
}
public class Demo01Class {
    public static void main(String[] args) {
        Person person = null;
        person = new Person();
        person.name = "张三";
        person.age = 18;
        Person person1 = person;
        person1.age = 80;
        person.tell(); //姓名:张三,年龄:80
    }
}
