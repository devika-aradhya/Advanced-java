package program4c;
import javax.swing.*;
import java.awt.event.*;

public class ImageButtonExample {
	
	    public static void main(String[] args) {
	        JFrame frame = new JFrame("Image Button Example");
	        JLabel label = new JLabel("", JLabel.CENTER);

	        // Replace with your image file paths
	        ImageIcon digitalIcon = new ImageIcon("digital.png");
	        ImageIcon hourGlassIcon = new ImageIcon("hourglass.png");

	        JButton digitalButton = new JButton("Digital Clock", digitalIcon);
	        JButton hourGlassButton = new JButton("Hour Glass", hourGlassIcon);

	        digitalButton.setBounds(30, 50, 200, 80);
	        hourGlassButton.setBounds(250, 50, 200, 80);
	        label.setBounds(50, 150, 400, 40);

	        digitalButton.addActionListener(e -> label.setText("Digital Clock is pressed"));
	        hourGlassButton.addActionListener(e -> label.setText("Hour Glass is pressed"));

	        frame.add(digitalButton);
	        frame.add(hourGlassButton);
	        frame.add(label);

	        frame.setSize(500, 300);
	        frame.setLayout(null);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	    }
	}


