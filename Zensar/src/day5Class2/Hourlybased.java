package day5Class2;

public class Hourlybased extends Teacher {

int rateperhour;
int hrs;
Hourlybased( int rateperhour, int hrs) {
	//super(tid, tname, mno);
	this.rateperhour = rateperhour;
	this.hrs = hrs;
}
void salary() {
	
	System.out.println("Hourly based salary"+hrs*rateperhour);
}
	
}
