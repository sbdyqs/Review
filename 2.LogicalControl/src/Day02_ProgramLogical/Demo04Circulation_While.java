package Day02_ProgramLogical;

public class Demo04Circulation_While {
    public static void main(String[] args) {
        int sum = 0;
        int num = 1;
/*        while (num <= 100){
            sum += num;
            num++;
        }
        System.out.println(sum);*/

        do {
            sum += num;
            num ++;
        }while (num <= 100);
        System.out.println(sum);
    }
}
