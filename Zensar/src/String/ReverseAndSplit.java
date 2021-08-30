package String;

public class ReverseAndSplit {
	
	static String reverse(String str)
	{
		
		String reverse="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		
		return reverse;
		
	}
public static void main(String[] args) 
{
	String s="Reverse It BY WORD";
	
	String[] arr=s.split(" ");
	
	for(int i=0;i<arr.length;i++)
	{
		String s1=reverse(arr[i]);
		System.out.print(s1+" ");
	}
}
}
