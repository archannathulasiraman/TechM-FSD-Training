package TechM;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;

class OutOfStockException extends Exception {
	public OutOfStockException(String message) {
		super(message);
	}
}
