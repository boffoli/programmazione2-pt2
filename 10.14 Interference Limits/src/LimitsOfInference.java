//import typeinfo.pets.*;
import java.util.*;

class Person {}
class Pet{}

public class LimitsOfInference {
  static void f(Map<Person, List<? extends Pet>> petPeople) {}
  public static void main(String[] args) {
    // f(New.map()); // Does not compile
  }
} 

