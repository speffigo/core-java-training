package accessmodifiers.constructors;

public class Employee {
	private int deptno;
	int eid;
	public String name;
	protected int marks;

	public Employee(int deptno, int eid, String name) {
		super();
		this.deptno = deptno;
		this.eid = eid;
		this.name = name;
	}

	void display() {
		System.out.println(deptno + " " + eid + " " + name);
	}

}
