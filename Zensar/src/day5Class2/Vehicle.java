package day5Class2;

public class Vehicle extends Person{

	int vid;
	String vname;
	
	Vehicle(){
		
		
	}
	Vehicle(int vid, String vname) {
		
		this.vid = vid;
		this.vname = vname;
		
		
	}
	


@Override
	public String toString() {
		return "Vehicle [vid=" + vid + ", vname=" + vname + "]";
	}

public static void main(String[] args) {
	Person p1= new Person(1, "ABC",Vehicle);
	Vehicle v= new Vehicle(12, "Honda");
	
}
}
