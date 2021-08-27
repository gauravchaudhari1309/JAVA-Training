package conitanment_Array_and_Objects;

public class Topic {
	private int tid;
	private String tname;
	private SubTopic  subtopic;

	Topic(){
		
	}

	Topic(int tid, String tname, SubTopic subtopic) {
		//super();
		this.tid = tid;
		this.tname = tname;
		this.subtopic = subtopic;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public SubTopic getSubtopic() {
		return subtopic;
	}

	public void setSubtopic(SubTopic subtopic) {
		this.subtopic = subtopic;
	}

	@Override
	public String toString() {
		return "Topic : tid=" + tid + ", tname=" + tname + "\n" + subtopic ;
	}
		
	
	
}
