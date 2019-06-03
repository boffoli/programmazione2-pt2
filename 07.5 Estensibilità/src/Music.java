import java.util.*;

class Instrument {
	public void play() {	System.out.println("Instrument.play()");}
	public String what() {	return "Instrument";}
	public void adjust() {}
}

class Wind extends Instrument {
	public void play() {	System.out.println("Wind.play()");}
	public String what() {	return "Wind"; }
	public void adjust() {}
}

class Percussion extends Instrument {
	public void play() {	System.out.println("Percussion.play()");}
	public String what() {	return "Percussion"; }
	public void adjust() {}
}

class Stringed extends Instrument {
	public void play() {	System.out.println("Stringed.play()");}
	public String what() {	return "Stringed"; }
	public void adjust() {}
}

class Brass extends Wind {
	public void play() {	System.out.println("Brass.play()");}
	public void adjust() {	System.out.println("Brass.adjust()");}
}

class Woodwind extends Wind {
	public void play() {	System.out.println("Woodwind.play()");}
	public String what() {	return "Woodwind"; }
} 

public class Music {
	static void tune(Instrument i) {i.play();}	// Doesn't care about type, so new types added to the system still work right:
	
	static void tuneAll(Instrument[] e) {
		for(int i = 0; i < e.length; i++)
			tune(e[i]);	//va qui sopra
}
		
	public static void main(String[] args) {
		Instrument[] orchestra = new Instrument[5];
		int i = 0;		
		orchestra[i++] = new Wind();		// Upcasting during addition to the array:
		orchestra[i++] = new Percussion();
		orchestra[i++] = new Stringed();
		orchestra[i++] = new Brass();
		orchestra[i++] = new Woodwind();
		tuneAll(orchestra);
		}
}