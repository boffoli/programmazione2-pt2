// chiamate del metodo creano implicitamente  un alias degli argomenti.
public class Alias2 {
	int i;

	Alias2(int ii) {i = ii; }	//costruttore

	static void f(Alias2 reference) {reference.i++;}	//conta le chiamate al metodo f

	public static void main(String[] args) {
		Alias2 x = new Alias2(7);
		System.out.println("x: " + x.i);
		System.out.println("Calling f(x)");
		f(x);
		System.out.println("x: " + x.i);
	}
}