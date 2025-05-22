package program;
import java.util.ArrayList;
import java.util.List;

public class SubListColors {
	
	    public static void main(String[] args) {
	        ArrayList<String> colors = new ArrayList<>();
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");

	        List<String> subList = colors.subList(0, 2); // 0 inclusive, 2 exclusive
	        System.out.println("SubList (1st and 2nd): " + subList);
	    }
	}



