package TechM;

import java.util.*;

public class Valid_paranthesis {
	public static boolean isValid(String s) {
		Stack<Character> paranthesis = new Stack<>();

		for (char ch : s.toCharArray()) {
			if (ch == '(')
				paranthesis.push(')');
			else if (ch == '{')
				paranthesis.push('}');
			else if (ch == '[')
				paranthesis.push(']');
			else if (paranthesis.isEmpty())
				return false;
		}
		return paranthesis.isEmpty();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String bracket = sc.next();
		System.out.println(isValid(bracket));
		
	}

}
