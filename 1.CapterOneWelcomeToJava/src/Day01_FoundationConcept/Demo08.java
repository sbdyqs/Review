package Day01_FoundationConcept;

public class Demo08 {
    public static void main(String[] args) {
        int x = 10;
        int y = 11;
        int z = 12;
        int max = x > y ? x : z;      //x大于y吗?是:则输出x,否则输出z
        System.out.println(max);      //12
    }
}
