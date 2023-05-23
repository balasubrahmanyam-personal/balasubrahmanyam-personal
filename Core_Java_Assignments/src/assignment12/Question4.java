package assignment12;

public class Question4 {
    public static void main(String[] args) {
        String str = "Harry Potter";
        int unicode5 = str.codePointAt(5);
        System.out.println("Unicode value at index 5:"+unicode5);
        System.out.println(str.trim());
    }
}
/*
Unicode value at index 5:32
Harry Potter

Process finished with exit code 0

 */