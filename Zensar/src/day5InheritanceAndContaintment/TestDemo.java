package day5InheritanceAndContaintment;


	class Person {

		private int id;
		private String name;
		private Vehicle v;
		
		Person(){
			
			
		}
		Person(int id, String name, Vehicle v) {
			
			this.id = id;
			this.name = name;
			this.v = v;
		}
		@Override
		public String toString() {
			return "Person [id=" + id + ", name=" + name + ", v=" + v + "]";
		}
		

		
	}
	 class Vehicle {

		private int vid;
		private String vname;
		private Brand b;
		
		Vehicle(){
			
			
		}
		Vehicle(int vid, String vname,Brand b) {
			
			this.vid = vid;
			this.vname = vname;
			this.b=b;
			
		}
		@Override
		public String toString() {
			return "Vehicle [vid=" + vid + ", vname=" + vname + ", b=" + b + "]";
		}
		public static void main(String[] args) {
			Person p1= new Person(1, "ABC",new Vehicle(12,"Honda",new Brand("Hero",23) ));
			System.out.println(p1);
			System.out.println();
			
		}
		
	}	

		class Brand 
		{
		 private String bname;
		 private int bid;
			
		 Brand(){
			 
		 } 

		public Brand(String bname, int bid) {
			//super();
			this.bname = bname;
			this.bid = bid;
		}

		@Override
		public String toString() {
			return "Brand [bname=" + bname + ", bid=" + bid + "]";
		
		}
		

	}




