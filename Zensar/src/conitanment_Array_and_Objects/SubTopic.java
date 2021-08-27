package conitanment_Array_and_Objects;

public class SubTopic {
	
	private int stid;
	private String stname;
	private Question question;
	
	SubTopic(){
		
	}

	SubTopic(int stid, String stname, Question question) {
		super();
		this.stid = stid;
		this.stname = stname;
		this.question = question;
	}

	public int getStid() {
		return stid;
	}

	public void setStid(int stid) {
		this.stid = stid;
	}

	public String getStname() {
		return stname;
	}

	public void setStname(String stname) {
		this.stname = stname;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	@Override
	public String toString() {
		return "SubTopic: stid=" + stid + ", stname=" + stname + "\n" + question ;
	}

	
}
