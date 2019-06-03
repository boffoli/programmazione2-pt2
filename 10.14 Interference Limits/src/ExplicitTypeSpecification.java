//import typeinfo.pets.*;
import java.util.*;
//import net.mindview.util.*;

public class ExplicitTypeSpecification {
  static void f(Map<Person, List<Pet>> petPeople) {}	//tipo map(persone,lista di animali) noe=petPeople
  
  public static void main(String[] args) {
    f(New.<Person, List<Pet>>map());
  }
}//La soluzione a tale problema sta nello specificare esplicitamente il tipo nella invocazione del metodo:
