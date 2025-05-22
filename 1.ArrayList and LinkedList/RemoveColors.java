package program;
import java.util.ArrayList;

public class RemoveColors {
	

	
	    public static void main(String[] args) {
	        ArrayList<String> colors = new ArrayList<>();
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");

	        System.out.println("Original List: " + colors);

	        if (colors.size() > 1) {
	            colors.remove(1);  // Remove 2nd element (index 1)
	        }
	        colors.remove("Blue");  // Remove "Blue" if still present

	        System.out.println("Modified List: " + colors);
	    }
	}


