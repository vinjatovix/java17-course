package s4_oop_1_inheritance;

public class Inheritance {
	public static void main(String[] args) {

		Animal animal = new Animal("Animal", "Medium", 50);
		doAnimalStuff(animal, "slow");

		Dog dog = new Dog();
		doAnimalStuff(dog, "fast");

		Dog yorkie = new Dog("Yorkie", 10);
		doAnimalStuff(yorkie, "fast");

		Dog retriever = new Dog("Golden Retriever", 70, "floppy", "swimmer");
		doAnimalStuff(retriever, "slow");

		Dog wolf = new Dog("Wolf", 100);
		doAnimalStuff(wolf, "slow");

		Fish goldie = new Fish("Goldfish", 0.25, 2, 3);
		doAnimalStuff(goldie, "fast");
	}

	public static void doAnimalStuff(Animal animal, String speed) {
		animal.move(speed);
		animal.makeNoise();
		System.out.println(animal);
		System.out.println("_________________________");
	}
}

class Animal {

	protected String type;
	private String size;
	private double weight;

	public Animal() {

	}

	public Animal(String type, String size, double weight) {
		this.type = type;
		this.size = size;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Animal{" + "type='" + type + '\'' + ", size='" + size + '\'' + ", weight=" + weight + '}';
	}

	public void move(String speed) {
		System.out.println(this.type + " moves " + speed);
	}

	public void makeNoise() {
		System.out.println(this.type + " is making noise.");
	}
}

class Dog extends Animal {
	private String earShape;
	private String tailShape;

	public Dog() {
		super("Mutt", "big", 50);
	}

	public Dog(String type, double weight) {
		this(type, weight, "pointy", "curly");
	}

	public Dog(String type, double weight, String earShape, String tailShape) {
		super(type, weight < 15 ? "small" : weight < 35 ? "medium" : "big", weight);
		this.earShape = earShape;
		this.tailShape = tailShape;
	}

	@Override
	public String toString() {
		return "Dog{" + "earShape='" + earShape + '\'' + ", tailShape='" + tailShape + '\'' + "} " + super.toString();
	}

	public void makeNoise() {
		if (type == "Wolf") {
			System.out.println("Wolf is howling.");
		}
		bark();
		System.out.println();

	}

	@Override
	public void move(String speed) {
		super.move(speed);
		if (speed.equals("fast")) {
			run();
			bark();
		} else {
			walk();
			wagTail();
		}

	}

	private void bark() {
		System.out.println(this.type + " is barking.");
	}

	public void run() {
		System.out.println(this.type + " is running.");
	}

	private void walk() {
		System.out.println(this.type + " is walking.");
	}

	private void wagTail() {
		System.out.println(this.type + " is wagging tail.");
	}
}

class Fish extends Animal {
	private int gills;
	private int fins;

	public Fish(String type, double weight, int gills, int fins) {
		super(type, "small", weight);
		this.gills = gills;
		this.fins = fins;
	}

	private void moveMuscles() {
		System.out.println("muscles moving.");
	}

	private void moveBackFin() {
		System.out.println("backFin moving.");
	}

	@Override
	public void move(String speed) {
		super.move(speed);
		moveMuscles();
		if (speed.equals("fast")) {
			moveBackFin();
		}
		System.out.println();
	}

	@Override
	public String toString() {
		return "Fish{" + "gills=" + gills + ", fins=" + fins + "} " + super.toString();
	}
}

