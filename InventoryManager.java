package TechM;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InventoryManager {
	private Map<String, Product> products = new ConcurrentHashMap<>();
    PriorityQueue<Order> orderQueue = new PriorityQueue<>();
    ExecutorService orderProcessor = Executors.newFixedThreadPool(3);

    // Add product to inventory
    public synchronized void addProduct(Product product) {
        products.put(product.getProductID(), product);
        log("Added Product: " + product.getName() + " at " + product.getLocation());
    }

    // Search for a product
    public Product searchProduct(String productID) {
        return products.get(productID);
    }

    // Process Orders
    public void processOrders() {
        while (!orderQueue.isEmpty()) {
            Order order = orderQueue.poll();
            orderProcessor.execute(() -> fulfillOrder(order));
        }
    }

    // Fulfill an order
    private void fulfillOrder(Order order) {
        try {
            for (String productID : order.getProductIDs()) {
                Product product = products.get(productID);
                if (product == null) throw new InvalidLocationException("Product not found!");
                if (product.getQuantity() <= 0) throw new OutOfStockException("Product " + product.getName() + " is out of stock!");
                product.setQuantity(product.getQuantity() - 1);
                log("Order " + order.getOrderID() + " fulfilled: " + product.getName());
            }
        } catch (Exception e) {
            log("Error processing order: " + e.getMessage());
        }
    }

    // Add order to the queue
    public synchronized void addOrder(Order order) {
        orderQueue.add(order);
        log("Order Added: " + order.getOrderID() + " with priority " + order.getPriority());
    }

    // Log system events
    private void log(String message) {
        try (FileWriter writer = new FileWriter("inventory_log.txt", true)) {
            writer.write(new String() + " - " + message + "\n");
        } catch (IOException e) {
            System.err.println("Logging failed: " + e.getMessage());
        }
    }
}



