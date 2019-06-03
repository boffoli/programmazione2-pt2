// Due riferimenti sono alias a un oggetto
public class Alias1 {
	int i;
	
	Alias1(int ii) {i = ii; }	//COSTRUTTORE
	
	public static void main(String[] args) {
		Alias1 x = new Alias1(7);
		Alias1 y = x; // E' UN PUNTATORE,creare copy constructors a parte per impedire aliasing
		
		System.out.println("x: " + x.i);
		System.out.println("y: " + y.i);
		System.out.println("Incrementing x");
		x.i++;
		System.out.println("x: " + x.i);
		System.out.println("y: " + y.i);
		}
}

