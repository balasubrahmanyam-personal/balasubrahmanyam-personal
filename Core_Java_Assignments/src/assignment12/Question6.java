package assignment12;

public class Question6 {
    public static void main(String[] args) {
        String str = "I recived my marks";
        String arr[] = null;
        arr=str.split(" ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
/*
I
recived
my
marks

Process finished with exit code 0

 */