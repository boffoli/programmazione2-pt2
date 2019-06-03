import java.util.*;

class Frob {}
class Fnorkle {}
class Quark<Q> {}//tipo q
class Particle<POSITION,MOMENTUM> {}

public class LostInformation {
  public static void main(String[] args) {
    List<Frob> list = new ArrayList<Frob>();
    Map<Frob,Fnorkle> map = new HashMap<Frob,Fnorkle>();
    Quark<Fnorkle> quark = new Quark<Fnorkle>();
    Particle<Long,Double> p = new Particle<Long,Double>();
    
    System.out.println(Arrays.toString(	list.getClass().getTypeParameters()));//element
    System.out.println(Arrays.toString( map.getClass().getTypeParameters()));//key value
    System.out.println(Arrays.toString( quark.getClass().getTypeParameters()));//template q
    System.out.println(Arrays.toString( p.getClass().getTypeParameters()));// template position momentum
  }
}
