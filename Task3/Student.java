package Task3;
import java.util.Arrays;
import java.util.Scanner;
public class Student implements Comparable<Student>{
	    String name;
	    int[] marks;
	    int total;
	    double average;

	    public Student(String name, int[] marks) {
	        this.name = name;
	        this.marks = marks;
	        this.total = Arrays.stream(marks).sum();
	        this.average = (double) total / marks.length;
	    }

	    @Override
	    public int compareTo(Student s) {
	        return s.total - this.total; // Sort by total marks in descending order
	    }

	    @Override
	    public String toString() {
	        return name + " - Total: " + total + ", Average: " + average;
	    }
	}


