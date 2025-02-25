package Task3;

import java.util.Scanner;

public class EmployeeLoanCheck {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter Employee ID: ");
	        int id = sc.nextInt();
	        
	        sc.nextLine(); // Consume newline
	        
	        System.out.print("Enter Employee Name: ");
	        String name = sc.nextLine();
	        
	        System.out.print("Enter Monthly Salary: ");
	        double salary = sc.nextDouble();
	        
	        System.out.print("Enter Years of Experience: ");
	        int experience = sc.nextInt();
	        
	        Employee emp = new Employee(experience, name, salary, experience);
	        emp.setEmployeeDetails(id, name, salary, experience);
	        
	        emp.getEmployeeDetails();
	        emp.getLoanEligibility();
	        
	        sc.close();
	    }
	}




