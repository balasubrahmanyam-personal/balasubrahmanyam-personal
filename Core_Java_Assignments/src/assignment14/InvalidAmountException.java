package assignment14;

public class InvalidAmountException extends Throwable {
    InvalidAmountException(){
        System.out.println("No Amount Transaction...");
    }
    InvalidAmountException(String s)
    {
        System.out.println("Errorrrr "+s);
    }
}
