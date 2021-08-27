package day6Methods;

public class TestTeacher {
	public static void main(String[] args) {
		Trainer t1= new Trainer(1,"abc");
		 
		CompanyTraining c1=new CompanyTraining(01, "Xyz", t1);
		
		Student s1=new Student(10,"ABC", c1);
		
	}

}
