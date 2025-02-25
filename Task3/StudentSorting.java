package Task3;

import java.util.Arrays;
import java.util.Scanner;

public class StudentSorting {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            String name = sc.next();
            System.out.print("Enter number of subjects: ");
            int subjects = sc.nextInt();
            int[] marks = new int[subjects];

            for (int j = 0; j < subjects; j++) {
                System.out.print("Enter marks for subject " + (j + 1) + ": ");
                marks[j] = sc.nextInt();
            }
            students[i] = new Student(name, marks);
        }

        Arrays.sort(students);
        System.out.println("\nSorted Student List:");
        for (Student s : students) {
            System.out.println(s);
        }
        sc.close();
    }
}




