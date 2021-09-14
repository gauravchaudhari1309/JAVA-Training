package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class Reverseorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> list=new ArrayList<String>();
		list.add(" 1992");
		list.add("M");
		list.add("A");
		list.add("C");
		list.add("S");

		
		ListIterator<String> i=list.listIterator();
		
		while( i.hasNext())
		{
			i.next();
		}
		System.out.println("Reverse");
		while(i.hasPrevious()) {
			System.out.print(i.previous());
		}
		
	}

}
