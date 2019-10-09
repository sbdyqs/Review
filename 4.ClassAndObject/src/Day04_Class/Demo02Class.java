package Day04_Class;
class Person1{
    private String name;
    private int age;
    public void setAge(int age){
        if (age > 0 && age < 200){
            this.age = age;
        }
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public void tell(){
        System.out.println("姓名:"+this.name+",年龄"+this.age);
    }
}
public class Demo02Class {
    public static void main(String[] args) {
        Person1 person1 = new Person1();
        person1.setName("张三");
        person1.setAge(-1);

        person1.tell();
    }

}
