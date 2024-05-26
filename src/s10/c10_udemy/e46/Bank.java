package s10.c10_udemy.e46;

import java.util.ArrayList;

public class Bank {
	private String name;
	private ArrayList<Branch> branches;

	public Bank(String name) {
		this.name = name;
		this.branches = new ArrayList<Branch>();
	}

	public boolean addBranch(String branchName) {
		Branch branch = findBranch(branchName);

		if (branch == null) {
			this.branches.add(new Branch(branchName));
			return true;
		}

		return false;
	}

	public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
		Branch branch = findBranch(branchName);
		if (branch != null) {
			return branch.newCustomer(customerName, initialTransaction);
		}
		return false;
	}

	public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
		Branch branch = findBranch(branchName);
		if (branch != null) {
			return branch.addCustomerTransaction(customerName, transaction);
		}
		return false;
	}

	private Branch findBranch(String branchName) {
		for (Branch branch : this.branches) {
			if (branch.getName().equalsIgnoreCase(branchName)) {
				return branch;
			}
		}
		return null;
	}

	public boolean listCustomers(String branchName, boolean printTransactions) {
		Branch branch = findBranch(branchName);
		if (branch == null) {
			return false;
		}

		System.out.printf("Customer details for branch %s%n", branch.getName());
		ArrayList<Customer> customers = branch.getCustomers();
		for (int i = 0; i < customers.size(); i++) {
			Customer customer = customers.get(i);

			System.out.printf("Customer: %s[%d]%n", customer.getName(), i + 1);
			if (printTransactions) {
				ArrayList<Double> transactions = customer.getTransactions();
				System.out.println("Transactions");
				for (int j = 0; j < transactions.size(); j++) {
					int transactionNumber = j + 1;
					System.out.printf("[%d] Amount %s%n", transactionNumber, transactions.get(j));

				}
			}

		}


		return true;
	}
}

