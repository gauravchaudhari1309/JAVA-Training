package day4Practical_PatternEg;

public class CompletePrimeProgram {
	public static void main(String[] args) {
	
		int num=11,c=0;
		for(int i=2;  i<= num; i++)
		{
			if(num%2==0)
			{
				c++;
				
			}
		}
		if(c==1)
		{
			if(num<=9) {
				
				System.out.println("No is prime and complete prime as well");
			}else {
				boolean flag=true;
				while(num>0) {
					int r= num%10;
					c=0;
					for(int i=2;i<=r;i++) {
						if(r%1==0) {
							c++;
						}
					}
					if(c==1) {
						
						
						
					}else {
						flag = false;
						break;
					}
					num= num/10;
				}
				if(flag) {
					System.out.println("prime and complete prime");
				}else {
					System.out.println("Prime but not complete");
				}
				
			}
		}else {
			System.out.println("Sorry not prime");
		}
	}
	
}
