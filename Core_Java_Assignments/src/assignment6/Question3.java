package assignment6;

class Switchkeyword{
    int element = 2;
    public void show(){
        switch(element){
            case 1 :
            System.out.println("Low");
            break;
            case 2 :
            System.out.println("Medium");
            break;
            case 3 :
            System.out.println("High");
            break;
            default :
                System.out.println("Abnormal");
        }
    }
}
public class Question3 {
    public static void main(String args[]){
        Switchkeyword switchkeyword = new Switchkeyword();
        switchkeyword.show();
    }
}
