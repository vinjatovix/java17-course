package s5_oop_2_polymorphism.challenges;

public class PolymorphismUdemyChallenge {
	public static void main(String[] args) {
		UdemyCar car = new UdemyCar(8, "Base car");
		System.out.println(car.startEngine());
		System.out.println(car.accelerate());
		System.out.println(car.brake());

		Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
		System.out.println(mitsubishi.startEngine());
		System.out.println(mitsubishi.accelerate());
		System.out.println(mitsubishi.brake());

		Ford ford = new Ford(6, "Ford Falcon");
		System.out.println(ford.startEngine());
		System.out.println(ford.accelerate());
		System.out.println(ford.brake());

		Holden holden = new Holden(6, "Holden Commodore");
		System.out.println(holden.startEngine());
		System.out.println(holden.accelerate());
		System.out.println(holden.brake());

	}
}

class UdemyCar {
	private boolean engine = true;
	private int cylinders;
	private String name;
	private int wheels =4;

	public UdemyCar(int cylinders, String name) {
		this.cylinders = cylinders;
		this.name = name;
	}

	public String startEngine() {
		return "Car -> startEngine()";
	}

	public String accelerate() {
		return "Car -> accelerate()";
	}

	public String brake() {
		return "Car -> brake()";
	}

	public int getCylinders() {
		return cylinders;
	}

	public String getName() {
		return name;
	}
}

class Mitsubishi extends UdemyCar {
	public Mitsubishi(int cylinders, String name) {
		super(cylinders, name);
	}

	@Override
	public String startEngine() {
		return "Mitsubishi -> startEngine()";
	}

	@Override
	public String accelerate() {
		return "Mitsubishi -> accelerate()";
	}

	@Override
	public String brake() {
		return "Mitsubishi -> brake()";
	}
}

class Ford extends UdemyCar {
	public Ford(int cylinders, String name) {
		super(cylinders, name);
	}

	@Override
	public String startEngine() {
		return "Ford -> startEngine()";
	}

	@Override
	public String accelerate() {
		return "Ford -> accelerate()";
	}

	@Override
	public String brake() {
		return "Ford -> brake()";
	}
}

class Holden extends UdemyCar {
	public Holden(int cylinders, String name) {
		super(cylinders, name);
	}

	@Override
	public String startEngine() {
		return "Holden -> startEngine()";
	}

	@Override
	public String accelerate() {
		return "Holden -> accelerate()";
	}

	@Override
	public String brake() {
		return "Holden -> brake()";
	}
}