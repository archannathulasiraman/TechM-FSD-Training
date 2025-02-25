package TechM;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main1 {
	    public static void main(String[] args) {
	        LibraryManager library = new LibraryManager();

	        // Load saved data (if available)
	        try {
	            library.loadData();
	            System.out.println("Library data loaded.");
	        } catch (Exception e) {
	            System.out.println("Starting fresh library system.");
	        }

	        // Adding books
	        library.addBook(new Book("Java Programming", "James Gosling", "123"));
	        library.addBook(new Book("Python Basics", "Guido van Rossum", "456"));
	        library.addBook(new Book("Data Structures", "Robert Lafore", "789"));

	        // Adding users
	        library.addUser(new User("Alice", "U001"));
	        library.addUser(new User("Bob", "U002"));

	        // Simulate borrowing in multiple threads
	        ExecutorService executor = Executors.newFixedThreadPool(2);
	        executor.submit(() -> {
	            try { library.borrowBook("123", "U001"); } catch (Exception e) { System.out.println(e.getMessage()); }
	        });
	        executor.submit(() -> {
	            try { library.borrowBook("456", "U002"); } catch (Exception e) { System.out.println(e.getMessage()); }
	        });

	        executor.shutdown();

	        // Save library data
	        try { library.saveData(); } catch (Exception e) { System.out.println("Error saving data."); }
	    }
	}

