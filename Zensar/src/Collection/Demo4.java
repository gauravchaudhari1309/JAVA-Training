package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>  a= new ArrayList<>();
		a.add("X");
		a.add("Y");
		a.add("K");
		a.add("D");
		
		
		Iterator<String> i=a.iterator();
		while(i.hasNext())
		{
			String data=i.next();
			System.out.println(data);                   
		}
	
	}

}
