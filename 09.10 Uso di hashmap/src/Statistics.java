// Semplice esempio di HashMap.

import java.util.*;

class Counter {
	int i = 1;
	
	public String toString() {	return Integer.toString(i);}
}

class Statistics {	
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		for(int i = 0; i < 10000; i++) {		
			int r = (int)(Math.random()*20);	// Produce un numero compreso fra 0 e 19:
			if(hm.containsKey(r))
				((Counter)hm.get(r)).i++;	//classe counter definita sopra
			else
				hm.put(r, new Counter());
		}
		System.out.println(hm);
	}
}
