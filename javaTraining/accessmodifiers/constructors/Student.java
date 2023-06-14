package accessmodifiers.constructors;

public class Student {

	String name;
	int rollNo;
	char grade;

	Student(String name, int rollNo, char grade) {
		this.name = name;
		this.rollNo = rollNo;
		this.grade = grade;
	}

	void display() {
		System.out.println(name + " " + rollNo + " " + grade);
	}

}
