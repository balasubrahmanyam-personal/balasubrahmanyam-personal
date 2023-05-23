package assignment6;

class SwitchToElse{
    int element = 2;
    int x = 0;
    public void show(){
    if(element == 0) {
        x = x + 2;
        System.out.println("X=" +x);
    }else if(element == 1){
        x = x + 4;
        System.out.println("X="+x);
    }else if(element == 2){
        x = x + 6;
        System.out.println("X="+x);
    }
    }
}
public class Question4 {
    public static void main(String args[]){
        SwitchToElse switchtoelse = new SwitchToElse();
        switchtoelse.show();
    }
}
