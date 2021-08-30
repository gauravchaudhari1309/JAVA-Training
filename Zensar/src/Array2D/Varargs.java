package Array2D;

public class Varargs {

	//varargs-: allow method to accept zero or multiple arguments
	//syntax-: methodname(datatype ...var_name) OR 
			 //methodname(datatype... var_name)
		
	public static void sum(int ...a) {
			
			int sum=0;
			for(int i=0;i<a.length;i++)		//for(int t:a)
			{
				sum=sum+a[i];				//sum=sum+t
							
			}
			System.out.println(sum);
		
	} 

	public static void main(String[] args) {
		
		sum(1,2,4,6);
		sum(3,4,2);
		sum(90,7);
	}
}
