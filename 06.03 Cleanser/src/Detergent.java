public class Detergent extends Cleanser {
// Change a method:
public void scrub() {
	append(" Detergent.scrub()");
	super.scrub(); // Call base-class version
}
// Aggiunta di metodi
public void foam() { append("foam()"); }
// Test della nuova classe
public static void main(String[]args){
	Detergent x = new Detergent();
	x.dilute();
	x.apply();
	x.scrub();
	x.foam();
	x.print();
	System.out.println("Testing base class:");
	Cleanser.main(args);
	}
}
