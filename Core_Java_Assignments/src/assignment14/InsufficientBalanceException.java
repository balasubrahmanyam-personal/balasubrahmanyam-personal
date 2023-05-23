package assignment14;

public class InsufficientBalanceException extends Exception
{
    InsufficientBalanceException(){
        System.out.println("This is default....");
    }
    InsufficientBalanceException(String s){
        System.out.println("You can't "+s);
    }
    InsufficientBalanceException(Throwable cause){
        System.out.println("Throwable cause.....");
    }
    InsufficientBalanceException(Throwable cause,String s){
        System.out.println("Throwable and string....");
    }
}
