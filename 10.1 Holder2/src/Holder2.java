class Automobile{}


public class Holder2 {
  private Object a;
  
  public Holder2(Object a) { this.a = a; }	//ccostruttore di copia  
  public void set(Object a) { this.a = a; }
  public Object get() { return a; }
  

  public static void main(String[] args) {
	Holder2 h2 =new Holder2(new Automobile());	//e' un object
	Automobile a = (Automobile)h2.get();	//ritorna un object che puo diventare un oggetto di tipo automobile	    
	h2.set("Not an Automobile");
	String s = (String)h2.get();//vale anche per le stringhe
	    
	h2.set(1); // Autoboxes to Integer(e' un oggetto di tipo holder)
	Integer x = (Integer)h2.get();
  }
} 