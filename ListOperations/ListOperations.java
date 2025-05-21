package Hello;
import java.util.*;
public class ListOperations {
	
	
	    public static void main(String[] args) {
	        List<String> arrayList = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange"));
	        List<String> linkedList = new LinkedList<>(Arrays.asList("Apple", "Banana", "Orange"));

	        // 1. Adding element
	        arrayList.add("Mango");
	        linkedList.add("Mango");

	        // 2. Add at specific index
	        arrayList.add(1, "Grapes");
	        linkedList.add(1, "Grapes");

	        // 3. Adding multiple elements
	        List<String> moreFruits = Arrays.asList("Pineapple", "Guava");
	        arrayList.addAll(moreFruits);
	        linkedList.addAll(moreFruits);

	        // 4. Accessing elements
	        System.out.println("First element in ArrayList: " + arrayList.get(0));

	        // 5. Updating elements
	        arrayList.set(0, "Strawberry");

	        // 6. Removing elements
	        arrayList.remove("Guava");
	        linkedList.remove(2); // Remove by index

	        // 7. Searching elements
	        System.out.println("Contains 'Banana'? " + arrayList.contains("Banana"));

	        // 8. List size
	        System.out.println("ArrayList size: " + arrayList.size());

	        // 9. Iterating using for-each
	        for (String fruit : arrayList) {
	            System.out.println(fruit);
	        }

	        // 10. Using Iterator
	        Iterator<String> iterator = linkedList.iterator();
	        while (iterator.hasNext()) {
	            System.out.println("LinkedList item: " + iterator.next());
	        }

	        // 11. Sorting
	        Collections.sort(arrayList);
	        System.out.println("Sorted ArrayList: " + arrayList);

	        // 12. Sublist
	        List<String> subList = arrayList.subList(0, 2);
	        System.out.println("Sublist: " + subList);

	        // 13. Clearing the list
	        arrayList.clear();
	        System.out.println("ArrayList after clearing: " + arrayList);
	    }
	}


