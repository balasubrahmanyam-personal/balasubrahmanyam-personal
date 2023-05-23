package assignment6;

class Square{
    int i,j,k,l;
    public void design(){
        char arr[] = {'A','B','C','D','E','F'};
        for(i=5;i>=0;i--){
            for(j=0;j<=i;j++){
                System.out.print(arr[j]);
            }
            System.out.println(" ");
        }

        for(k=0;k<=5;k++){
            for(l=0;l<=k;l++){
                System.out.print(arr[l]);
            }
            System.out.println(" ");
        }
    }
}
public class Question8b {
    public static void main(String args[]){
        Square square = new Square();
        square.design();
    }
}
