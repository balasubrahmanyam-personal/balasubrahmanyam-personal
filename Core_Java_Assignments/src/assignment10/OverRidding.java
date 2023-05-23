package assignment10;

class Human{
    public void function(){
        System.out.println("Having all organs");

    }
}
class Heart extends Human{
    public void function(){
        System.out.println("Function going well in heart");

    }
}
public class OverRidding {
    public static void main(String[] args) {
        Heart heart = new Heart();
        heart.function();


    }
}
/*
Function going well in heart

Process finished with exit code 0
 */