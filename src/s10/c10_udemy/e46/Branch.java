package s10.c10_udemy.e46;

import java.util.ArrayList;

public class Branch {
	private String name;
	private ArrayList<Customer> customers;

	public Branch(String name) {
		this.name = name;
		this.customers = new ArrayList<Customer>(2000);
	}

	public String getName() {
		return name;
	}

	public ArrayList<Customer> getCustomers() {
		return customers;
	}

	public boolean newCustomer(String name, double initialTransaction) {
		Customer customer = findCustomer(name);
		if (customer == null) {
			this.customers.add(new Customer(name, initialTransaction));
			return true;
		}
		return false;
	}

	public boolean addCustomerTransaction(String customerName, double transaction) {
		Customer customer = findCustomer(customerName);
		if (customer != null) {
			customer.addTransaction(transaction);
		}
		return false;
	}

	private Customer findCustomer(String customerName) {
		for (Customer customer : this.customers) {
			if (customer.getName().equalsIgnoreCase(customerName)) {
				return customer;
			}
		}
		return null;
	}
}
