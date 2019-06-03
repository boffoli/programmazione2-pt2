import java.util.*;

class Fruit {}
class Apple extends Fruit {}
class Jonathan extends Apple {}

public class SuperTypeWildcards {
  static void writeTo(List<? super Apple> apples) {	//lista di(?=tipo da cui deriva apple)
    apples.add(new Apple());
    apples.add(new Jonathan());
    //apples.add(new Fruit()); // Error: non posso fare upcasting
  }
} 