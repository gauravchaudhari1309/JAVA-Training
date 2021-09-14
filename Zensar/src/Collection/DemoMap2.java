package Collection;

import java.util.ArrayList;
import java.util.HashMap;
//count frequency
public class DemoMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al= new ArrayList<>();
		al.add("Apple");
		al.add("Mango");
		al.add("Cherry");
		al.add("Papaya");
		al.add("Apple");
		al.add("Mango");
		
		
		HashMap<String,Integer> hm= new  HashMap<>();
		
		for(String fruit :al)
		{
			if(hm.containsKey(fruit))
			{
				int  curcount=hm.get(fruit);
				hm.put(fruit, curcount+1);
			}
			else
				hm.put(fruit, 1);
		}
		
	}
	

}
