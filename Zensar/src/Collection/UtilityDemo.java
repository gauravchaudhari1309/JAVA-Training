package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class UtilityDemo {
	
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		System.out.println(al.size());
		al.add("Sonu");
		al.add("Pranad");
		al.add(new String("Bunny"));
		al.add("Anita");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("e");
		
		
		/*Object[] arr=al.toArray();
		
		for(Object o:arr)
		{
			String s=(String)o;
			System.out.println(s.toUpperCase());
		}*/
		
		String[] arr=new String[al.size()];
		al.toArray(arr);
		
		for(String s:arr)
		{
			System.out.println(s);
			
			
			
	 String[] sarr= {"a","B","c"};
	 ArrayList<String> al5=new ArrayList<>();
	 for(String d:sarr)
	 {
		 al5.add(d);
	 }
		
	 List<String> lst=Arrays.asList(sarr);

	 List<String> movielst=Arrays.asList("War","Welcome","Ready");
	 
	 
	 
	 
	 List<String> al7=new ArrayList<>();
	 al7.add("a");
	 
		}
	}
	
	

}
