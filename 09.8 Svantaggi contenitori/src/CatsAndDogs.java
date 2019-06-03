import java.util.*;

public class CatsAndDogs {
	
	public static void main(String[] args) {
		ArrayList cats = new ArrayList();
		for(int i = 0; i < 7; i++)
			cats.add(new Cat(i));	
		cats.add(new Dog(7));		// Non ci sono problemi ad aggiungere un cane a 7  gatti !!
		for(int i = 0; i < cats.size(); i++)
			((Cat)cats.get(i)).print();		// Ma la presenza del cane è rilevata al run-time!
	}
}
