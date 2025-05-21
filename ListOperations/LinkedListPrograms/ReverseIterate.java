package program1c;
import java.util.LinkedList;
import java.util.Iterator;


public class ReverseIterate {
	
	
	    public static void main(String[] args) {
	        LinkedList<String> list = new LinkedList<>();
	        list.add("Red");
	        list.add("Green");
	        list.add("Blue");

	        Iterator<String> descIter = list.descendingIterator();
	        while (descIter.hasNext()) {
	            System.out.println(descIter.next());
	        }
	    }
	}



