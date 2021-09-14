package Collection;

public class Emp {

	int id;
	String name;
	int Sal;
	public Emp(int id, String name, int sal) {
		super();
		this.id = id;
		this.name = name;
		Sal = sal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return Sal;
	}
	public void setSal(int sal) {
		Sal = sal;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", Sal=" + Sal + "]";
	}
	
	
	
}
