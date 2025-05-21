package program;
import java.util.ArrayList;

public class RemoveNthElement {
	

	
	    public static void main(String[] args) {
	        ArrayList<String> colors = new ArrayList<>();
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");

	        int n = 1; // example: remove 2nd element (index 1)
	        if (n >= 0 && n < colors.size()) {
	            colors.remove(n);
	        }

	        System.out.println("After removing element at index " + n + ": " + colors);
	    }
	}



