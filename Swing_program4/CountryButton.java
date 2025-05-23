package program4b;
import javax.swing.*;
import java.awt.event.*;

public class CountryButton {
	
	    public static void main(String[] args) {
	        JFrame frame = new JFrame("Country Press");
	        JButton indiaBtn = new JButton("India");
	        JButton srilankaBtn = new JButton("Srilanka");
	        JLabel label = new JLabel("", JLabel.CENTER);

	        indiaBtn.setBounds(50, 100, 100, 40);
	        srilankaBtn.setBounds(200, 100, 100, 40);
	        label.setBounds(50, 150, 300, 40);

	        indiaBtn.addActionListener(e -> label.setText("India is pressed"));
	        srilankaBtn.addActionListener(e -> label.setText("Srilanka is pressed"));

	        frame.add(indiaBtn);
	        frame.add(srilankaBtn);
	        frame.add(label);

	        frame.setSize(400, 300);
	        frame.setLayout(null);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	    }
	}



