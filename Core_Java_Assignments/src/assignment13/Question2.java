package assignment13;

public class Question2 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        int sum = 0;

        try {
            for(int i=0;i<10;i++){
                sum = sum+arr[i];
            }
        } catch (java.lang.Exception e) {
            System.out.println("Length of the array big bigger biggest");
            //e.printStackTrace();

        }

    }
}
