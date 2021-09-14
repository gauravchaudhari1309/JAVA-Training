package Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Integer> hm= new HashMap<>();
		hm.put("Gaurav", 1);	//entry object
		hm.put("Gautam", 3);
		hm.put("Ruts", 65);
		hm.put("Komal", 10);
		hm.put("Sans", null);
		hm.put("Komal", 1);
		
		System.out.println(hm.get("Sans"));
		System.out.println(hm.get("Komal"));
		System.out.println(hm.size());
		System.out.println(hm.isEmpty());
		System.out.println(hm.containsKey("Gauri"));
		System.out.println(hm.containsValue(45));
		
		//to iterate over set
		Set<String> ks= hm.keySet();
		System.out.println(ks);
		
		for(String s:ks )
			System.out.println(ks+"->"+hm.get(s));
		
		//2 iterate over entry object
		Set<Entry<String,Integer>>  ee=hm.entrySet();
		
		for(Entry<String,Integer>  e:ee)
		{
			System.out.println(e.getKey()+"-->"+e.getValue());
		}
		
		//iterate over values of hashmap
		Collection<Integer> c=hm.values();
		
		for(Integer i:c)
			System.out.println(i);
	}

}
