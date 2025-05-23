package program5a;
import javax.swing.*;
import java.awt.*;

public class ColorTabbedPane {
	
	    public static void main(String[] args) {
	        JFrame frame = new JFrame("Color Tabs");
	        JTabbedPane tabs = new JTabbedPane();

	        JPanel redPanel = new JPanel();
	        redPanel.setBackground(Color.RED);

	        JPanel bluePanel = new JPanel();
	        bluePanel.setBackground(Color.BLUE);

	        JPanel greenPanel = new JPanel();
	        greenPanel.setBackground(Color.GREEN);

	        tabs.add("RED", redPanel);
	        tabs.add("BLUE", bluePanel);
	        tabs.add("GREEN", greenPanel);

	        frame.add(tabs);
	        frame.setSize(400, 300);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	    }
	}



