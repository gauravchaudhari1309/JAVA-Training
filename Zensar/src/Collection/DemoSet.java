package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class DemoSet {

	public static void main(String[] args) {
		//not return duplicate data,
		HashSet<String> hs= new HashSet<>();
		hs.add("Riya");
		hs.add("Gaurav");
		hs.add("Ruts");
		hs.add("Priya");
		hs.add("Riya");
		System.out.println(hs);
		
		for(String s: hs)
			System.out.println(s);
		
		Iterator<String> i= hs.iterator();
		
		while(i.hasNext())
		{
			String ss=i.next();
			System.out.println(ss);
		}
		
		
		HashSet<Emp> hs3=new HashSet<>();
		hs3.add(new  Emp(1,"GSC",45900));
		hs3.add(new  Emp(2,"CGS",45900));
		hs3.add(new  Emp(3,"GCS",45900));
		System.out.println(hs3);
		
		LinkedHashSet<Integer> l= new LinkedHashSet<>();
		l.add(24);
		l.add(1);
		l.add(0);
		l.add(13);
		System.out.println(l);
		
		TreeSet<Double> ts= new TreeSet<>();
		ts.add(9.8);
		ts.add(445.3);
		ts.add(4.5);
		ts.add(33.5);
		ts.add(2.5);
		System.out.println(ts);
		
		
			
	}

}
