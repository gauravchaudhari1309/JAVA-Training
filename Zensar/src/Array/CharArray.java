package Array;

import java.util.Scanner;

public class CharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 char[] ch= new char[3];
		 Scanner sc= new Scanner(System.in);
		 
		 System.out.println(" Enter character");
		 for (int  i=0;i<ch.length;i++)
		 {
			 ch[i]=sc.next().charAt(0);
		 }
		 int count=0;
		 for(int i=0;i<ch.length;i++)
		 {
			 if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
				 count++;
		 }
	}

}
