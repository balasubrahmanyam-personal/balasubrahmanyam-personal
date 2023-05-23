package assignment15;
import java.lang.*;
class Restart extends Thread{
    public void run(){
        System.out.println("Is it running ....");
    }
}
public class Question1 {
    public static void main(String[] args) {
        Restart restart = new Restart();
        restart.start();
        restart.start();
//        Thread thread = new Thread();
//        thread.start();


    }
}
/*
Exception in thread "main" Is it running ....
java.lang.IllegalThreadStateException
        at java.base/java.lang.Thread.start(Thread.java:794)
        at Main.main(Main.java:6)
 */