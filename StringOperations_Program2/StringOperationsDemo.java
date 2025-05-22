package program2a;

public class StringOperationsDemo {
	
	    public static void main(String[] args) {
	        // String Creation and Basic Operations
	        String str1 = "AIET";
	        String str2 = new String("College");
	        System.out.println("String 1: " + str1);
	        System.out.println("String 2: " + str2);

	        // Length and Character Access
	        System.out.println("Length of str1: " + str1.length());
	        System.out.println("Char at index 2 in str1: " + str1.charAt(2));

	        // String Comparison
	        String str3 = "AIET";
	        System.out.println("str1 equals str3: " + str1.equals(str3));
	        System.out.println("str1 compareTo str2: " + str1.compareTo(str2));

	        // String Searching
	        String sentence = "Welcome to AIET College";
	        System.out.println("Index of 'AIET': " + sentence.indexOf("AIET"));
	        System.out.println("Contains 'College': " + sentence.contains("College"));

	        // Substring Operations
	        System.out.println("Substring from index 11: " + sentence.substring(11));
	        System.out.println("Substring from index 11 to 15: " + sentence.substring(11, 15));

	        // String Modification
	        String replaced = sentence.replace("AIET", "My College");
	        System.out.println("Replaced sentence: " + replaced);

	        // Whitespace Handling
	        String strWithSpaces = "  AIET College  ";
	        System.out.println("Trimmed: '" + strWithSpaces.trim() + "'");

	        // String Concatenation
	        String fullStr = str1.concat(" ").concat(str2);
	        System.out.println("Concatenated String: " + fullStr);

	        // String Splitting
	        String[] words = sentence.split(" ");
	        System.out.println("Split words:");
	        for (String word : words) {
	            System.out.println(word);
	        }

	        // StringBuilder Demo
	        StringBuilder sb = new StringBuilder("AIET");
	        sb.append(" - ").append("Engineering College");
	        System.out.println("StringBuilder Result: " + sb.toString());

	        // String Formatting
	        String name = "AIET";
	        int year = 2025;
	        String formatted = String.format("Welcome to %s - %d", name, year);
	        System.out.println("Formatted String: " + formatted);

	        // Validate Email
	        String email = "student@aiet.edu";
	        if (email.contains("@") && email.startsWith("student") && email.endsWith(".edu")) {
	            System.out.println("Valid email format.");
	        } else {
	            System.out.println("Invalid email format.");
	        }
	    }
	}



