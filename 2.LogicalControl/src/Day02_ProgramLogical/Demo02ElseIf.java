package Day02_ProgramLogical;

public class Demo02ElseIf {
    public static void main(String[] args) {
        double score = 80.00;
        if (score >= 90 && score <= 100){
            System.out.println("优等生");
        }else if (score >= 60 && score < 90){
            System.out.println("良等生");
        }else {
            System.out.println("差等生");
        }
    }
}
