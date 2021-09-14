package Collection;

public class Student implements Comparable<Student> {

	private String name;
	private String qualification;
	private long mobile;
	private int percent;
	
	
	
	
	public Student(String name, String qualification, long mobile, int percent) {
		super();
		this.name = name;
		this.qualification = qualification;
		this.mobile = mobile;
		this.percent = percent;
	}
	
	public Student(String name, String qualification) {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public int getPercent() {
		return percent;
	}

	public void setPercent(int percent) {
		this.percent = percent;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", qualification=" + qualification + ", mobile=" + mobile + ", percent="
				+ percent + "]";
	}

	
	public int compareTo(Student o) {
		//this 
		
		 
		if(o.percent<this.percent)
			return -1;
		else if(o.percent>this.percent)
			return 1;
		else
			return 0;
	//return o.name.compareTo(this.name);
	/*
	 * if(o.name.length()<this.name.length()) return -1; else
	 * if(o.name.length()>this.name.length()) return +1; else return 0;
	 * 
	 */
		
	}
	
}
	