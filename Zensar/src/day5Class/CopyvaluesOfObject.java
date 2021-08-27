package day5Class;

public class CopyvaluesOfObject {

	 int refno;  
	 String refname;  
	 CopyvaluesOfObject(int i, String n) {  
	  refno = i;  
	  refname = n;  
	 }  
	 CopyvaluesOfObject(CopyvaluesOfObject e) {  
	  refno = e.refno;  
	  refname = e.refname;  
	 }  
	 void display() {  
	  System.out.println(refno + " " + refname);  
	 }  
	 public static void main(String[] args) {  
	  CopyvaluesOfObject e1 = new CopyvaluesOfObject(123, "ABC");  
	  CopyvaluesOfObject e2 = new CopyvaluesOfObject(e1);  
	  e1.display();  
	  e2.display();
}
}