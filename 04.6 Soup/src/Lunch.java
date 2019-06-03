// Solo una classe pubblica ammessa nel file:
public class Lunch {
	void test() {		
		// Soup priv1 = new Soup();			// Can't do this! Private constructor
		Soup priv2 = Soup.makeSoup();
		Sandwich f1 = new Sandwich();	//costruttore di default
		Soup.access().f();	//ok si puo fare
	}
}