package Day07_Extend;
class Person{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person() {
    }
}
class Student extends Person{

}
public class Demo01Extend {
    public static void main(String[] args) {
        Student st = new Student();
        st.setName("张三");
        st.setAge(18);
        System.out.println("姓名:" + st.getName() + "\n" + "年龄:" + st.getAge());
    }

}
