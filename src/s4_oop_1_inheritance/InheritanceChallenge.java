package s4_oop_1_inheritance;

import java.util.Calendar;

public class InheritanceChallenge {
	public static void main(String[] args) {
		Employee employee = new Employee("John", "01/01/1990", "01/01/2010");
		System.out.println(employee);
		System.out.println("age: " + employee.getAge());
		System.out.println("pay: " + employee.calculatePay());
		System.out.println();

		SalariedEmployee jane = new SalariedEmployee("Jane", "01/01/1995", "01/01/2015", 50000);
		System.out.println(jane);
		System.out.println("age: " + jane.getAge());
		System.out.println("pay: " + jane.calculatePay());
		jane.retire();
		System.out.println("pay: " + jane.calculatePay());
		System.out.println();



		HourlyEmployee jack = new HourlyEmployee("Jack", "01/01/1990", "01/01/2010", 20);
		System.out.println(jack);
		System.out.println("age: " + jack.getAge());
		System.out.println("pay: " + jack.calculatePay());
		System.out.println("double time pay: " + jack.getDoubleTimePay());
		System.out.println();


	}
}

class Worker {
	private String name;
	private String birthDate;
	protected String endDate;

	public Worker(String name, String birthDate) {
		this.name = name;
		this.birthDate = birthDate;
	}

	public int getAge() {
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		int birthYear = Integer.parseInt(birthDate.substring(6));

		return currentYear - birthYear;
	}

	public double calculatePay() {
		return 0.0;
	}

	public void terminate(String endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "Worker{" + "name='" + name + '\'' + ", birthDate='" + birthDate + '\'' + ", endDate='" + endDate + '\'' + '}';
	}
}

class Employee extends Worker {
	private long employeeId;
	private String hireDate;

	private static int employeeNo = 1;

	public Employee(String name, String birthDate, String hireDate) {
		super(name, birthDate);
		this.employeeId = Employee.employeeNo++;
		this.hireDate = hireDate;
	}

	@Override
	public String toString() {
		return "employee{" + "employeeId=" + employeeId + ", hireDate='" + hireDate + '\'' + ", endDate='" + endDate + '\'' + "} " + super.toString();
	}
}

class SalariedEmployee extends Employee {
	private double annualSalary;
	private boolean isRetired;

	public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
		super(name, birthDate, hireDate);
		this.annualSalary = annualSalary;
		this.isRetired = true;
	}

	@Override
	public double calculatePay() {
		double paycheck = annualSalary / 12;
		double adjustedPay = isRetired ? paycheck * 0.8 : paycheck;

		return adjustedPay;

	}

	public void retire() {
		terminate("01/01/2020");
		isRetired = true;
	}
}

class HourlyEmployee extends Employee {
	private double hourlyRate;

	public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyRate) {
		super(name, birthDate, hireDate);
		this.hourlyRate = hourlyRate;
	}

	@Override
	public double calculatePay() {
		return 40 * hourlyRate;
	}

	public double getDoubleTimePay() {
		return 2 * calculatePay();
	}
}