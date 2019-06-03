import java.util.*;

class MyObject implements Cloneable {
	int i; 
	MyObject(int ii) {i = ii; }	//costruttore
	
	
	public Object clone() {		
		Object o = null;
		try {
			o = super.clone();		// Verifica che la superclasse di MyObject, cioè Object, abbia un metodo clone: se si, copia l’oggetto, altrimenti restituisce un riferimento nullo
		} catch(CloneNotSupportedException e) {
		  System.err.println("MyObject can't clone");
		}
		return o;
	}
	
	public String toString() {	return Integer.toString(i);}
}