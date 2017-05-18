package blatt3Aufgabe4;

public class Signleton {
	private static Signleton sn = null;
	
	//constructor private
	private Signleton(){}
	//public method to create and use sn
	public static Signleton getSign(){
		if (sn != null){
			return sn = new Signleton();
		}
		else return sn;
	}
}
