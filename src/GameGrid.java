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

	private boolean isMoveValid(Direction direction) {
		int headX = snake.getHead().getX();
		int headY = snake.getHead().getY();
		switch (direction) {
		case UP:
			headY--;
			break;
		case RIGHT:
			headX++;
			break;
		case DOWN:
			headY++;
			break;
		case LEFT:
			headX--;
			break;
		}
		if (headX < 0 || headX >= width || headY < 0 || headY >= height)
			return false;
		if (isCovered[headX][headY] == true)
			return false;
		isCovered[headX][headY] = true;
		return true;
	}

	public void changeDirection(Direction newDirection) {
		if (snakeDirection.compatibleWith(newDirection)) {
			snakeDirection = newDirection;
			isDirectionChanged = true;
		}
	}

	private DrawSnake initSnake() { // initial Snake has 3 TypeLinked
		snake = new DrawSnake();
		for (int i = 0; i < 3; i++) {
			snake.addTail(new TypeLinked(i + width / 2, height / 2));
			isCovered[i + width / 2][height / 2] = true;
		}
		return snake;
	}

	public TypeLinked createFood() {
		int x, y;
		do {
			x = new Random().nextInt(width);
			y = new Random().nextInt(height);
		} while (isCovered[x][y] == true);
		food = new TypeLinked(x, y);
		return food;
	}

	public DrawSnake getSnake() {
		return snake;
	}

	public TypeLinked getFood() {
		return food;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int getScore() {
		return scores;
	}
}
