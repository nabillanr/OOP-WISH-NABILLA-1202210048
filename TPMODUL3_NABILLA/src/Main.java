import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {
            Restaurant Chef = new Restaurant();
            int customerID, orderQty;
            try {

                System.out.print("Enter Customer ID: ");
                customerID = input.nextInt();

                System.out.print("Enter how much food to made: ");
                orderQty = input.nextInt();

                Thread x1 = new Thread(Chef);
                Waiters waiter = new Waiters(customerID, orderQty);
                Thread x2 = new Thread(waiter);

                x1.start();
                x2.start();
                x1.join();
                x2.join();

            } catch (Exception er) {
                System.out.println("Input must be Integer!!\n");
            }
        }

    }

}