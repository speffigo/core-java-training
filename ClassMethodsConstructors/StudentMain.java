package ClassMethodsConstructors;

public class StudentMain {
	
	
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		
		
		s1.getInfo("srikanth", 101, 'A');
		s2.getInfo("siri", 102, 'B');
		s1.display();
		s2.display();
	}

}
