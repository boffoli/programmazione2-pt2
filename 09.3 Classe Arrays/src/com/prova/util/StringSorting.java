package com.prova.util;
// Sorting an array of Strings.
import com.prova.util.*;
import java.util.*;

public class StringSorting {
	public static void main(String[] args) {
	String[] sa = new String[30];
	Arrays1.fill(sa,new Arrays1.RandStringGenerator(5));
	Arrays1.print("Before sorting: ", sa);
	Arrays1.sort(sa);
	Arrays1.print("After sorting: ", sa);
	}
}
