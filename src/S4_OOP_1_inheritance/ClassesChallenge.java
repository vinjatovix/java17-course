package S4_OOP_1_inheritance;

public class ClassesChallenge {
	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount();
		bankAccount.setAccountNumber("123456789");
		bankAccount.setBalance(100.0);
		bankAccount.setCustomerName("John Doe");
		bankAccount.setEmail("jd@mail.com");
		bankAccount.setPhoneNumber("1234567890");

		bankAccount.deposit(50.5);
		bankAccount.withdraw(100);
		bankAccount.withdraw(55);

		System.out.println();

		System.out.println("Account number: " + bankAccount.getAccountNumber());
		System.out.println("Balance: " + bankAccount.getBalance());
		System.out.println("Customer name: " + bankAccount.getCustomerName());
		System.out.println("Email: " + bankAccount.getEmail());
		System.out.println("Phone number: " + bankAccount.getPhoneNumber());

		System.out.println();

		BankAccountWithConstructor pabloAccount = new BankAccountWithConstructor("Pablo", "111111111", 100.0, "v@mail.com", "1234567890");
		System.out.println("Account number: " + pabloAccount.getAccountNumber());
		System.out.println("Balance: " + pabloAccount.getBalance());
		System.out.println("Customer name: " + pabloAccount.getCustomerName());
		System.out.println("Email: " + pabloAccount.getEmail());
		System.out.println("Phone number: " + pabloAccount.getPhoneNumber());

		System.out.println();

		BankAccountWithConstructor defaultAccount = new BankAccountWithConstructor();

		System.out.println("Account number: " + defaultAccount.getAccountNumber());
		System.out.println("Balance: " + defaultAccount.getBalance());
		System.out.println("Customer name: " + defaultAccount.getCustomerName());
		System.out.println("Email: " + defaultAccount.getEmail());
		System.out.println("Phone number: " + defaultAccount.getPhoneNumber());

		System.out.println();

		BankAccountWithConstructor bobAccount = new BankAccountWithConstructor("Bob", "mail@mail.com", "1234567890");
		System.out.println("Customer name: " + bobAccount.getCustomerName());
		System.out.println("Account number: " + bobAccount.getAccountNumber());
	}
}

class BankAccount {
	private String accountNumber;
	private double balance;
	private String customerName;
	private String email;
	private String phoneNumber;

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void deposit(double depositAmount) {
		if (depositAmount < 0) {
			System.out.println("Invalid deposit amount");
			return;
		}
		this.balance += depositAmount;
		System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
	}

	public void withdraw(double withdrawAmount) {
		if (withdrawAmount < 0) {
			System.out.println("Invalid withdraw amount");
			return;
		}
		if (this.balance - withdrawAmount < 0) {
			System.out.println("Only " + this.balance + " available. Withdrawal not processed");
			return;
		}
		this.balance -= withdrawAmount;
		System.out.println("Withdrawal of " + withdrawAmount + " processed. Remaining balance is " + this.balance);
	}
}

class BankAccountWithConstructor {
	private String accountNumber;
	private double balance;
	private String customerName;
	private String email;
	private String phoneNumber;

	public BankAccountWithConstructor() {
		this("Default name", "Default account number", 0.0, "Default email", "Default phone number");
	}

	public BankAccountWithConstructor(String customerName, String accountNumber, double balance, String email, String phoneNumber) {
		this.customerName = customerName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public BankAccountWithConstructor(String customerName, String email, String phoneNumber) {
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.accountNumber = "Default account number";
		this.balance = 0.0;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void deposit(double depositAmount) {
		if (depositAmount < 0) {
			System.out.println("Invalid deposit amount");
			return;
		}
		this.balance += depositAmount;
		System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
	}

	public void withdraw(double withdrawAmount) {
		if (withdrawAmount < 0) {
			System.out.println("Invalid withdraw amount");
			return;
		}
		if (this.balance - withdrawAmount < 0) {
			System.out.println("Only " + this.balance + " available. Withdrawal not processed");
			return;
		}
		this.balance -= withdrawAmount;
		System.out.println("Withdrawal of " + withdrawAmount + " processed. Remaining balance is " + this.balance);
	}
}
