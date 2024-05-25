package S4_OOP_1_inheritance;

public class CylinderVolume {
	public static void main(String[] args) {
		Circle circle = new Circle(3.75);
		System.out.println("circle.radius= " + circle.getRadius());
		System.out.println("circle.area= " + circle.getArea());

		System.out.println();

		Cylinder cylinder = new Cylinder(5.55, 7.25);
		System.out.println("cylinder.radius= " + cylinder.getRadius());
		System.out.println("cylinder.height= " + cylinder.getHeight());
		System.out.println("cylinder.area= " + cylinder.getArea());
		System.out.println("cylinder.volume= " + cylinder.getVolume());

	}
}

class Circle {
	private double radius;

	public Circle(double radius) {
		this.radius = radius < 0 ? 0 : radius;
	}

	public double getRadius() {
		return radius;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}
}

class Cylinder extends Circle {
	private double height;

	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height < 0 ? 0 : height;
	}

	public double getHeight() {
		return height;
	}

	public double getVolume() {
		return getArea() * height;
	}
}
