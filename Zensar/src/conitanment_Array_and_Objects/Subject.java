package conitanment_Array_and_Objects;

public class Subject {

	private int sid;
	private String sname;
	private Topic topic;
	
	Subject(){
		
		
	}

	Subject(int sid, String sname, Topic topic) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.topic = topic;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	@Override
	public String toString() {
		return "Subject : sid=" + sid + ", sname=" + sname + "\n " + topic;
	}

}
