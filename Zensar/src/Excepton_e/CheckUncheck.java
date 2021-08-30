package Excepton_e;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckUncheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			FileReader fr= new FileReader("d:\\Gaurav.txt");
			
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		int d=10/0;
	}

}
