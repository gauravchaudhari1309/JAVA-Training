package String;

import java.util.Arrays;

public class CompareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] arr= {"Hum","Aapke","Hai","Kon"};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
			if(arr[i].compareTo(arr[j+1])>0)
			{
				String t=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=t;
				
			}
		}
	}
		System.out.println(Arrays.toString(arr));
	}
	
}
