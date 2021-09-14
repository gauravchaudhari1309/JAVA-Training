package Collection;

import java.util.ArrayList;

public class Demo3 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		System.out.println(al.size());
		al.add("snehal");
		al.add("Pooja");
		al.add(new String("Megha"));
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("e");
		al.add("Priya");
		al.add("Om");
		al.add("Ayush");
		
		System.out.println(al);
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		for(String str:al)
		{
			System.out.println(str);
		}
		
		ArrayList<Float> al2=new ArrayList<>();
		al2.add(56.6f);
		al2.add(56.6f);
		al2.add(56.6f);
		
		for(int i=0;i<al2.size();i++)
		{
			System.out.println(al2.get(i));
		}
		
		
		for(Float d:al2)
			System.out.println(d);
		
		
		
		
		ArrayList<Student> al3=new ArrayList<>();
		Student s1=new Student("Rohan","BE");
		al3.add(s1);
		al3.add(new Student("Rehan","BE"));
		al3.add(new Student("Pavan","BE"));
		al3.add(new Student("Rahul","BE"));
		
		for(Student ob:al3)
			System.out.println(ob);
		
		
		
			
	}

		
	
	

}
