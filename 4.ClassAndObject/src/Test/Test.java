package Test;

public class Test {
    public static void main(String[] args) {
        Address add = new Address("China","Henan","Zhengzhou","Jinshui","473000");
        System.out.println(add);
        System.out.println("==============================");
        Employee emp = new Employee(1,"张三",1000.00,0.1);
        double v = emp.rate_money();
        System.out.println(v);
        System.out.println("==============================");
        Books book = new Books("时间简史",29);
        Books book1 = new Books("射雕英雄传", 49);
        System.out.println(book1);
    }
}
