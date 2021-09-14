package Collection;

import java.util.ArrayList;

public class ArrayListOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> al= new ArrayList<>(10); //we given size 10 but it takes more 10 value
		System.out.println(al.size()); 	//[]
		al.add("A");
		al.add("B");
		al.add("C");
		al.add(new String("D")); //another way
		al.add("E");
		al.add("F");
		al.add("G");
		al.add("H");
		al.add("I");
		al.add("J");
		al.add("K");
		al.add("L");
		al.add("M");
		al.add("N");
		al.add("G");
		
		Object [] arr=al.toArray();
		
		for(Object o: arr)
		{
			String s=(String)o;
			System.out.println(s.toUpperCase());
			
			
			//or
			
			String [] arr1= new String[al.size()];
			al.toArray(arr1);
			
			for(String  a:arr1)
			{
				System.out.println(a);
			}
		}
		System.out.println(al.size());	// show size
		System.out.println(al);
		//al.clear();
		//System.out.println(al);
		al.add("G");
		System.out.println(al);
		al.remove("G");	//remove first occurrence
		System.out.println(al);
		System.out.println(al.contains("Bunty"));   //give false bcz string not present
		
		ArrayList<String>  a= new ArrayList<>();
		a.add("X");
		a.add("Y");
		a.add("K");
		a.add("D");
		
		a.addAll(al);		//add two collection
		//System.out.println(a);
		
	
		//a.removeAll(al); // remove common element too
		//System.out.println(a);
		
		//a.retainAll(al);  //remove uncommon
		System.out.println(a);
		
		System.out.println(a.containsAll(al));
	}

}
