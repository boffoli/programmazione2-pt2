class BlankFinal {
	final int i = 0; // Final inizializzato
	final int j; // Final vuoto
	final Poppet p; // Riferimento final vuoto
	// Gli attributi final vuoti devono essere
	// inizializzati nel costruttore
	BlankFinal() {
		j = 1; // Inizializza final vuoto
		p = new Poppet();
	}
	BlankFinal(int x) {
		j = x; // Inizializza final vuoto
		p = new Poppet();
	}
	public static void main(String[] args) {
		BlankFinal bf = new BlankFinal();
	}
}
