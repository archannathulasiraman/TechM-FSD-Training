package TechM;

import javax.management.AttributeNotFoundException;

public interface ILibrary {
	    void borrowBook(String ISBN, String userID) throws AttributeNotFoundException, UserNotFoundException, MaxBooksAllowedException;
	    void returnBook(String ISBN, String userID) throws AttributeNotFoundException, UserNotFoundException;
	    void reserveBook(String ISBN, String userID) throws AttributeNotFoundException, UserNotFoundException;
	    Book searchBook(String title);
	}


