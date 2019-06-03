//Classe read only persoanlizzata: gli oggetti che non possono essere modificati sono immuni agli effetti di alias

public class Immutable1 {
	private int data;
	
	public Immutable1(int initVal) {data = initVal;}	//costruttore
	public int read() {return data;}	//getter
	public boolean nonzero() { return data != 0; }	
	public Immutable1 quadruple() {return new Immutable1(data * 4);}//nuovo oggetto int quadruplicato: va al costruttore imm1
	
	 static void f(Immutable1 i1) {
		Immutable1 quad = i1.quadruple();		//il nuovo oggetto e' restituito
		System.out.println("inside i1 = " + i1.read());
		System.out.println("inside quad = " + quad.read());
	}	//oggetto qud distrutto

	
	public static void main(String[] args) {
		Immutable1 x = new Immutable1(47);
		System.out.println("x = " + x.read());
		x.f(x);
		System.out.println("x = " + x.read());	//ATTENZIONE VALORE INVARIATO
		}
}
