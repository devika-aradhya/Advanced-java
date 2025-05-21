package program5a;
import javax.swing.*;
import javax.swing.event.*;

public class CountryList {
	
	    public static void main(String[] args) {
	        JFrame frame = new JFrame("Country List");
	        String[] countries = {"USA", "India", "Vietnam", "Canada", "Denmark", "France", 
	                              "Great Britain", "Japan", "Africa", "Greenland", "Singapore"};
	        JList<String> list = new JList<>(countries);

	        list.addListSelectionListener(e -> {
	            if (!e.getValueIsAdjusting()) {
	                for (String country : list.getSelectedValuesList()) {
	                    System.out.println("Selected: " + country);
	                }
	            }
	        });

	        JScrollPane pane = new JScrollPane(list);
	        frame.add(pane);

	        frame.setSize(300, 200);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	    }
	}


