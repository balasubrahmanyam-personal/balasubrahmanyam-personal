package assignment15;

class ThreeThread implements Runnable{
    public void run(){
        System.out.println("3 Thread objects...");
    }
}
public class Question3 {
    public static void main(String[] args) {
        ThreeThread threeThread = new ThreeThread();
        Thread thread = new Thread(threeThread);
        thread.start();

    }
}
/*
3 Thread objects...


...Program finished with exit code 0
Press ENTER to exit console.
 */