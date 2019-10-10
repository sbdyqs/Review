package Day05_Array;
class ArrayUtil{
    private int max;
    private int min;
    private int sum;
    private double avg;
    public ArrayUtil(int[] data){
        this.max = data[0];
        this.min = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] > max){
                this.max = data[i];
            }
            if (data[i] < min){
                this.min = data[i];
            }
            this.sum += data[i];

        }
        this.avg = this.sum / data.length;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }
}
public class Demo08Array {
    public static void main(String[] args) {
        int data[] = new int[]{200,100,50};
        ArrayUtil au = new ArrayUtil(data);
        System.out.println("最大值:" + au.getMax());
        System.out.println("最小值:" + au.getMin());
        System.out.println("总和:" + au.getSum());
        System.out.println("平均值:" + au.getAvg());
    }
}
