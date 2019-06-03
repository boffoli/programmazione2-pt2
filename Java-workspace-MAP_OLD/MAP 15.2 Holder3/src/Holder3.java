class Automobile{};

public class Holder3<T> {  
  private T a;
  	
  public Holder3(T a) { 	this.a = a;} //costruttore
  public void set(T a) {  this.a = a;}  
  public T get() { return a; }
  
  public static void main(String[] args){    
	Holder3<Automobile> h3 = new Holder3<Automobile>(new Automobile());
	Automobile a = h3.get(); // No cast needed,perche h3 e' di tipo automobile
	// h3.set("Not an Automobile"); // Error: sto passando una stringa ma la ruchiesta e' t
    // h3.set(1); // Error
    Holder3<String> h4 = new Holder3<String>("Not an Automobile");
    h4.set("Not an Automobile");//OK
  }
}
