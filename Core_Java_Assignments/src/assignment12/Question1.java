package assignment12;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Scanner;

//class LengthAndReorder{
//    public void display(){
//        String name = "Java";
//        String sentence = "complex To Learn";
//        System.out.println(name.length());
//        System.out.println(sentence.length());
//    }
//    public void show(){
//        String name1 = "ASDFGHJKLNCXZQWERTYUIOP";
//        String arr[] = new String[];
//        Arrays.sort(arr);
//
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//    }
//}
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter names:");

        String arr[] = new String[2];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }
        Arrays.sort(arr, Comparator.comparing(s -> s.length()));
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

}

/*
Enter names:
sandeep
ram
ram
snadeep

Process finished with exit code 0

 */