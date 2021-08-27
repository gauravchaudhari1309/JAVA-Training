package day4Practical_PatternEg;

public class PalindromBetween {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int n=100;n<=500;++n)
		  {
		    int rem,nr=0;
		    int nc=n;
		    while(nc>0)
		    {
		      rem=nc%10;
		      nr=nr*10+rem;
		      nc=nc/10;
		    }
		    
			if(n==nr)
				
				System.out.println(n);
		  }	   
		  
	}

}
