package Array;

public class Student {
	
private int id;
private String name;
private int per;

public Student(){
	
	
}


Student(int id, String name, int per) {
	super();
	this.id = id;
	this.name = name;
	this.per = per;
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


public int getPer() {
	return per;
}


public void setPer(int per) {
	this.per = per;
}



}
