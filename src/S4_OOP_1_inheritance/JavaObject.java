package S4_OOP_1_inheritance;

public class JavaObject extends Object{
	public static void main(String[] args) {

		Student2 student = new Student2("John", 20);
		System.out.println(student);

		PrimarySchoolStudent primarySchoolStudent = new PrimarySchoolStudent("Jane", 10, "Mary");
		System.out.println(primarySchoolStudent);

	}
}

class Student2 {
	private String name;
	private int age;

	public Student2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + " is " + age + " years old.";
	}
}

class PrimarySchoolStudent extends Student2 {
	private String parentName;

	public PrimarySchoolStudent(String name, int age, String parentName) {
		super(name, age);
		this.parentName = parentName;
	}

	@Override
	public String toString() {
		return parentName + "'s child " + super.toString();
	}
}

