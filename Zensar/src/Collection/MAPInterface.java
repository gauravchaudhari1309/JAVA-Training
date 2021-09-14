package Collection;

import java.util.HashMap;

public class MAPInterface {

	public static void main(String[] args) {
		
//K-key ...any class type	..should be unique
//V-value
//HashhMap<K,V>
		
		/*HashMap<String,Integer> hm= new HashMap<>();
		hm.put("Gaurav", 1);	//entry object
		hm.put("Gautam", 3);
		hm.put("Ruts", 65);
		hm.put("Komal", 45);
		hm.put("Sans", 25);
		hm.put("Gaurav", 7);
		
		
		System.out.println(hm);
		*/
		
		HashMap<Integer,String> hm= new HashMap<>();
		
		for(int i=1;i<=11;i++)
		{
			hm.put(i, "A"+i);
			
		}
		hm.put(17, "a");
		hm.put(18, "b");
		hm.put(19, "c");
		hm.put(20, "d");
	}

}
