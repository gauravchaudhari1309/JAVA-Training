package day6Methods;

public class CompanyTraining {
	
	private int cid;
	private String cname;
	private Trainer trainer;
	public CompanyTraining(int cid, String cname, Trainer trainer) {
		
		this.cid = cid;
		this.cname = cname;
		this.trainer = trainer;
		
		
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Trainer getTrainer() {
		return trainer;
	}
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
	
	
	
}


class Trainer
{
private int tid;
private String tname;

public Trainer(int tid, String tname) {
	
	this.tid = tid;
	this.tname = tname;
	
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

}