package program3b;

public class StringUtils {
	
	    public static boolean isNullOrEmpty(String str) {
	        return str == null || str.trim().isEmpty();
	    }

	    public static void main(String[] args) {
	        String input = "   ";
	        System.out.println("Is null or empty: " + isNullOrEmpty(input));
	    }
	}


