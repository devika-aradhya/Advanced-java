package program5d;
import javax.swing.*;
import java.awt.*;
public class CMYTabbedPane {
	

	
	    public static void main(String[] args) {
	        JFrame frame = new JFrame("CMY Tabs");
	        JTabbedPane tabs = new JTabbedPane();

	        JPanel cyanPanel = new JPanel();
	        cyanPanel.setBackground(Color.CYAN);

	        JPanel magentaPanel = new JPanel();
	        magentaPanel.setBackground(Color.MAGENTA);

	        JPanel yellowPanel = new JPanel();
	        yellowPanel.setBackground(Color.YELLOW);

	        tabs.add("Cyan", cyanPanel);
	        tabs.add("Magenta", magentaPanel);
	        tabs.add("Yellow", yellowPanel);

	        frame.add(tabs);
	        frame.setSize(400, 300);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	    }
	}



