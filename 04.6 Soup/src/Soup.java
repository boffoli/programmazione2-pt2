//Classe privata mediante costruttori privati
class Soup {	
	private Soup() {}	//costruttore privato
 
	public static Soup makeSoup() {		return new Soup();}		// Permette la creaz. mediante un metodo di classe

	private static Soup ps1 = new Soup();	// Crea un oggetto e restituisce un riferimento su richiesta. Un esempio di classe “singoletto”
	
	public static Soup access() {		return ps1;	}	
	public void f() {}	//la legge da sandwitch
}