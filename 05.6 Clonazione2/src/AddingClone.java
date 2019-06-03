import java.util.*;
//DEEP COPY
class Int2 implements Cloneable {
	private int i;
	
	public Int2(int ii) { i = ii;}	//costruttore
	public void increment() { i++; }	
	public String toString() {return Integer.toString(i);}
	
	public Object clone(){
		Object o = null;
		try {
			o = super.clone();
		} catch(CloneNotSupportedException e) {
			System.err.println("Int2 can't clone");
		}
		return o;
	}
}

public class AddingClone {
	public static void main(String[] args) {
		ArrayList v = new ArrayList();
		for(int i = 0; i < 10; i++ )
			v.add(new Int2(i));	//metodo della classe intero
		System.out.println("v: " + v);
		ArrayList v2 = (ArrayList)v.clone();
		
		for(int i = 0; i < v.size(); i++)				// Ora clona ogni elemento
			v2.set(i, ((Int2)v2.get(i)).clone());
		
		
		for(Iterator e = v2.iterator(); e.hasNext(); )		// Increment all v2's elements
			((Int2)e.next()).increment();
		
		System.out.println("v: " + v);			// Verifica che i valori di v siano cambiati:
		System.out.println("v2: " + v2);
	}
}
