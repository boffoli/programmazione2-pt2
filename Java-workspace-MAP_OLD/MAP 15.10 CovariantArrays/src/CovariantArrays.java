class Fruit {}
class Orange extends Fruit {}
class Apple extends Fruit {}
class Jonathan extends Apple {}


public class CovariantArrays {
  public static void main(String[] args) {
    Fruit[] fruit = new Apple[10];
    fruit[0] = new Apple(); // OK	// Runtime type is Apple[], not Fruit[] or Orange[]:
    fruit[1] = new Jonathan(); // OK   
    try {	//tutto cio che non e' apple non puo esserepiu aggiunto'
      fruit[0] = new Fruit(); // Compiler allows you to add Fruit---> ArrayStoreException
    } catch(Exception e) { System.out.println(e); }
    try {     
      fruit[0] = new Orange();// Compiler allows you to add Oranges----> ArrayStoreException
    } catch(Exception e) { System.out.println(e); }
  }
} 
