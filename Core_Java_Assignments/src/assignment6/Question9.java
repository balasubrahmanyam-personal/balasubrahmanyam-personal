package assignment6;

class Triangle{
    int i,j;
    public void design() {
        for (int i= 0; i<= 9-1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 9 - 1 - i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
public class Question9 {
    public static void main(String args[]){
        Triangle triangle = new Triangle();
        triangle.design();
    }
}
