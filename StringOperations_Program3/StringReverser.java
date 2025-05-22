package program3b;

public class StringReverser {
	
	    public static String reverseString(String str) {
	        return new StringBuilder(str).reverse().toString();
	    }

	    public static void main(String[] args) {
	        String input = "AIET";
	        System.out.println("Reversed: " + reverseString(input));
	    }
	}


