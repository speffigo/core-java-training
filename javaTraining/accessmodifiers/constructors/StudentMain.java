package accessmodifiers.constructors;

public class StudentMain {

	public static void main(String[] args) {
		Student s1 = new Student("srikant", 101, 'A');
		Student s2 = new Student("siri", 102, 'B');
		s1.display();
		s2.display();
	}

}
