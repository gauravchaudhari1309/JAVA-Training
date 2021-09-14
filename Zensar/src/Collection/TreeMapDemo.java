package Collection;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	TreeMap<Integer,String> tm= new TreeMap<>();
		
		tm.put(45, "A");
		tm.put(25, "A");
		tm.put(5, "Z");
		tm.put(1, "B");
		tm.put(50, "E");
		
		
		
		System.out.println(tm);
		//left,root,right
		 * 
		
		 TreeMap tm=new TreeMap();
			tm.put("a",90);
			tm.put(90.5f, "A");
	
		 
		 */
		
		
		TreeMap<Emp,Integer> tm=new TreeMap<>(new myEmpComparator());
		tm.put(new Emp(101,"A",90000), 90);
		tm.put(new Emp(100,"B",80000), 90);
		tm.put(new Emp(11,"Amit",100000), 90);
		tm.put(new Emp(120,"Sam",60000), 90);
		
		System.out.println(tm);
	}

}

class myEmpComparator implements Comparator<Emp>
{

	@Override
	public int compare(Emp o1, Emp o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}