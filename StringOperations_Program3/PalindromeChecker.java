package program3b;

public class PalindromeChecker {
	
	    public static boolean isPalindrome(String str) {
	        String cleaned = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
	        String reversed = new StringBuilder(cleaned).reverse().toString();
	        return cleaned.equals(reversed);
	    }

	    public static void main(String[] args) {
	        String input = "A man, a plan, a canal, Panama";
	        System.out.println("Is palindrome: " + isPalindrome(input));
	    }
	}


