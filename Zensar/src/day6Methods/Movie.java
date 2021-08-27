package day6Methods;

public class Movie {
	
	private int id;
	private String name;
	private Actor act;
	
	public Movie(int id, String name, Actor act) {
		super();
		this.id = id;
		this.name = name;
		this.act = act;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Actor getAct() {
		return act;
	}

	public void setAct(Actor act) {
		this.act = act;
	}

}
