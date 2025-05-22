package program3b;

public class WhitespaceRemover {
	
	    public static String removeWhitespace(String str) {
	        return str.replaceAll("\\s+", "");
	    }

	    public static void main(String[] args) {
	        String input = "  AIET   College   Rocks ";
	        System.out.println("Without whitespace: '" + removeWhitespace(input) + "'");
	    }
	}


