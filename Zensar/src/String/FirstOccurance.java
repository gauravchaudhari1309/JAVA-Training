package String;

public class FirstOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "Gaurav";
		
		int index=s.indexOf('a');
		System.out.println("First occurance index is "+index);
		int index2=s.indexOf('a', index+1);
		System.out.println("Same letter occurs at index "+index2);
	}

}
