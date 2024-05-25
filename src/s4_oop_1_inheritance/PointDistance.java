package s4_oop_1_inheritance;

public class PointDistance {
	public static void main(String[] args) {
		Point first = new Point(6, 5);
		Point second = new Point(3, 1);
		System.out.println("distance(0, 0)= " + first.distance());
		System.out.println("distance(second)= " + first.distance(second));
		System.out.println("distance(2, 2)= " + first.distance(2, 2));

		Point point = new Point();
		System.out.println("distance()= " + point.distance());

	}
}

class Point {
	private int x;
	private int y;

	public Point() {
		this(0, 0);
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public double distance() {
		return Math.sqrt((0 - x) * (0 - x) + (0 - y) * (0 - y));
	}

	public double distance(int x, int y) {
		return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
	}

	public double distance(Point another) {
		return Math.sqrt((another.x - this.x) * (another.x - this.x) + (another.y - this.y) * (another.y - this.y));
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}