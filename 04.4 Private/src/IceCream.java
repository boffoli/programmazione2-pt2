// Dimostrazione di dichiarazioni private.
class Sundae {
	private Sundae() {	}	
	static Sundae makeASundae() {		return new Sundae();}	//~getter
}

public class IceCream {
	public static void main(String[] args) {
	//Sundae x = new Sundae();
	Sundae x = Sundae.makeASundae();
	}
}

