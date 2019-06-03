public class FinalArguments {
	void with(final Gizmo g) {
	//! g = new Gizmo(); // Illegale -- g e’ final
	}
	void without(Gizmo g) {
		g = new Gizmo(); // OK -- g non e’ final
		g.spin();
	}
	// void f(final int i) { i++; } //Non modificabile
	// Si puo’ solo leggere un final di tipo primitivo:
	int g(final int i) { return i + 1; }
	public static void main(String[] args) {
		FinalArguments bf = new FinalArguments();
		bf.without(null);
		bf.with(null);
	}
}
