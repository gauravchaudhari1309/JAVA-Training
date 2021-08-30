package day5InheritanceAndContaintment;

public class Refill {
	
	String inkColorString;
	int length;
	Nib  tipNib;
	
	Refill()
	{
		
	}

	Refill(String inkColorString, int length, Nib tipNib) {
		//super();
		this.inkColorString = inkColorString;
		this.length = length;
		this.tipNib = tipNib;
	}

	public String getInkColorString() {
		return inkColorString;
	}

	public void setInkColorString(String inkColorString) {
		this.inkColorString = inkColorString;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public Nib getTipNib() {
		return tipNib;
	}

	public void setTipNib(Nib tipNib) {
		this.tipNib = tipNib;
	}
	
		
	
	
	
	
}
