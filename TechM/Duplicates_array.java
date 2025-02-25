package TechM;
//import java.util.*;
public class Duplicates_array {
    public static void main(String[] args) {
        int[] numbers = {1,9,9,3,6,4,9};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) { 
                	System.out.print(numbers[i] + " ");
                    break; 
                }
            }
        }
    }
}

