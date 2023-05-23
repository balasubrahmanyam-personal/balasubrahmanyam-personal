package assignment12;

public class Question7 {
    public static void main(String[] args) {
        String str = "abc@gmail.com";
        String arr[] = str.split("[@.]");

        for(String strNew : arr){
            System.out.println(strNew);
        }
    }
}
/*
abc
gmail
com

Process finished with exit code 0

 */