package program3c;

public class CapitalizeWords {
	
	    public static String capitalizeWords(String str) {
	        String[] words = str.split("\\s+");
	        StringBuilder result = new StringBuilder();
	        for (String word : words) {
	            if (word.length() > 0) {
	                result.append(Character.toUpperCase(word.charAt(0)))
	                      .append(word.substring(1)).append(" ");
	            }
	        }
	        return result.toString().trim();
	    }

	    public static void main(String[] args) {
	        String input = "hello world from java";
	        System.out.println(capitalizeWords(input));
	    }
	}



