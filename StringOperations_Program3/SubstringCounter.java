package program3b;

public class SubstringCounter {
	
	    public static int countOccurrences(String main, String sub) {
	        int count = 0;
	        int idx = 0;
	        while ((idx = main.indexOf(sub, idx)) != -1) {
	            count++;
	            idx += sub.length();
	        }
	        return count;
	    }

	    public static void main(String[] args) {
	        String text = "AIET is AIET and AIET is the best.";
	        String sub = "AIET";
	        System.out.println("Occurrences of '" + sub + "': " + countOccurrences(text, sub));
	    }
	}



