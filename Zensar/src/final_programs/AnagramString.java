package final_programs;
import java.util.Arrays;  

public class AnagramString {

	private static final String status = null;


	static void isAnagram(String str1, String str2) {  
        String s1 = str1.replaceAll("\\s", "");  
        String s2 = str2.replaceAll("\\s", "");  
        boolean status = true;  
        if (s1.length() != s2.length()) {  
            status = false;  
        } else {  
            char[] ArrayS1 = s1.toLowerCase().toCharArray();  
            char[] ArrayS2 = s2.toLowerCase().toCharArray();  
            Arrays.sort(ArrayS1);  
            Arrays.sort(ArrayS2);  
            status = Arrays.equals(ArrayS1, ArrayS2);  
        }  
        if (status) {  
            System.out.println(s1+" , "+s2+ " is ture");  
        } else {  
            System.out.println("false");  
        }  
    }  
   
           
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		isAnagram("Keep", "Peek");  
		isAnagram("Keeper", "Peeter");  	
       
	
		
	}

}
