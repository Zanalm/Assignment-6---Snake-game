
import java.util.LinkedList;

public class DrawSnake {
	private LinkedList<TypeLinked> body = new LinkedList<TypeLinked>();

	public LinkedList<TypeLinked> getBody() {
		return body;
	}

	public TypeLinked getHead() {
		return body.getFirst();
	}

	public TypeLinked addTail(TypeLinked area) {
		this.body.addLast(area);
		return area;
	}

	public TypeLinked move(Direction direction) {
		TypeLinked node = null;
		int headX = this.body.getFirst().getX();
		int headY = this.body.getFirst().getY();
		switch (direction) {
		case UP:
			node = new TypeLinked(headX, headY - 1);
			break;
		case RIGHT:
			node = new TypeLinked(headX + 1, headY);
			break;
		case DOWN:
			node = new TypeLinked(headX, headY + 1);
			break;
		case LEFT:
			node = new TypeLinked(headX - 1, headY);
			break;
		}
		this.body.addFirst(node);
		return body.removeLast();
	}

	public boolean isEatFood(TypeLinked food) {
		TypeLinked head = body.getFirst();
		return Math.abs(head.getX() - food.getX()) + Math.abs(head.getY() - food.getY()) == 0;
	}

}