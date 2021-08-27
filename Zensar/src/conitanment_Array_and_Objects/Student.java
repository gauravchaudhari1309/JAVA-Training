package conitanment_Array_and_Objects;

 class Student {

	int sid;
	String sname;
	Course cr[];
	public Student(int sid, String sname, Course[] cr) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.cr=cr;
	}

}     
class Course{

	String cname;
	int fees;
	public Course(String cname, int fees) {
		super();
		this.cname = cname;
		this.fees = fees;
	}
	
}







