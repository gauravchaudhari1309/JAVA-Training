package day5InheritanceAndContaintment;

public abstract class Teacher {
	
int tid;
String tname;
long Mno;

Teacher(int tid, String tname, long mno) {
	
	this.tid = tid;
	this.tname = tname;
	Mno = mno;
}
 public Teacher() {
	// TODO Auto-genera	ted constructor stub
}
abstract void salary();

}
