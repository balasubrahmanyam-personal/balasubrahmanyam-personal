package assignment13;

import java.util.Scanner;

class Exception{
    public void display(){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();

        try{
            int result = num1/0;

        }catch(java.lang.Exception e){
            System.out.println("Is it zero");

        }finally {
            System.out.println("No i think ohh,no its zero");
        }


    }

}
public class ClassCastException {
    public static void main(String[] args) {
        Exception exception = new Exception();
        exception.display();

    }
}
/*
0
Is it zero
No i think ohh,no its zero

Process finished with exit code 0

 */