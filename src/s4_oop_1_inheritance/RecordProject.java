package s4_oop_1_inheritance;

public class RecordProject {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			Student student = new Student("id" + i, switch (i) {
				case 0 -> "papa";
				case 1 -> "pepe";
				case 2 -> "pipi";
				case 3 -> "popo";
				case 4 -> "pupu";
				default -> "anon";
			}, "dob" + i, "classList" + i);

			LPAStudent lpaStudent = new LPAStudent("id" + i, switch (i) {
				case 0 -> "papa";
				case 1 -> "pepe";
				case 2 -> "pipi";
				case 3 -> "popo";
				case 4 -> "pupu";
				default -> "anon";
			}, "dob" + i, "classList" + i);

			//			System.out.println(student);
			//			System.out.println(lpaStudent);
		}

		Student pojoStudent = new Student("id0", "pojo", "dob0", "classList0");

		LPAStudent recordStudent = new LPAStudent("id0", "record", "dob0", "classList0");

		System.out.println(pojoStudent);
		System.out.println(recordStudent);

		System.out.println(pojoStudent.getName() + " " + pojoStudent.getClassList());

		System.out.println(recordStudent.name() + " " + recordStudent.classList());

		pojoStudent.setName("pojo2");
		pojoStudent.setClassList("classList2");

		//!	recordStudent is not mutable

	}
}

class Student {
	private String id;
	private String name;
	private String dateOfBirth;
	private String classList;

	public Student(String id, String name, String dateOfBirth, String classList) {
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.classList = classList;
	}

	@Override
	public String toString() {
		return "Student{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", dateOfBirth='" + dateOfBirth + '\'' + ", classList='" + classList + '\'' + '}';
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getClassList() {
		return classList;
	}

	public void setClassList(String classList) {
		this.classList = classList;
	}
}

record LPAStudent(String id, String name, String dateOfBirth, String classList) {
}

