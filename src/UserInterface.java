import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

//THIS IS NOT I USE FOR THE MOMENT!!!

/*every new second will have a new print-out
 * create the snake and the controls for it */
public class UserInterface {
	JFrame frame = new JFrame("Snakity Snake");
	Container contentPane = frame.getContentPane();
	
	
	public void Initialization() {
		frame.setLayout(new GridLayout()); // maybe use FlowLayout instead??
		frame.setSize(500, 400); // sets the size for the window
		frame.setLocationRelativeTo(null); // centers the window
		contentPane.setBackground(Color.BLACK); // colors the background for the contentpane
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setVisible(true);        // Display the window
	}
	
	
	

	

}
