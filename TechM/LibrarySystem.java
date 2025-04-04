package TechM;
import java.util.*;
	public abstract class LibrarySystem implements ILibrary {
	    protected List<Book> books;
	    protected List<User> users;

	    public LibrarySystem() {
	        books = new ArrayList<>();
	        users = new ArrayList<>();
	    }

	    public abstract void addBook(Book book);
	    public abstract void addUser(User user);
	}


