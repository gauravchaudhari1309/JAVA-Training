package day5Class2;

public class Nib {

	String materialTypeString;
	float width;
	
	Nib(){
		
	}

	Nib(String materialTypeString, float width) {
		//super();
		this.materialTypeString = materialTypeString;
		this.width = width;
	}

	public String getMaterialTypeString() {
		return materialTypeString;
	}

	public void setMaterialTypeString(String materialTypeString) {
		this.materialTypeString = materialTypeString;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}
	
	
	
}
