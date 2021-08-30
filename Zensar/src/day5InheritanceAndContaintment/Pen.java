package day5InheritanceAndContaintment;

public class Pen {

	Refill refill;
	int capLength;
	String brandString;
	
	Pen(){
		
	}

	Pen(Refill refill, int capLength, String brandString) {
		super();
		this.refill = refill;
		this.capLength = capLength;
		this.brandString = brandString;
	}

	public Refill getRefill() {
		return refill;
	}

	public void setRefill(Refill refill) {
		this.refill = refill;
	}

	public int getCapLength() {
		return capLength;
	}

	public void setCapLength(int capLength) {
		this.capLength = capLength;
	}

	public String getBrandString() {
		return brandString;
	}

	public void setBrandString(String brandString) {
		this.brandString = brandString;
	}
	
	
}
