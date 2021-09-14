package Collection;

import java.util.ArrayList;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>  a= new ArrayList<>();
		a.add("X");
		a.add("Y");
		a.add("K");
		a.add("D");
		
	
		System.out.println(a);
		
		
		ArrayList<String>  a2= new ArrayList<>();
		a2.add("A");
		a2.add("B");
		a2.add("V");
		
		a2.addAll(1, a);
		System.out.println(a2);
		
		String t=a2.get(0);
		System.out.println(t);
		
		
	}

}
