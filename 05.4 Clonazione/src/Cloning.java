import java.util.*;

class Int {
	private int i;
	
	public Int(int ii) {i = ii; }	//costruttore
	
	public void increment() {i++; }
	public String toString() {		return Integer.toString(i);}	//metodo di conversione
}

public class Cloning {
	public static void main(String[] args) {
	
	ArrayList v = new ArrayList();	// crea un oggetto ArrayList, cioè una lista implementata con array
	for(int i = 0; i < 10; i++ ) 
		v.add(new Int(i));	// aggiunge 10 oggetti di classe Int alla lista
	System.out.println("v: " + v);
	
	// Crea un clone di v che è un Object e ne fa un cast a ArrayList prima di assegnarne il riferimento a v2
	ArrayList v2 = (ArrayList)v.clone();
	
	for(Iterator e=v2.iterator(); e.hasNext(); )	//iterazone di lista: 2 istruzioni
		((Int)e.next()).increment();	// Incrementa tutti i valori di v2
	System.out.println("v: " + v);	// Verifica che v sia cambiata, e quindi sono lo stesso array
	}
} 
