package s5_oop_2_polymorphism.encapsulation;

public class Encapsulation2Good {
	public static void main(String[] args) {
		EnhancedPlayer tim = new EnhancedPlayer("Tim", 200, "Sword");
		System.out.println("Initial health is " + tim.healthRemaining());
		tim.loseHealth(150);
		System.out.println("Remaining health is " + tim.healthRemaining());
		tim.loseHealth(50);
		System.out.println("Remaining health is " + tim.healthRemaining());
		tim.restoreHealth(50);
		System.out.println("Remaining health is " + tim.healthRemaining());

	}
}

class EnhancedPlayer {
	private String fullName;
	private int healthPercentage;
	private String weapon;

	public EnhancedPlayer(String fullName) {
		this(fullName, 100, "Sword");
	}

	public EnhancedPlayer(String fullName, int healthPercentage, String weapon) {
		this.fullName = fullName;

		if (healthPercentage <= 0) {
			this.healthPercentage = 1;
		} else if (healthPercentage > 100) {
			this.healthPercentage = 100;
		} else {
			this.healthPercentage = healthPercentage;
		}

		this.weapon = weapon;
	}

	public void loseHealth(int damage) {
		this.healthPercentage -= damage;
		if (this.healthPercentage <= 0) {
			System.out.println("Player knocked out");
			this.healthPercentage = 0;

		}
	}

	public int healthRemaining() {
		return this.healthPercentage;
	}

	public void restoreHealth(int extraHealth) {
		this.healthPercentage += extraHealth;
		if (this.healthPercentage > 100) {
			this.healthPercentage = 100;
			System.out.println("Health restored to 100");
		}
	}
}
