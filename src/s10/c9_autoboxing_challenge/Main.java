package s10.c9_autoboxing_challenge;

import java.util.ArrayList;
import java.util.List;

record Customer(String name, ArrayList<Double> transactions) { //? Boxed ArrayList
	public Customer(String name, double initialdeposit) {
		this(name.toUpperCase(), new ArrayList<Double>(500));
		this.transactions.add(initialdeposit);

	}

}


public class Main {
	public static void main(String[] args) {
		Customer customer = new Customer("John", 100.00);
		System.out.println(customer);

		Bank bank = new Bank("chase");
		bank.addNewCustomer("jane a", 500.0);
		System.out.println(bank);

		bank.addTransaction("jane a", 100.0);
		bank.addTransaction("jane a", -50.75);
		bank.addTransaction("jane a", 200.0);
		bank.printStatement("jane a");

		bank.addTransaction("john", 100.0);
		bank.printStatement("john");

	}
}

class Bank {
	private String name;
	private ArrayList<Customer> customers = new ArrayList<>(5000);

	public Bank(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Bank{" + "name='" + name + '\'' + ", customers=" + customers + '}';
	}

	private Customer getCustomer(String name) {
		for (Customer customer : customers) {
			if (customer.name().equalsIgnoreCase(name)) {
				return customer;
			}
		}
		System.out.printf("Customer %s not found\n", name);
		return null;
	}

	public void addNewCustomer(String name, double initialDeposit) {
		if (getCustomer(name) == null) {
			Customer customer = new Customer(name, initialDeposit);
			customers.add(customer);
			System.out.println("new customer added: " + customer);
		}
	}

	public void addTransaction(String name, double transactionAmount) {
		Customer customer = getCustomer(name);
		if (customer != null) {
			customer.transactions().add(transactionAmount);
		}
	}

	public void printStatement(String name) {
		Customer customer = getCustomer(name);
		if (customer == null) {
			return;
		}

		System.out.println("-".repeat(30));
		System.out.println("Statement for " + customer.name());
		System.out.println("Transactions:");
		for (double d : customer.transactions()) { //? unboxing
			System.out.printf("€%10.2f (%s)%n", d, d > 0 ? "deposit" : "withdrawal");
		}

	}
}
