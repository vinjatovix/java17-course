package s5_oop_2_polymorphism.encapsulation;

public class Encapsulation1Bad {
	public static void main(String[] args) {
		Player player = new Player();
		// ! 2.- access public means if Player name changes to fullName, we have to change it everywhere.
		//		player.name = "Tim";
		player.fullName = "Tim";
		player.health = 20;
		player.weapon = "Sword";
		//! 3.- because Player has no constructor, we must set the fields manually.

		int damage = 10;
		player.loseHealth(damage);
		System.out.println("Remaining health = " + player.healthRemaining());

		damage = 11;
		player.health = 200; //! 1.- This is a problem. We should not be able to access the health field directly.
		player.loseHealth(damage);
		System.out.println("Remaining health = " + player.healthRemaining());

		player.restoreHealth(20);
		System.out.println("Remaining health = " + player.healthRemaining());

	}
}

class Player {
	//	public String name;
	//! 2.- changed name to fullName
	public String fullName;
	public int health;
	public String weapon;

	public void loseHealth(int damage) {
		this.health -= damage;
		if (this.health <= 0) {
			System.out.println("Player knocked out");

		}
	}

	public int healthRemaining() {
		return this.health;
	}

	public void restoreHealth(int extraHealth) {
		this.health += extraHealth;
		if (this.health > 100) {
			this.health = 100;
			System.out.println("Health restored to 100");
		}
	}
}
