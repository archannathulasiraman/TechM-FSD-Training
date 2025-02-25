package TechM;

import java.util.List;

public class Order  implements Comparable<Order> {
	 private String orderID;
	    private List<String> productIDs;
	    private Priority priority;

	    public enum Priority { STANDARD, EXPEDITED }

	    public Order(String orderID, List<String> productIDs, Priority priority) {
	        this.orderID = orderID;
	        this.productIDs = productIDs;
	        this.priority = priority;
	    }

	    public List<String> getProductIDs() { return productIDs; }
	    public Priority getPriority() { return priority; }
	    public String getOrderID() { return orderID; }

	    @Override
	    public int compareTo(Order o) {
	        return this.priority.ordinal() - o.priority.ordinal();
	    }
	}
	


