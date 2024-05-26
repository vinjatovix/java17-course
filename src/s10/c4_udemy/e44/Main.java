package s10.c4_udemy.e44;

public class Main {
	public static void main(String[] args) {
		MobilePhone mobilePhone = new MobilePhone("1234567890");
		mobilePhone.addNewContact(Contact.createContact("John", "1234567890"));
		mobilePhone.addNewContact(Contact.createContact("Paul", "1234567891"));
		mobilePhone.printContacts();

		Contact paul = mobilePhone.queryContact("Paul");
		mobilePhone.updateContact(paul, Contact.createContact("Paul", "1234567892"));
		mobilePhone.removeContact(Contact.createContact("John", "1234567890"));
		mobilePhone.addNewContact(Contact.createContact("George", "1234567893"));

		System.out.println(mobilePhone.queryContact("George").getPhoneNumber());

		mobilePhone.addNewContact(Contact.createContact("Ringo", "1234567894"));

		mobilePhone.printContacts();

	}
}
