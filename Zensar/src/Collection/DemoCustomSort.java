package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DemoCustomSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		ArrayList<Student> al= new ArrayList<>();
		
		al.add(new Student("A","QA",951199948,90));
		al.add(new Student("B","BA",951199948,40));
		al.add(new Student("C","TA",951199948,80));
		al.add(new Student("D","SE",951199948,70));
		
		Collections.sort(al);
		
		for(Student ob:al)
			      
			System.out.println(ob);
	}

}


/*class Sort implements  Comparator<Student>
	{
		
		public int compare(Student o1, Student o2)
		{
			return o1.getPercent()-o2.getPercent();		
		}
	}*/