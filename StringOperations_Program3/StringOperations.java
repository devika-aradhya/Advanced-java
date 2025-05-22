package program3a;

public class StringOperations {
	
	
	    public static void main(String[] args) {
	        // String Creation and Basic Operations
	        String str1 = "Hello";
	        String str2 = new String("World");
	        System.out.println("String 1: " + str1);
	        System.out.println("String 2: " + str2);

	        // Length and Character Access
	        System.out.println("Length of str1: " + str1.length());
	        System.out.println("Character at index 1 of str1: " + str1.charAt(1));

	        // String Comparison
	        System.out.println("str1 equals str2? " + str1.equals(str2));
	        System.out.println("str1 compareTo str2: " + str1.compareTo(str2));

	        // String Searching
	        String sentence = "Welcome to AIET College";
	        System.out.println("Contains 'AIET': " + sentence.contains("AIET"));
	        System.out.println("Index of 'College': " + sentence.indexOf("College"));

	        // Substring Operations
	        System.out.println("Substring from index 11: " + sentence.substring(11));
	        System.out.println("Substring from 11 to 15: " + sentence.substring(11, 15));

	        // String Modification
	        String modified = sentence.replace("AIET", "My");
	        System.out.println("Modified string: " + modified);

	        // Whitespace Handling
	        String spacey = "  Hello World  ";
	        System.out.println("Trimmed: '" + spacey.trim() + "'");

	        // String Concatenation
	        String full = str1 + " " + str2;
	        System.out.println("Concatenated: " + full);

	        // String Splitting
	        String[] words = sentence.split(" ");
	        System.out.println("Split words:");
	        for (String word : words) {
	            System.out.println(word);
	        }

	        // StringBuilder Demo
	        StringBuilder sb = new StringBuilder("AIET");
	        sb.append(" College").append(" Rocks!");
	        System.out.println("StringBuilder: " + sb.toString());

	        // String Formatting
	        String formatted = String.format("Welcome to %s in year %d", "AIET", 2025);
	        System.out.println("Formatted: " + formatted);

	        // Validate Email
	        String email = "user@aiet.edu";
	        if (email.contains("@") && email.startsWith("user") && email.endsWith(".edu")) {
	            System.out.println("Valid email address.");
	        } else {
	            System.out.println("Invalid email address.");
	        }
	    }
	}


