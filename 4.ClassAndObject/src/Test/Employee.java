package Test;

public class Employee {
    private int code;
    private String name;
    private double salary;
    private double rate;
    public double rate_money(){
        return (this.salary * (1 + this.rate));
    }

    public Employee() {
    }

    public Employee(int code, String name, double salary, double rate) {
        this.code = code;
        this.name = name;
        this.salary = salary;
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", rate=" + rate +
                '}';
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
