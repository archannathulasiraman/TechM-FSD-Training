package Task3;
import java.util.Scanner;
public class Employee {

	    private int empId;
	    private String empName;
	    private double salary;
	    private int yearsOfExperience;
	    

//	    // Method to set Employee Details
//	    public void setEmployeeDetails(int empId, String empName, double salary, int yearsOfExperience) {
//	        this.empId = empId;
//	        this.empName = empName;
//	        this.salary = salary;
//	        this.yearsOfExperience = yearsOfExperience;
//	    }
//
//	    // Method to get Employee Details
//	    public void getEmployeeDetails() {
//	        System.out.println("\nEmployee Details:");
//	        System.out.println("ID: " + empId);
//	        System.out.println("Name: " + empName);
//	        System.out.println("Salary: " + salary);
//	        System.out.println("Years of Experience: " + yearsOfExperience);
//	    }

	    public int getEmpId() {
			return empId;
		}


		public void setEmpId(int empId) {
			this.empId = empId;
		}


		public String getEmpName() {
			return empName;
		}


		public void setEmpName(String empName) {
			this.empName = empName;
		}


		public double getSalary() {
			return salary;
		}


		public void setSalary(double salary) {
			this.salary = salary;
		}


		public int getYearsOfExperience() {
			return yearsOfExperience;
		}


		public void setYearsOfExperience(int yearsOfExperience) {
			this.yearsOfExperience = yearsOfExperience;
		}


		// Method to check Loan Eligibility
	    public void getLoanEligibility() {
	        if (yearsOfExperience <= 5) {
	            System.out.println(empName + " is not eligible for a loan.");
	            return;
	        }

	        double annualSalary = salary * 12;
	        double loanAmount = 0;

	        if (annualSalary >= 15_00_000) {
	            loanAmount = 7_00_000;
	        } else if (annualSalary >= 10_00_000) {
	            loanAmount = 5_00_000;
	        } else if (annualSalary >= 6_00_000) {
	            loanAmount = 2_00_000;
	        }

	        if (loanAmount > 0) {
	            System.out.println(empName + " is eligible for a loan of ₹" + loanAmount);
	        } else {
	            System.out.println(empName + " is not eligible for a loan.");
	        }
	    }


		public Employee(int empId, String empName, double salary, int yearsOfExperience) {
			super();
			this.empId = empId;
			this.empName = empName;
			this.salary = salary;
			this.yearsOfExperience = yearsOfExperience;
		}


		public void setEmployeeDetails(int id, String name, double salary2, int experience) {
			// TODO Auto-generated method stub
			
		}


		public void getEmployeeDetails() {
			// TODO Auto-generated method stub
			
		}


			// TODO Auto-generated method stub
			
		}
	
	

