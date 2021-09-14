package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class IteratorMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//hasNext(),next(),remove(),listIterator
		
		ArrayList<String> list=new ArrayList<String>();
		list.add(" 1992");
		list.add("M");
		list.add("A");
		list.add("C");
		list.add("S");
		
		
		int i=list.indexOf(" 1992");
		if(i!=-1)
		{
			list.add(" 1996");
		}
		System.out.println(i);
		
		ListIterator<String> i1=list.listIterator(list.size());
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		while(i1.hasPrevious()) {
			System.out.print(i1.previous());
		} 
		               
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
