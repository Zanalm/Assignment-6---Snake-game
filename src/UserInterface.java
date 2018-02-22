import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;

public class UserInterface {
	JFrame window = new JFrame("Snake Game");
	private final GameGrid grid;
	public final int DEFAULT_NODE_SIZE = 15;
	private final int DEFAULT_GRID_WIDTH = 30;
	private final int DEFAULT_GRID_HEIGHT = 30;
	private static JPanel canvas;

	public void showGameOverMessage() {
		JOptionPane.showMessageDialog(null, "Game Over!", "GameOver", JOptionPane.INFORMATION_MESSAGE);
	}



public void run() {

	Container contentPane = window.getContentPane();
	GameGrid grid = new GameGrid(DEFAULT_GRID_WIDTH, DEFAULT_GRID_HEIGHT);
	UserInterface UserInterface = new UserInterface();
	UserInterface.init();

	// set JPanel's size
	UserInterface.getCanvas().setPreferredSize(new Dimension(DEFAULT_GRID_WIDTH * UserInterface.DEFAULT_NODE_SIZE,
			DEFAULT_GRID_HEIGHT * UserInterface.DEFAULT_NODE_SIZE));
	// add JPanel to windows
	contentPane.add(UserInterface.getCanvas(), BorderLayout.CENTER);

	// draw grid and snake
	window.pack();
	window.setResizable(false);
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	window.setVisible(true);

	KeyListener gameController = new KeyAction(grid, UserInterface);
	window.addKeyListener(gameController);

	// start the thread
	new Thread((Runnable) gameController).start();

}

	public void draw() {
		canvas.repaint();
	}

	public JPanel getCanvas() {
		return canvas;
	}

	public void drawSnake(Graphics graphics, DrawSnake snake) {
		for (TypeLinked node : snake.getBody()) {
			drawSquare(graphics, node, Color.GREEN);
		}
	}

	public void drawFood(Graphics graphics, TypeLinked squareArea) {
		drawCircle(graphics, squareArea, Color.RED);
	}

	public void drawGridBackground(Graphics graphics) {
		for (int i = 0; i < grid.getWidth(); i++) {
			for (int j = 0; j < grid.getHeight(); j++) {
				drawSquare(graphics, new TypeLinked(i, j), new Color(127, 127, 127, 255));
			}
		}
	}

	private void drawSquare(Graphics graphics, TypeLinked squareArea, Color color) {
		graphics.setColor(color);
		int size = DEFAULT_NODE_SIZE;
		graphics.fillRect(squareArea.getX() * size, squareArea.getY() * size, size - 1, size - 1);
	}

	private void drawCircle(Graphics graphics, TypeLinked squareArea, Color color) {
		graphics.setColor(color);
		int size = DEFAULT_NODE_SIZE;
		graphics.fillOval(squareArea.getX() * size - 1, squareArea.getY() * size - 1, size, size);
	}
	
	
	
	public void init() {
		canvas = new JPanel() {
			private static final long serialVersionUID = 1L;

			@Override
			public void paintComponent(Graphics graphics) {
				drawGridBackground(graphics);
				drawSnake(graphics, grid.getSnake());
				drawFood(graphics, grid.getFood());
			}
		};
	}
}