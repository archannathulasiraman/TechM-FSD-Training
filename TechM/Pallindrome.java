package TechM;

class Palindrome {
    public static boolean isPalindrome(String str) {
        String reversedStr = new StringBuilder(str).reverse().toString();
        return str.equals(reversedStr);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));  
        System.out.println(isPalindrome("hello")); 
    }
}