package day6Methods;

public class Emp {

	private int eId;
	private String eName;
	private int salary;
	private Dept dept;
	
	public Emp() {
		
		this.eId = eId;
		this.eName = eName;
		this.salary = salary;
		this.dept = dept;
		
		
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}
	
	
}
