package program1c;
import java.util.LinkedList;
import java.util.ListIterator;

public class IterateFromSecond {
	
	
	    public static void main(String[] args) {
	        LinkedList<String> list = new LinkedList<>();
	        list.add("Red");
	        list.add("Green");
	        list.add("Blue");
	        list.add("Yellow");

	        ListIterator<String> iterator = list.listIterator(1); // index 1 = 2nd element
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }
	}


