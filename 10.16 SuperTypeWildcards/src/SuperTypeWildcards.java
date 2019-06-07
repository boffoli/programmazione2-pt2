import java.util.*;

class Fruit{};
class Melon extends Fruit{};
class Apple extends Fruit{};	//<--
class Jonathan extends Apple{};
class Orange extends Jonathan{};

public class SuperTypeWildcards {
  static void writeTo(List<? super Apple> apples) {
    apples.add(new Apple());
    apples.add(new Jonathan());
    apples.add(new Orange());
    //apples.add(new Melon());
    //apples.add(new Fruit()); // Error
  }
} 
