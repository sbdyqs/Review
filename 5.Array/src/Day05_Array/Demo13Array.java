package Day05_Array;
class Person1{
    private String name;
    private int age;
    private Car car;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void setCar(Car car){
        this.car = car;
    }
    public Car getCar(){
        return this.car;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
class Car{
    private String name;
    private double price;
    private Person1 person;

    public void setPerson(Person1 person){
        this.person = person;
    }
    public Person1 getPerson(){
        return this.person;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
public class Demo13Array {
    public static void main(String[] args) {
        Person1 p1 = new Person1("张无忌", 19);
        Car car = new Car("奔驰", 1000);
        p1.setCar(car);
        car.setPerson(p1);
        System.out.println(p1.getCar());
        System.out.println(car.getPerson());
    }
}
