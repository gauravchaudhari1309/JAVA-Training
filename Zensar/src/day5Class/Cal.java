package day5Class;

public class Cal {

	int a=5,b=2;
	
	
	
	void add()
	{
	int ans=a+b;
	System.out.println("Additon is "+ ans);
	}
	int mul() {
		
		return (a*b);
	}
	
	float div()
	
	{
		return (a/b);
	}
	static int fact(int n)	
	{
		int f=1;
		for(int i=1;i<=n;i++)
			
			f=f*i;
			System.out.println("Factorial is given no is :" +f);
			return f;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal sc= new Cal();
		sc.add();
		float s1=sc.div();
		System.out.println("Division is "+sc.div());
		int s2=sc.mul();
		System.out.println("Multiplication is "+sc.mul());
		System.out.println();
		Cal.fact(5);
	
	}

}
