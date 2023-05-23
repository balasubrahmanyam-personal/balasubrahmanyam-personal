package assignment15;

class OddNumbers implements Runnable{
    public void run(){
        for(int i=1;i<=10;i=i+2){
            System.out.println("OddNumbers r:"+i);
        }
    }
}
public class Question4 {
    public static void main(String[] args) {
        OddNumbers oddNumbers = new OddNumbers();
        Thread thread = new Thread(oddNumbers);
        thread.start();
    }
}
/*
OddNumbers r:1
OddNumbers r:3
OddNumbers r:5
OddNumbers r:7
OddNumbers r:9


...Program finished with exit code 0
Press ENTER to exit console.
 */