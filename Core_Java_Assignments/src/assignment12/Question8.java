package assignment12;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Question8 {
    public static void main(String[] args) {
//        String arr[] = new String[];
//        String arr1[] = new String[];
        ArrayList<String> operators = new ArrayList<>();
        ArrayList<String> operands = new ArrayList<>();
        StringTokenizer str = new StringTokenizer("3+(20%2)*(20/2)", "[+%-/*]", true);
        int i = 0;
        while (str.hasMoreTokens()) {
            if (i % 2 == 0) {
                operands.add(str.nextToken());
            } else {
                operators.add(str.nextToken());
            }
            i++;
        }
        System.out.println(operands);
        System.out.println(operators);
    }

}
/*
[3, (20, 2), (20, 2)]
[+, %, *, /]

Process finished with exit code 0

 */