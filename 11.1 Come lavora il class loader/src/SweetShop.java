//Esempio che mostra il funzionamento del classloader.

class Candy {
	static {  System.out.println("Loading Candy");}// questa è una clausola statica
}
class Gum {
	static {	System.out.println("Loading Gum");}
}
class Cookie {
	static {	System.out.println("Loading Cookie");}
}

public class SweetShop {
	public static void main(String[] args) {
		System.out.println("inside main");
		new Candy();
		System.out.println("After creating Candy");
		try {
			Class.forName("Gum");
		} catch(ClassNotFoundException e) {
			e.printStackTrace(System.err);
		}
		System.out.println("After Class.forName(\"Gum\")");
		new Cookie();
		System.out.println("After creating Cookie");
	}
}