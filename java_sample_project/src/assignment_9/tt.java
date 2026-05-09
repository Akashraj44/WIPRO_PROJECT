package assignment_9;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Order implements Runnable {
    private int orderId;

    public Order(int orderId) {
        this.orderId = orderId;
    }

    public void run() {
        System.out.println("Order " + orderId + " is being prepared by " +
                Thread.currentThread().getName());
        try { Thread.sleep(2000); } catch (InterruptedException e) {}
        System.out.println("Order " + orderId + " delivered by " +
                Thread.currentThread().getName());
    }
}

public class tt {
    public static void main(String[] args) {
        int numberOfAgents = 3;

        ExecutorService service =
                Executors.newFixedThreadPool(numberOfAgents);

        for (int i = 1; i <= 10; i++) {
            service.execute(new Order(i));
        }

        service.shutdown();
    }
}

