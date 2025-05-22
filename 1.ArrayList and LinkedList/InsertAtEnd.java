package program1c;
import java.util.LinkedList;
public class InsertAtEnd {
	
	
	    public static void main(String[] args) {
	        LinkedList<String> list = new LinkedList<>();
	        list.add("Red");
	        list.add("Green");

	        list.offerLast("Pink");  // adds at the end
	        System.out.println("Updated List: " + list);
	    }
	}


