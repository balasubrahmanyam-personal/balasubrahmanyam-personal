package assignment6;
import java.util.Scanner;

class GreaterOne{
    Scanner sc = new Scanner(System.in);
    int value1 = sc.nextInt();
    int value2 = sc.nextInt();
    public void show(){
        if(value1 > value2){
            System.out.println("Value1 is greater:" +value1);
        }else{
            System.out.println("Value2 is greater:" +value2);
        }
    }
}
public class Question5 {
    public static void main(String args[]){
        GreaterOne greaterone = new GreaterOne();
        greaterone.show();
    }
}
