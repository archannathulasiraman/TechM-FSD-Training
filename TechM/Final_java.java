package TechM;

public class Final_java {
	// Final variable, method, and class demonstration
	// Final variable: its value cannot be changed once initialized
	    final int Value = 100;

	    // Final method: this method cannot be overridden in subclasses
	    final void displayMessage() {
	        System.out.println("This is a final method.");
	    }

	    // Final class: this class cannot be extended
	    final class FinalClass {
	        void show() {
	            System.out.println("This is a final class.");
	        }
	    }

	    public static void main(String[] args) {
	        Final_java obj = new Final_java();
	        
	        // Demonstrating final variable
	        System.out.println("Value " + obj.Value);
	        
	        // Demonstrating final method
	        obj.displayMessage();
	        
	        // Demonstrating final class
	        FinalClass finalClassObj = obj.new FinalClass();
	        finalClassObj.show();
	        
	        
	        // obj.MAX_LIMIT = 200; compile-time error because Value is final
	        // obj.displayMessage() {
	        //     System.out.println("Overridden method.");compile-time error because displayMessage() is final
	        // }
	    }
	}



