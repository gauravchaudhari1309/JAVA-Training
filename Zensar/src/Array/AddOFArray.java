package Array;

import java.util.Arrays;

public class AddOFArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4};
		int[] b= {4,5,6,7,8,9};
		
		int max=a.length>b.length?a.length:b.length;
		
		int[] c=new int[max];
		
		for(int i=0;i<max;i++) {
			
			if(i <a.length && i<b.length)
			{
				c[i]= a[i]+b[i];
				
			}else if(i<a.length) {
				
				c[i]=a[i];
			}else if(i<b.length) {
				c[i]=b[i];
				
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
	}

}
