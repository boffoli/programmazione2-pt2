import java.util.*;

public class GenericVarargs {
  public static <T> List<T> makeList(T... args) {	//indicano 1 o piu argomenti dello stesso tipo indicato
    List<T> result = new ArrayList<T>();
    for(T item : args)	//item va associato ogni volta ad args pasati
      result.add(item);
    return result;
  }
  
  public static void main(String[] args) {
    List<String> ls = makeList("A");
    System.out.println(ls);
    ls = makeList("A", "B", "C");
    System.out.println(ls);
    ls = makeList("ABCDEFFHIJKLMNOPQRSTUVWXYZ".split(""));
    System.out.println(ls);
  }
} 
