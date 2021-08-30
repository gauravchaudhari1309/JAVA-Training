package day5InheritanceAndContaintment;
/*Create a class Student with 4 variables called as rollNo, admissionNo, age, courseId.
  Each of the variables should have one of the access modifier -public, protected, no-access-modifier and private.
  Add 4 methods in the class – public, method doPublic, no access modifier method doDefault, protected method doProtected, 
  private method doPrivate.
  In main method outside the class but in same package – create object of type Student.
  */
public class Student {
	
	public int rollNO;
	protected int admissionNO;
	int age;
	private int courseId;

	public void doPublic() {
	}
	
	void doDefault() {
	}
	
	protected void doProtected() {
	}
	
	private void doPrivate() {
	}
	
}
