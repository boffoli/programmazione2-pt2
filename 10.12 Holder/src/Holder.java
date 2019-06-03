class Fruit {}
class Orange extends Fruit {}
class Apple extends Fruit {}
class Jonathan extends Apple {}

public class Holder<T> {
  private T value;
  
  public Holder() {}	//costruttore
  public Holder(T val) {	 value = val; }	//costruttore
  
  public void set(T val) {	 value = val; }
  public T get() { 	return value; }
  public boolean equals(Object obj) {	   return value.equals(obj);}
  
  public static void main(String[] args) {
    Holder<Apple> apple = new Holder<Apple>(new Apple());	//equivalentemente ai template
    Apple d = apple.get();	//ritorna un oggetto di tipo t
    apple.set(d);
    
    // Holder<Fruit> fruit = apple; // Cannot upcast, per farlo--->
    Holder<? extends Fruit> fruit = apple; // OK: tipo sconosciuto estendera fruit
    Fruit p = fruit.get();	//attenzione: fruit e' di tipo apple
    
    d = (Apple)fruit.get(); // Returns 'Object'(il casting e ' permesso)
    
    try {
      Orange c = (Orange)fruit.get(); // No warning		//no posso fare il cast di apple to orange
    } catch(Exception e) { System.out.println(e); }
    // fruit.set(new Apple()); // Cannot call set()
    // fruit.set(new Fruit()); // Cannot call set()
    System.out.println(fruit.equals(d)); // OK
  }
}