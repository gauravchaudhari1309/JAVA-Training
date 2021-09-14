package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class DemoSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>  a= new ArrayList<>();
		a.add("X");
		a.add("Y");
		a.add("K");
		a.add("D");
		a.add("G");
		a.add("K");
		a.add("O");
		
		System.out.println(a);
		
		Collections.reverse(a);
		System.out.println(a);
		
		int c=Collections.frequency(a,"K");
		System.out.println("Freq of K " + c);
	
		
		System.out.println(a);
		
		Collections.swap(a, 1, 3);
		System.out.println(a);
		
		Collections.sort(a);
		System.out.println(a);
		
		Collections.reverse(a);
		System.out.println(a);
		
		
		
	}

}
