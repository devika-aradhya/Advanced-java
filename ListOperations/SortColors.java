package program;
import java.util.ArrayList;
import java.util.Collections;


public class SortColors {
	
	
	    public static void main(String[] args) {
	        ArrayList<String> colors = new ArrayList<>();
	        colors.add("Yellow");
	        colors.add("Red");
	        colors.add("Blue");

	        System.out.println("Before Sorting: " + colors);
	        Collections.sort(colors);
	        System.out.println("After Sorting: " + colors);
	    }
	}


