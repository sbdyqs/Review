package Day02_ProgramLogical;

public class Demo06CirculationContral {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 3){                        //退出循环判断
                continue;                       //结束本次循环,后续代码本次不执行
            }
            System.out.println(i);
        }

        for (int j = 0; j < 10; j++) {
            if (j == 3){                        //退出循环判断
                break;                          //结束全部循环,后续所有循环都不再执行
            }
            System.out.println(j);
        }
    }
}
