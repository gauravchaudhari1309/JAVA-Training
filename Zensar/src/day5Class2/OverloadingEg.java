package day5Class2;

public class OverloadingEg {

	void form(int n, char c) {
		
		
	}
	void form(char c,int n) {
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingEg o1= new OverloadingEg();
		o1.form(1,'F');
		o1.form(2, 'M');
	}

}
