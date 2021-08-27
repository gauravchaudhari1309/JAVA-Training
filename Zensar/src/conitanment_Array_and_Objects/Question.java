package conitanment_Array_and_Objects;

public class Question {

	private int qid;
	private String qname;
	
Question(){
		
		
	}

public Question(int qid, String qname) {
	//super();
	this.qid = qid;
	this.qname = qname;
}

public int getQid() {
	return qid;
}

public void setQid(int qid) {
	this.qid = qid;
}

public String getQname() {
	return qname;
}

public void setQname(String qname) {
	this.qname = qname;
}

@Override
public String toString() {
	return "Question [qid=" + qid + ", qname=" + qname + "]";
}


	
}
	