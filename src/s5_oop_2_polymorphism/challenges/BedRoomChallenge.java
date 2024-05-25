package s5_oop_2_polymorphism.challenges;

public class BedRoomChallenge {
	public static void main(String[] args) {
		Wall wall1 = new Wall("West");
		Wall wall2 = new Wall("East");
		Wall wall3 = new Wall("South");
		Wall wall4 = new Wall("North");

		Ceiling ceiling = new Ceiling(12, 55);

		Bed bed = new Bed("Modern", 4, 3, 2, 1);

		Lamp lamp = new Lamp("Classic", false, 75);

		Bedroom bedroom = new Bedroom("Tim's", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

		bedroom.makeBed();

		bedroom.getLamp().turnOn();

	}
}

class Bedroom {

	private String name;
	private Wall wall1;
	private Wall wall2;
	private Wall wall3;
	private Wall wall4;
	private Ceiling ceiling;
	private Bed bed;
	private Lamp lamp;

	public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
		this.name = name;
		this.wall1 = wall1;
		this.wall2 = wall2;
		this.wall3 = wall3;
		this.wall4 = wall4;
		this.ceiling = ceiling;
		this.bed = bed;
		this.lamp = lamp;
	}

	public Lamp getLamp() {
		return this.lamp;
	}

	public void makeBed() {
		System.out.print("Bedroom -> Making bed");
		bed.make();
	}
}

class Wall {

	private String direction;

	public Wall(String direction) {
		this.direction = direction;
	}

	public String getDirection() {
		return direction;
	}
}

class Ceiling {

	private int height;
	private int paintedColor;

	public Ceiling(int height, int paintedColor) {
		this.height = height;
		this.paintedColor = paintedColor;
	}

	public int getHeight() {
		return height;
	}

	public int getPaintedColor() {
		return paintedColor;
	}
}

class Bed {

	private String style;
	private int pillows;
	private int height;
	private int sheets;
	private int quilt;

	public Bed(String style, int pillows, int height, int sheets, int quilt) {
		this.style = style;
		this.pillows = pillows;
		this.height = height;
		this.sheets = sheets;
		this.quilt = quilt;
	}

	public void make() {
		System.out.print(" | Bed -> Making");
	}

	public String getStyle() {
		return style;
	}

	public int getPillows() {
		return pillows;
	}

	public int getHeight() {
		return height;
	}

	public int getSheets() {
		return sheets;
	}

	public int getQuilt() {
		return quilt;
	}
}

class Lamp {

	private String style;
	private boolean battery;
	private int globRating;

	public Lamp(String style, boolean battery, int globRating) {
		this.style = style;
		this.battery = battery;
		this.globRating = globRating;
	}

	public void turnOn() {
		System.out.print(" | Lamp -> Turning on");
	}

	public String getStyle() {
		return style;
	}

	public boolean isBattery() {
		return battery;
	}

	public int getGlobRating() {
		return globRating;
	}
}