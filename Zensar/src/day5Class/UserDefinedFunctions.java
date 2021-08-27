package day5Class;

public class UserDefinedFunctions {
int a=2,b=1;

 public void add() {
		 int c= a+b;	
		 System.out.println(c);
	}
	int sub(int a, int b) {

		return a-b;
		
	}
	void mul(int a, int b) {
		
		int d=a*b;
		System.out.println(d);
	}
	float div() {
		return a/b;
		
	}
	public static void main(String[] args) {
		
		UserDefinedFunctions udf=new UserDefinedFunctions();
		//System.out.println(udf.add());
		System.out.println(udf.sub(10, 5));
		//System.out.println(udf.mul(5, 5));
		System.out.println(udf.div());
}
}