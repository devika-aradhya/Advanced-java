package program3c;

public class WordCount {
	
	    public static int countWords(String str) {
	        if (str == null || str.isEmpty()) return 0;
	        String[] words = str.trim().split("\\s+");
	        return words.length;
	    }

	    public static void main(String[] args) {
	        String input = "Count the number of words in this sentence";
	        System.out.println("Word Count: " + countWords(input));
	    }
	}


