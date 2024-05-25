package s5_oop_2_polymorphism.challenges;

public class PolymorphismChallenge {
	public static void main(String[] args) {
		Car car = new Car("2022 Toyota Camry");
		runRace(car);

		System.out.println();

		Car ferrari = new GasPoweredCar("2022 Ferrari 488 GTB", 10.5, 8);
		runRace(ferrari);

		Car tesla = new ElectricCar("2022 Tesla Model S", 568, 75);
		runRace(tesla);

		Car ferrariHybrid = new HybridCar("2022 Ferrari SF90 Stradale", 10, 7, 8);
		runRace(ferrariHybrid);

	}

	public static void runRace(Car car) {
		car.startEngine();
		car.drive();
	}
}

class Car {
	private String description;

	public Car(String description) {
		this.description = description;
	}

	public void startEngine() {
		System.out.println("Car -> startEngine");
	}

	protected void runEngine() {
		System.out.println("Car -> runEngine");
	}

	public void drive() {
		System.out.println("Car -> driving, type is " + getClass().getSimpleName());
		runEngine();
	}
}

class GasPoweredCar extends Car {
	private int cylinders = 6;
	private double avgKmPerLitre;

	public GasPoweredCar(String description) {
		super(description);
	}

	public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
		super(description);
		this.avgKmPerLitre = avgKmPerLitre;
		this.cylinders = cylinders;
	}

	@Override
	public void startEngine() {
		System.out.printf("Gas -> All %d cylinders are firing%n", cylinders);

	}

	@Override
	protected void runEngine() {
		System.out.printf("Gas -> Usage exceeds the average of %.2f Km/l%n", avgKmPerLitre);
	}
}

class ElectricCar extends Car {
	private int batterySize = 6;
	private double avgKmPerCharge;

	public ElectricCar(String description) {
		super(description);
	}

	public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
		super(description);
		this.avgKmPerCharge = avgKmPerCharge;
		this.batterySize = batterySize;
	}

	@Override
	public void startEngine() {
		System.out.printf("BEV -> switch %d kWh battery on%n", batterySize);

	}

	@Override
	protected void runEngine() {
		System.out.printf("BEV -> Usage under the average of %.2f Km/charge%n", avgKmPerCharge);
	}
}


class HybridCar extends Car {
	private double avgKmPerLitre;
	private int batterySize;
	private int cylinders;

	public HybridCar(String description) {
		super(description);
	}

	public HybridCar(String description, int avgKmPerLitre, int batterySize, int cylinders) {
		super(description);
		this.avgKmPerLitre = avgKmPerLitre;
		this.batterySize = batterySize;
		this.cylinders = cylinders;
	}


	@Override
	public void startEngine() {
		System.out.printf("Hybrid -> All %d cylinders are firing%n", cylinders);
		System.out.printf("Hybrid -> switch %d kWh battery on%n", batterySize);
	}

	@Override
	protected void runEngine() {
		System.out.printf("Hybrid -> usage below average of %.2f Km/l%n", avgKmPerLitre);
	}
}