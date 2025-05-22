package program1c;
import java.util.Collections;
import java.util.LinkedList;


public class SwapElements {

	    public static void main(String[] args) {
	        LinkedList<String> list = new LinkedList<>();
	        list.add("Red");
	        list.add("Green");
	        list.add("Blue");

	        Collections.swap(list, 0, 2);
	        System.out.println("After swapping first and third: " + list);
	    }
	}



