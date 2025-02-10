package TechM;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Main {
	    public static void main(String[] args) throws InterruptedException {
	        InventoryManager inventoryManager = new InventoryManager();

	        // Initialize inventory
	        inventoryManager.addProduct(new Product("P001", "Laptop", 10, new Location(1, 2, 3)));
	        inventoryManager.addProduct(new Product("P002", "Mouse", 20, new Location(2, 1, 1)));
	        inventoryManager.addProduct(new Product("P003", "Keyboard", 15, new Location(3, 4, 5)));

	        // Create orders
	        Order order1 = new Order("O001", Arrays.asList("P001", "P002"), Order.Priority.EXPEDITED);
	        Order order2 = new Order("O002", Arrays.asList("P003"), Order.Priority.STANDARD);

	        // Add orders to queue
	        inventoryManager.addOrder(order1);
	        inventoryManager.addOrder(order2);

	        // Debugging: Check queue size
	        System.out.println("Orders in queue before processing: " + inventoryManager.orderQueue.size());

	        // Process orders
	        inventoryManager.processOrders();

	        // Wait to ensure orders are processed
	        Thread.sleep(2000);
	        inventoryManager.orderProcessor.shutdown();
	        inventoryManager.orderProcessor.awaitTermination(5, TimeUnit.SECONDS);

	        // Final debug
	        System.out.println("Orders in queue after processing: " + inventoryManager.orderQueue.size());
	    }
	}



