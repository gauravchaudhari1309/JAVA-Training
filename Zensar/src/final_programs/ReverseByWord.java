package final_programs;

public class ReverseByWord {

	static String reverse(String str)
	{
		
		String reverse="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		
		return reverse;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Java Programming";
		
		String[] arr=s.split(" ");
		
		for(int i=0;i<arr.length;i++)
		{
			String s1=reverse(arr[i]);
			System.out.print(s1+"");
		}
		
		
	}

}
