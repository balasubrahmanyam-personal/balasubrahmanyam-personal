import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        int choice = 100;
        while(choice!=0){

            System.out.println("Press 0.Exit");
            System.out.println("Press 1.Book Table");
            System.out.println("Press 2.Print Menu");
            System.out.println("Press 3.Order Coffee");
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();

            BookTable bookTable = new BookTable();
            PrintMenu printMenu = new PrintMenu();
            SelectMenu selectMenu = new SelectMenu();

            switch (choice){
                case 0:
                    System.out.println("Thank you for visiting");
                    break;
                case 1:
                    //Book Table
                    bookTable.start();
                    bookTable.join();
                    break;
                case 2:
                    //Print Menu
                    printMenu.start();
                    printMenu.join();
                    break;
                case 3:
                    //Order Coffee
                    selectMenu.start();
                    selectMenu.join();

            }

        }
    }
}