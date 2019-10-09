package Day04_Class;
class Book{
    private String title;
    private static int count;
    public Book(String title){
        this.title = title;
        count++;
        System.out.println(count);
    }
}
public class Demo07Class {
    public static void main(String[] args) {
        new Book("Java从开发到实战");
        new Book("你好Java");
    }
}
