package accessmodifiers.constructors;

public class EmployeeMain {

	public static void main(String[] args) {

		Employee e1 = new Employee(10, 101, "smith");
		e1.display();

		Employee e2 = new Employee(20, 102, "Allen");

		e2.display();
		String firstname = e1.name = "Saurabh";
		int id = e1.eid = 23;
		int mark = e1.marks = 100;
		System.out.println(firstname + " Pathak" + ":" + id + ":" + mark);

	}

}
