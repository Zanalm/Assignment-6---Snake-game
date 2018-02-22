
public class Main  {

	public static void main(String[] args) {
		UserInterface window = new UserInterface(null);
		window.run(); // the method declared in UserInterface
		SwingUtilities.invokeLater(new Main());
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
