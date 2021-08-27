package conitanment_Array_and_Objects;

public class Movie {
	
	private int mid;
	private String mname;
	private String[] actorlist;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Movie m=new Movie();
			m.mid=1;
			m.mname="Shole";
			
			String[] sholelist= new String[2];
			sholelist[0]="Jay";
			sholelist[1]="Viru";
			m.actorlist=sholelist;
	
	}

}
