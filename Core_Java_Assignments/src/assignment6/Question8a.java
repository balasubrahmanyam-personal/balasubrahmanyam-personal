package assignment6;

class Pattern{
    int i,j;
    public void design(){
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
public class Question8a {
    public static void main(String args[]){
        Pattern patterns = new Pattern();
        patterns.design();
    }
}
