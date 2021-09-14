package Excepton_e;

import java.io.IOException;

public class UseOFThrows {
	
	 void m()throws IOException{  
		    throw new IOException("device error");//checked exception  
		  }  
		  void n()throws IOException{  
		    m();  
		  }  
		  void p(){  
		   try{  
		    n();  
		   }catch(Exception e){System.out.println("exception handled");}  
		  }  
		  public static void main(String args[]){  
			  UseOFThrows obj=new UseOFThrows();  
		   obj.p();  
		   System.out.println("normal flow...");  
		  }
}