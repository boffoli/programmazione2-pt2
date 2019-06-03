// Inizializzazione nella costruzione.
class Soap {
	private String s;
	Soap() {
		System.out.println("Soap()");
		s = new String("Constructed");
	}
	public String toString() {return s; }
}
