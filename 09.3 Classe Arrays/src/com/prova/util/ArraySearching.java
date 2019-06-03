// Uso di Arrays.binarySearch().

import com.prova.util.*;
import java.util.*;

public class ArraySearching {
	public static void main(String[] args) {
		int[] a = new int[100];
		Arrays1.RandIntGenerator gen = new Arrays1.RandIntGenerator(1000);
		Arrays1.fill(a, gen);
		Arrays1.sort(a);
		Arrays1.print("Sorted array: ", a);
		while(true) {
			int r = gen.next();
		int location = Arrays1.binarySearch(a, r);
		if(location >= 0) {
			System.out.println("Location of " + r +" is " + location + ", a[" + location + "] = " + a[location]);
			break; // Out of while loop
			}
		}
	}
}