// Creazione di copie locali con clone().
import java.util.*;

public class LocalCopy {
	static MyObject g(MyObject v) {	// Passando un riferimento modifica l’oggetto esterno
		v.i++;
		return v;
	}
	
	static MyObject f(MyObject v) {
			v = (MyObject) v.clone(); // Copia locale: attenzione la clone e' in MyObject
			v.i++;	//si incrementa dopo la clone
			return v;
	}
	
	public static void main(String[] args) {
		//1)CASO 1
		MyObject a = new MyObject(11);
		MyObject b = g(a);	//costruttore di copia
		
		if(a == b)		// Effettua un controllo di equivalenza dei riferim.,non un controllo di equivalenza di oggetti
			System.out.println("a == b");
		else
			System.out.println("a != b");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		//2)CASO 2
		MyObject c = new MyObject(47);
		MyObject d = f(c);	//utilizzo la clone
		
		if(c == d)
			System.out.println("c == d"); 
		else
			System.out.println("c != d");
		System.out.println("c = " + c);
		System.out.println("d = " + d);
	}
}
