package assignment15;

class Explicitly extends Thread{
    public void run(){
        System.out.println("Running program explicitly...");
    }
}
public class Question2 {
    public static void main(String[] args) {
        Explicitly explicitly = new Explicitly();
        explicitly.run();

    }
}
/*
Running program explicitly...


...Program finished with exit code 0
Press ENTER to exit console.
 */