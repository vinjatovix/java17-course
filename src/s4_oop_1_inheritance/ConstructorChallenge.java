package s4_oop_1_inheritance;

public class ConstructorChallenge {
	public static void main(String[] args) {

		Customer customer = new Customer("John Doe", 1000, "j@m.com");
		System.out.println("Name: " + customer.getName());
		System.out.println("Credit limit: " + customer.getCreditLimit());
		System.out.println("Email: " + customer.getEmail());

		System.out.println();

		Customer customer2 = new Customer();
		System.out.println("Name: " + customer2.getName());
		System.out.println("Credit limit: " + customer2.getCreditLimit());
		System.out.println("Email: " + customer2.getEmail());

		System.out.println();

		Customer customer3 = new Customer("Jane Doe", "j@m.com");
		System.out.println("Name: " + customer3.getName());
		System.out.println("Credit limit: " + customer3.getCreditLimit());
		System.out.println("Email: " + customer3.getEmail());
	}
}

class Customer {
	private String name;
	private double creditLimit;
	private String email;

	public Customer() {
		this("Default name", "Default email");
	}

	public Customer(String name, String email) {
		this(name, 1000, email);
	}

	public Customer(String name, double creditLimit, String email) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}


	public String getName() {
		return name;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public String getEmail() {
		return email;
	}
}
