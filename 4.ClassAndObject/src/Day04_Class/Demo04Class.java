package Day04_Class;

class Message{
    private String info;
    public Message(String info){
        this.info = info;
    }
    public String getInfo(){
        return this.info;
    }
    public void setInfo(String info){
        this.info = info;
    }
}

class Person3{
    private String name;
    private int age;
    public Person3(){

    }
    public Person3(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Person3(Message msg, int age){
        this.name = msg.getInfo();
        this.age = age;
    }
    public Message getMessage(){
        return new Message("姓名: "+this.name+",年龄:"+this.age);
    }
    public void tell(){
        System.out.println("姓名: "+this.name+",年龄:"+this.age);
    }
}

public class Demo04Class {
    public static void main(String[] args) {
        Person3 person3 = new Person3(new Message("Java"),21);
        person3.tell();
        Message msg = person3.getMessage();
        System.out.println(msg.getInfo());
    }
}
