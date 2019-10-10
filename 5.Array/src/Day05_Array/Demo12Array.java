package Day05_Array;

class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class Demo12Array {
    public static void main(String[] args) {
        Person data[] = new Person[3];
        Person per1 = new Person("张三",18);
        Person per2 = new Person("李四",20);
        Person per3 = new Person("王五",8);
        data[0] = per1;
        data[1] = per2;
        data[2] = per3;
        for (Person i : data) {
            System.out.println(i);
        }
    }

}
