package program3c;

public class TruncateString {

	    public static String truncate(String str, int length) {
	        if (str.length() <= length) return str;
	        return str.substring(0, length) + "...";
	    }

	    public static void main(String[] args) {
	        String input = "This is a long string example";
	        System.out.println(truncate(input, 10));
	    }
	}



