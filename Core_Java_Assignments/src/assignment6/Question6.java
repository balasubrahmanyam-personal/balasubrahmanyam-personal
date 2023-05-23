package assignment6;
import java.util.Scanner;

class Age{
    Scanner sc = new Scanner(System.in);
    int age1 = sc.nextInt();
    int age2 = sc.nextInt();
    int age3 = sc.nextInt();
    public void show(){
        if(age1 > age2 && age1 > age3) {
            System.out.println("Oldest one:" + age1);
        }
        else if(age2 > age1 && age2 > age3){
            System.out.println("Oldest one:" + age2);
        }
       else{
            System.out.println("Oldest one:" + age3);
        }
        if(age1 < age2 && age1 < age3) {
            System.out.println("Youngest one:" + age1);
        }
        else if(age2 < age1 && age2 < age3){
            System.out.println("Youngest one:" + age2);
        }
        else{
            System.out.println("Youngest one:" + age3);
        }
    }


}
public class Question6 {
    public static void main(String args[]){
        Age age = new Age();
        age.show();
    }
}
