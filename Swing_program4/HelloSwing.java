package program4a;
import javax.swing.*;
import java.awt.*;
public class HelloSwing {
	

	
	    public static void main(String[] args) {
	        JFrame frame = new JFrame("Hello Swing");
	        JLabel label = new JLabel("Hello! VI C , Welcome to Swing Programming", JLabel.CENTER);
	        label.setFont(new Font("Plain", Font.PLAIN, 32));
	        label.setForeground(Color.BLUE);
	        frame.add(label);
	        frame.setSize(700, 200);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	    }
	}


