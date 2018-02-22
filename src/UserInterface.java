import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;

// FIX A MESSAGES THAT FLASHES FOR 5 SECONDS, MAYBE A COUNT DOWN

public class UserInterface {
	JFrame frame = new JFrame("Snakity Snake");
//	JPanel HighSchorePanel = new JPanel();
//	JPanel addedItemPanel = new JPanel();
//	JPanel pricePanel = new JPanel();
//	JPanel cartItemsPanel = new JPanel();
//	JTextPane textPane = new JTextPane();
//	StyledDocument doc = textPane.getStyledDocument();
	Container contentPane = frame.getContentPane();
//	JLabel ItemsInCart;
//	JLabel totalCost;
//	JLabel latestPurchase;
	
	
	public void Initialization() {

		frame.setLayout(new GridLayout()); // maybe use FlowLayout instead??
		frame.setSize(500, 400); // sets the size for the window
		frame.setLocationRelativeTo(null); // centers the window
		contentPane.setBackground(Color.BLACK); // colors the background for the contentpane
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);        // Display the window
	}
	
	

}
