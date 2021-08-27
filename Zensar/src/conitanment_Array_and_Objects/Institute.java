package conitanment_Array_and_Objects;

public class Institute {
	
	

	private int iid;
	private String  iname;
	private Branch branch;
	
	Institute()
	{
		
	}

	Institute(int iid, String iname, Branch branch) {
		super();
		this.iid = iid;
		this.iname = iname;
		this.branch = branch;
	}

	public int getIid() {
		return iid;
	}

	public void setIid(int iid) {
		this.iid = iid;
	}

	public String getIname() {
		return iname;
	}

	public void setIname(String iname) {
		this.iname = iname;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	
	@Override
	public String toString() {
		return "Institute : iid=" + iid + ", iname=" + iname + " \n" + branch  ;
	}
	
	
}