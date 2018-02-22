import java.util.Arrays;
import java.util.Random;

public class GameGrid {
	private boolean isCovered[][];
	private int scores = 0;

	private final int height;
	private final int width;

	private DrawSnake snake;
	private TypeLinked food;

	private Direction snakeDirection = Direction.RIGHT; // this sets in what direction the snake will start in
	public boolean isDirectionChanged = false;

	public GameGrid(int width, int height) {
		this.width = width;
		this.height = height;
		isCovered = new boolean[width][height];

		initSnake();
		createFood();
	}

	
}
