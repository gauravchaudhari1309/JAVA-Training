package Collection;

import java.util.HashMap;
import java.util.Set;

public class MApDemo3 {

	public static void main(String[] args) {
		//one null key allowed,
		
		HashMap<Student,Integer>hm= new HashMap<>();
		
		hm.put(new Student("AB", "BA", 2123324234, 4), 90);
		hm.put(new Student("BC", "WE", 2123323654, 5), 80);
		hm.put(new Student("GH", "GA", 2128466354, 6), 98);
		hm.put(new Student("AB", "QE", 2123466354, 6), 98);
	
		Set<Student> ss=hm.keySet();
		
		for(Student obj:ss)
		{
			System.out.println(obj+ "-->" +hm.get(obj));
		}
	
	
	}

}
