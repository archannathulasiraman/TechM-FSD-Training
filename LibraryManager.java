package TechM;
import java.io.*;
import java.util.List;
import java.util.concurrent.*;

import javax.management.AttributeNotFoundException;
	public class LibraryManager extends LibrarySystem {
	    private final ExecutorService executor = Executors.newFixedThreadPool(3);

	    @Override
	    public void addBook(Book book) { books.add(book); }
	    
	    @Override
	    public void addUser(User user) { users.add(user); }

	    @Override
	    public synchronized void borrowBook(String ISBN, String userID) 
	            throws AttributeNotFoundException, UserNotFoundException, MaxBooksAllowedException {
	        User user = users.stream().filter(u -> u.getUserID().equals(userID)).findFirst().orElseThrow(() -> new UserNotFoundException("User not found."));
	        Book book = books.stream().filter(b -> b.getISBN().equals(ISBN) && !b.isBorrowed()).findFirst().orElseThrow();
	        
	        if (user.getBorrowedBooks().size() >= 3) throw new MaxBooksAllowedException("User has reached borrowing limit.");
	        
	        book.borrow();
	        user.borrowBook(book);
	        System.out.println(user.getName() + " borrowed " + book.getTitle());
	    }

	    @Override
	    public synchronized void returnBook(String ISBN, String userID) throws AttributeNotFoundException, UserNotFoundException {
	        User user = users.stream().filter(u -> u.getUserID().equals(userID)).findFirst().orElseThrow(() -> new UserNotFoundException("User not found."));
	        Book book = user.getBorrowedBooks().stream().filter(b -> b.getISBN().equals(ISBN)).findFirst().orElseThrow();
	        
	        book.returnBook();
	        user.returnBook(book);
	        System.out.println(user.getName() + " returned " + book.getTitle());
	    }

	    @Override
	    public Book searchBook(String title) {
	        return books.stream().filter(b -> b.getTitle().equalsIgnoreCase(title)).findFirst().orElse(null);
	    }

	    public void saveData() throws IOException {
	        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("library_data.ser"))) {
	            out.writeObject(books);
	            out.writeObject(users);
	        }
	    }

	    @SuppressWarnings("unchecked")
	    public void loadData() throws IOException, ClassNotFoundException {
	        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("library_data.ser"))) {
	            books = (List<Book>) in.readObject();
	            users = (List<User>) in.readObject();
	        }
	    }

		@Override
		public void reserveBook(String ISBN, String userID) throws AttributeNotFoundException, UserNotFoundException {
			// TODO Auto-generated method stub
			
		}
	}



