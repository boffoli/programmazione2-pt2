public class FinalData {
	// Costanti al compile-time
	final int i1 = 9;
	static final int VAL_TWO = 99;
	// Tipiche costanti pubbliche:
	public static final int VAL_THREE = 39;
	// Costanti al run-time:
	final int i4 = (int)(Math.random()*20);
	static final int i5 = (int )(Math.random()*20);
	Value v1 = new Value();
	final Value v2 = new Value();
	static final Value v3 = new Value();
	// Array:
	final int[] a = { 1, 2, 3, 4, 5, 6 };
	public void print(String id) {
		System.out.println( id + ": " + "i4 = " + i4 +", i5 = " + i5);
	}
	
	public static void main(String[] args) {
		FinalData fd1 = new FinalData();
		//! fd1.i1++; // Errore: valore non modificabile
		fd1.v2.i++; // L’oggetto non e’ costante!
		fd1.v1 = new Value(); // OK -- non final
		for(int i = 0; i < fd1.a.length; i++)
			fd1.a[i]++; // Object isn't constant!
		//! fd1.v2 = new Value(); // Errore: non si puo’
		//! fd1.v3 = new Value(); // cambiare il riferim.
		//! fd1.a = new int[3];
		fd1.print("fd1");
		System.out.println("Creating new FinalData");
		FinalData fd2 = new FinalData();
		fd1.print("fd1");
		fd2.print("fd2");
		}
}