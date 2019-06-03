class Measurement {
	Depth o = new Depth();
	boolean b = true;
// . . . }	

	class CInit {
		int i = f();
		int j = g(i);//...
		int f() {}
		int g(int a) {}
		}

	class CInit {
		int j = g(i); //i non è stato ancora
		int i = f(); //inizializzato
		//...} oggetti 
