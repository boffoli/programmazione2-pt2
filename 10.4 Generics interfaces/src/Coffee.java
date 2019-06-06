import java.util.*;

public class Coffee {
  private static long counter = 0;
  private final long id = counter++;
  
  public String toString() {    return getClass().getSimpleName() + " " + id;}
  
  public static void main(String[] args) {
	    CoffeeGenerator gen = new CoffeeGenerator();	/*Crea un oggetto di classe generator invocando il costruttore opportuno. Crea un iteratore su questo oggetto. Itera sull’iteratore */
	    for(int i = 0; i < 5; i++)
	    	System.out.println(gen.next());	  
	    for(Coffee c : new CoffeeGenerator(5))
	    	System.out.println(c);
	  }
}

class Mocha extends Coffee {}
class Americano extends Coffee {}
class Breve extends Coffee {}	
class Cappuccino extends Coffee {} 

class CoffeeGenerator implements  Iterable<Coffee>{//Generator<Coffee>,
	  private Class[] types = { Mocha.class,Cappuccino.class, Americano.class, Breve.class};	
	  private static Random rand = new Random(47);
	  private int size = 0;	 // For iteration
	  
	  public CoffeeGenerator() {}
	  public CoffeeGenerator(int sz) { size = sz; }	
	  
	  public Coffee next() {
	    try {
	      return (Coffee)types[rand.nextInt(types.length)].newInstance();		 // Report programmer errors at run time:	     
	    } catch(Exception e) {
	    	throw new RuntimeException(e);
	    }
	  }
	
	  //inner class	
	  class CoffeeIterator implements Iterator<Coffee> {
	    int count = size;
	    
	    public boolean hasNext() { return count > 0; }	    
	    public Coffee next() {
	      count--;			
	      return CoffeeGenerator.this.next();		// invoca il metodo next della classe esterna
	    }	    
	    public void remove() {    throw new UnsupportedOperationException(); }// Not implemented
	  };	
	
	  public Iterator<Coffee> iterator() {	    return new CoffeeIterator();}
	  
	  
	  /*
	  CoffeeGenerator c1 = CoffeeGenerator(5); 
	  CoffeIterator i1 = c1.Iterator();
	  while(i1.hasNext()){
			Coffee c= i1.next();
			System.out.println(c);
		}
	*/
}
