import java.util.Scanner;

public class BookTable extends Thread {
    static int tableFor2=8,tableFor4=4,tableFor6=2,tableFor8=2;

    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name ::");
        String name = sc.nextLine();
        System.out.println("Enter no. of seats you required :: ");
        int noOfSeats = sc.nextInt();

        if(noOfSeats<=2){
            if(tableFor2 != 0){
                tableFor2--;
                System.out.println("Table for you had booked ");

            } else if (tableFor2 == 0 && tableFor4 != 0) {
                tableFor2--;
                System.out.println("Table for you booked");

            } else if (tableFor4 == 0 && tableFor6 != 0) {
                tableFor2--;
                System.out.println("Table for you booked");

            }else if(tableFor6 == 0 && tableFor8 != 0){
                tableFor2--;
                System.out.println("Table for you booked");
            } else{
                System.out.println("No availbilty of tables");

            }
        }else if(noOfSeats<=4){
            if(tableFor4 != 0){
               tableFor4--;
                System.out.println("Table for you booked");
            }else if (tableFor4 == 0 && tableFor6 != 0) {
                tableFor4--;
                System.out.println("Table for you booked");

            }else if(tableFor6 == 0 && tableFor8 != 0){
                tableFor4--;
                System.out.println("Table for you booked");
            } else{
                System.out.println("No availbilty of tables");
            }

        } else if (noOfSeats<=6) {
            if(tableFor6 != 0){
                tableFor6--;
                System.out.println("Table for you booked");
            }else if(tableFor6 == 0 && tableFor8 != 0){
                tableFor6--;
                System.out.println("Table for you booked");
            } else{
                System.out.println("No availbilty of tables");

            }

        } else if (noOfSeats<=8) {
            if(tableFor8 != 0){
                tableFor8--;
                System.out.println("Table for you booked");
            }else{
                System.out.println("No availbility of tables");
            }

        }
    }


}
