package Test;

public class Books {
    private String name;
    private double price;
    private static int count = 0;
    public Books(){

    }
    public Books(String name, double price){
        this.name = name;
        this.price = price;
        count ++;
    }

    @Override
    public String toString() {
        return "Books{" +
                "第" + count + "本书:" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Books.count = count;
    }
}
