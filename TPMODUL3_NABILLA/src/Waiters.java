public class Waiters implements Runnable {

    private final int orderQty;
    private final int customerID;
    static int foodPrice = 55000;

    public Waiters(int customerID, int orderQty) {
        this.customerID = customerID;
        this.orderQty = orderQty;
        
        
    }

    @Override
    public void run() {
        while (true) {
            makeFood();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException er) {
                er.printStackTrace();
            }
        }
    }

    public void orderInfo() {
        System.out.println("\n                     RESTAURANT BILL                 ");
        System.out.println("============================================================");
        System.out.println("Customer ID    :                                      " + this.customerID);
        System.out.println("Number of Food :                                      " + this.orderQty);
        System.out.println("Total Price    :                                      " + this.orderQty * foodPrice);
        System.out.println("============================================================");
    }
    // create synchronized method getFood

    public void makeFood() {
        synchronized(Restaurant.getLock()) {

            System.out.println("Waiter: Food is ready to deliver");
            Restaurant chef = new Restaurant();
            chef.setWaitingForPickup(false);

            
            if (Restaurant.getFoodNumber() == this.orderQty + 1) {
                orderInfo();
                System.exit(0);
            }
            Restaurant.getLock().notifyAll();
            System.out.println("Waiter: Tell the restaurant to make another food\n");

        }
    }

    
}