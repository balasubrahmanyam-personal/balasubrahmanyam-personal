package assignment6;

class Result{
    int number1 = 3;
    public void display(){
        if(number1 >= 0){
            if(number1==0){
                System.out.println("first");
            }else{
                System.out.println("second");
            }
            System.out.println("third");
        }
    }
}
public class Question2 {
    public static void main(String args[]){
        Result result = new Result();
        result.display();
    }
}
