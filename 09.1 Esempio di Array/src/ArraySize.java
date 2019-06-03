// Inizializzazione & assegnamento di array.
class Weeble {} 

public class ArraySize {
	public static void main(String[] args) {
		
		Weeble[] a; // Null reference 		// Array di oggetti: gli array sono oggetti di prima classe 
		Weeble[] b = new Weeble[5]; // Null references 
		Weeble[] c = new Weeble[4];
		
		for(int i = 0; i < c.length; i++)	//c.lenght=4
			c[i] = new Weeble();				// inizializzazione aggregata statica:	
		
		Weeble[] d = {new Weeble(), new Weeble(), new Weeble()};	// inizializzazione aggregata dinamica:
		
		a = new Weeble[] {new Weeble(), new Weeble()};
		System.out.println("a.length=" + a.length);		//2
		System.out.println("b.length = " + b.length);	//5
		
		for(int i = 0; i < b.length; i++)
			System.out.println("b[" + i + "]=" + b[i]);	// I riferimenti nell’array sono inizializzati a null per difetto
		
		System.out.println("c.length = " + c.length);	//4
		System.out.println("d.length = " + d.length);	//3
		a = d;		//2=3
		System.out.println("a.length = " + a.length);	//3
		
		// Array di tipi primitivi:
		System.out.println("\n\n\n");
		int[] e; // Null reference
		int[] f = new int[5];
		int[] g = new int[4];
		
		for(int i = 0; i < g.length; i++)
			g[i] = i*i;
		
		int[] h = { 11, 47, 93 };
		//System.out.println("e.length="+e.length);				// Errore di compilazione: e non inizializzata

		System.out.println("f.length = "+ f.length);	//5
		
		for(int i = 0; i < f.length; i++)
			System.out.println("f[" + i + "]=" + f[i]);	// Inizializzazione a zero per difetto
		
		System.out.println("g.length = " + g.length);	//4
		System.out.println("h.length = " +h.length); //3
		e = h;
		System.out.println("e.length = " +e.length);		//3
		e = new int[] { 1, 2 };	
		System.out.println("e.length = " +e.length);	//2
	}
} 
