class Amphibian {}
class Vehicle {}

public class TupleTest {
  static TwoTuple<String,Integer> f() {
	  return new TwoTuple<String,Integer>("hi", 47);		// Autoboxing converts the int to Integer:
  }
  static ThreeTuple<Amphibian,String,Integer> g() {
    return new ThreeTuple<Amphibian, String, Integer>( new Amphibian(), "hi", 47);
  }
  static FourTuple<Vehicle,Amphibian,String,Integer> h() {
    return new FourTuple<Vehicle,Amphibian,String,Integer>( new Vehicle(), new Amphibian(), "hi", 47);
  }

  static FiveTuple<Vehicle,Amphibian,String,Integer,Double> k() {
    return new FiveTuple<Vehicle,Amphibian,String,Integer,Double>( new Vehicle(), new Amphibian(), "hi", 47,11.1);
  }

  public static void main(String[] args) {//fghk
    TwoTuple<String,Integer> ttsi = f();//per abbreviare
    System.out.println(ttsi);
    // ttsi.first = "there"; // Compile error: final, non modificabile il mmbro interno di twot.
    System.out.println(g());// stampera indirizzi degli oggetti
    System.out.println(h());
    System.out.println(k());
  }
}
