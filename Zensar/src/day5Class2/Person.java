package day5Class2;

public class Person {

	int id;
	String name;
	Vehicle v;
	
	Person(){
		
		
	}
	Person(int id, String name, Vehicle v) {
		
		this.id = id;
		this.name = name;
		this.v = v;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", v=" + v + "]";
	}
	
	
}
