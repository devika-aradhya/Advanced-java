package program;
import java.util.ArrayList;


public class SearchColor {
	
	
	    public static void main(String[] args) {
	        ArrayList<String> colors = new ArrayList<>();
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");

	        System.out.println("Color List: " + colors);
	        if (colors.contains("Red")) {
	            System.out.println("Red is available.");
	        } else {
	            System.out.println("Red is not available.");
	        }
	    }
	}


