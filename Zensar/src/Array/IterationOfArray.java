package Array;

public class IterationOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[]= {"Bachpan ","ka_Pyar ","Bhul_nahi ","Jana_re"};
		
		String b[]= new String[a.length];
		
		for(int i=0;i<a.length;i++) {
			
			b[i]=a[i];
		}
	System.out.println("First array");
	
	for(int i=0;i<a.length;i++) {
		
		System.out.print(a[i]);
	}
	System.out.println("\nElemnt of new array");
	
	for(int i=0;i<b.length;i++) {
		
		System.out.print(b[i]);
	}
	}
	
	

}
