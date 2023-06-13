package ClassMethodsConstructors;

public class Student {

	String name;
	int rollNo;
	char grade;
	Student(){
		if(true) {System.out.print(false);}
		
	}
	
	void display() {
		System.out.println(name+" "+rollNo+" "+grade);
	}
	
	void getInfo(String name,int rollNo,char grade) {
		this.name=name;
		this.rollNo=rollNo;
		this.grade=grade;
	}
	
}
